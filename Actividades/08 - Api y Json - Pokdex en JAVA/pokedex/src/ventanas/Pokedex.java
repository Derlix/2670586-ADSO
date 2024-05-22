package ventanas;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import util.ConsumoAPI;

public class Pokedex extends javax.swing.JFrame {

    ConsumoAPI consumo = new ConsumoAPI();
    DefaultTableModel modelo;

    public Pokedex() {
        initComponents();
        initAlternComponents();
        this.getContentPane().setBackground(Color.WHITE);
        tablaNombres();
        imprimirNombrePokemonos();
        agregarMouseListenerTabla();
        
    }

    public void initAlternComponents() {
        setTitle("POKEDEX");
        Image icono = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png"));
        setIconImage(icono);
        Image iconoCarga = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.gif"));
        Image icono_sin_internet = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/sin_internet.png"));
        icono_sin_internet = icono_sin_internet.getScaledInstance(300, 200, 4);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void tablaNombres() {
        modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Nombre de los pokemones", "URL"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Tabla_Pokemones.setModel(modelo);

        // Tamaño de columnas
        Tabla_Pokemones.getColumnModel().getColumn(0).setPreferredWidth(150);
        Tabla_Pokemones.getColumnModel().getColumn(1).setMinWidth(0);
        Tabla_Pokemones.getColumnModel().getColumn(1).setMaxWidth(0);

        Tabla_Pokemones.getTableHeader().setReorderingAllowed(false);
        Tabla_Pokemones.getTableHeader().setResizingAllowed(false);
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        Tabla_Pokemones.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        // Alto de las filas
        Tabla_Pokemones.setRowHeight(30);
    }

    public void imprimirNombrePokemonos() {
        String respuesta01 = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon");
        System.out.println("Respuesta Obtener: " + respuesta01);

        modelo.setRowCount(0);
        JsonObject jsonObject = JsonParser.parseString(respuesta01).getAsJsonObject();
        JsonArray registros = jsonObject.getAsJsonArray("results");

        for (int i = 0; i < registros.size(); i++) {
            JsonObject temp = registros.get(i).getAsJsonObject();
            String nombrePokemon = temp.get("name").getAsString();
            String urlPokemon = temp.get("url").getAsString();

            Object dato[] = new Object[]{nombrePokemon, urlPokemon};
            modelo.addRow(dato);
        }
    }

    private void agregarMouseListenerTabla() {
        Tabla_Pokemones.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = Tabla_Pokemones.rowAtPoint(e.getPoint());
                if (fila >= 0) {
                    String nombrePokemon = (String) modelo.getValueAt(fila, 0);
                    String urlPokemon = (String) modelo.getValueAt(fila, 1);
                    System.out.println("Nombre del Pokémon seleccionado: " + nombrePokemon + ", URL: " + urlPokemon);

                    String respuestaHabilidades = consumo.consumoGET(urlPokemon);
                    System.out.println("Respuesta Habilidades: " + respuestaHabilidades);

                    JsonObject jsonObject = JsonParser.parseString(respuestaHabilidades).getAsJsonObject();
                    JsonArray habilidades = jsonObject.getAsJsonArray("abilities");

                    DefaultTableModel modeloHabilidades = new DefaultTableModel(
                            new Object[][]{},
                            new String[]{"N#", "Habilidad", "URL"}
                    ) {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                            return false;
                        }
                    };

                    TablaHabilidades.setModel(modeloHabilidades);

                    for (int i = 0; i < habilidades.size(); i++) {
                        JsonObject habilidadObj = habilidades.get(i).getAsJsonObject().getAsJsonObject("ability");
                        JsonObject imagen = habilidades.get(i).getAsJsonObject().getAsJsonObject("dream_world");
                        String nombreHabilidad = habilidadObj.get("name").getAsString();
                        String urlHabilidad = habilidadObj.get("url").getAsString();
                        String extaerImg = imagen.get("front_default").getAsString();

                        Object[] datoHabilidad = new Object[]{i + 1, nombreHabilidad, urlHabilidad};
                        modeloHabilidades.addRow(datoHabilidad);
                        Imagen_Pokemon.setIcon(extaerImg);
                    }

                    // Tamaño de columnas
                    TablaHabilidades.getColumnModel().getColumn(0).setPreferredWidth(50);
                    TablaHabilidades.getColumnModel().getColumn(1).setPreferredWidth(150);
                    TablaHabilidades.getColumnModel().getColumn(2).setPreferredWidth(300);

                    TablaHabilidades.getTableHeader().setReorderingAllowed(false);
                    TablaHabilidades.getTableHeader().setResizingAllowed(false);
                    DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
                    centerRender.setHorizontalAlignment(SwingConstants.CENTER);
                    TablaHabilidades.getColumnModel().getColumn(0).setCellRenderer(centerRender);
                    TablaHabilidades.getColumnModel().getColumn(1).setCellRenderer(centerRender);
                    TablaHabilidades.getColumnModel().getColumn(2).setCellRenderer(centerRender);

                    // Alto de las filas
                    TablaHabilidades.setRowHeight(30);
                }
            }
        });
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedorPrincipal = new javax.swing.JPanel();
        Tabla_Habilidades = new javax.swing.JScrollPane();
        TablaHabilidades = new javax.swing.JTable();
        ScrollPokemones = new javax.swing.JScrollPane();
        Tabla_Pokemones = new javax.swing.JTable();
        Imagen_Pokemon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaHabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        Tabla_Habilidades.setViewportView(TablaHabilidades);

        Tabla_Pokemones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        Tabla_Pokemones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ScrollPokemones.setViewportView(Tabla_Pokemones);

        Imagen_Pokemon.setText("jLabel1");
        Imagen_Pokemon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelContenedorPrincipalLayout = new javax.swing.GroupLayout(PanelContenedorPrincipal);
        PanelContenedorPrincipal.setLayout(PanelContenedorPrincipalLayout);
        PanelContenedorPrincipalLayout.setHorizontalGroup(
            PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorPrincipalLayout.createSequentialGroup()
                .addGroup(PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelContenedorPrincipalLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(ScrollPokemones, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)
                        .addComponent(Imagen_Pokemon, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                    .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tabla_Habilidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(167, 167, 167))
        );
        PanelContenedorPrincipalLayout.setVerticalGroup(
            PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorPrincipalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrollPokemones)
                    .addComponent(Imagen_Pokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Tabla_Habilidades, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen_Pokemon;
    private javax.swing.JPanel PanelContenedorPrincipal;
    private javax.swing.JScrollPane ScrollPokemones;
    private javax.swing.JTable TablaHabilidades;
    private javax.swing.JScrollPane Tabla_Habilidades;
    private javax.swing.JTable Tabla_Pokemones;
    // End of variables declaration//GEN-END:variables
}
