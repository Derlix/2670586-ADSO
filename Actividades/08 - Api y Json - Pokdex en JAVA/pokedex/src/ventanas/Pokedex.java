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
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

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
        
        imagenAnterior.setEnabled(false);
        siguienteImagen.setEnabled(false);
        
        Tabla_Habilidades.setEnabled(false);
        Image iconoAnterior = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_atras.png"));
        Image iconoSiguiente = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_siguiente.png"));
        
//        imagenAnterior.setIcon((Icon) iconoAnterior);
//        siguienteImagen.setIcon((Icon) siguienteImagen);
        setLocationRelativeTo(null);
        setVisible(true);
        
//        Image IconoPokedex = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokedex.png"));
//        etiqueta_pokemon.setIcon((Icon) IconoPokedex);
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
                    imagenAnterior.setEnabled(true);
                    siguienteImagen.setEnabled(true);
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
                    
                    
                    JsonObject sprites = jsonObject.getAsJsonObject("sprites");
                    String imagenUrl = sprites.get("front_default").getAsString();
                    
                    try {
                        URL url = new URL(imagenUrl);
                        Image imagen = ImageIO.read(url);
                        Image imagenEscalada = imagen.getScaledInstance(600,500,Image.SCALE_SMOOTH);
                        
                        Imagen_Pokemon.setIcon(new ImageIcon(imagenEscalada));
                        
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(Pokedex.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Pokedex.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    
                    for (int i = 0; i < habilidades.size(); i++) {
                        JsonObject habilidadObj = habilidades.get(i).getAsJsonObject().getAsJsonObject("ability");
                        String nombreHabilidad = habilidadObj.get("name").getAsString();
                        String urlHabilidad = habilidadObj.get("url").getAsString();

                        Object[] datoHabilidad = new Object[]{i + 1, nombreHabilidad, urlHabilidad};
                        modeloHabilidades.addRow(datoHabilidad);
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
        Tabla_Pokemones.addMouseListener(new MouseAdapter(){
            
            public void MouseClicked(MouseEvent e){
                int fila = Tabla_Pokemones.rowAtPoint(e.getPoint());
                Tabla_Pokemones.setBackground(Color.red);
                if (fila >= 0) {
                    
                }
            }
        });
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        PanelContenedorPrincipal = new javax.swing.JPanel();
        Tabla_Habilidades = new javax.swing.JScrollPane();
        TablaHabilidades = new javax.swing.JTable();
        ScrollPokemones = new javax.swing.JScrollPane();
        Tabla_Pokemones = new javax.swing.JTable();
        Imagen_Pokemon = new javax.swing.JLabel();
        siguienteImagen = new javax.swing.JToggleButton();
        imagenAnterior = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        etiqueta_pokemon = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelContenedorPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        TablaHabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

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

        Imagen_Pokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen_Pokemon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiqueta_pokemon.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        etiqueta_pokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_pokemon.setText("POKEDEX (°□°)");
        etiqueta_pokemon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta_pokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta_pokemon, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelContenedorPrincipalLayout = new javax.swing.GroupLayout(PanelContenedorPrincipal);
        PanelContenedorPrincipal.setLayout(PanelContenedorPrincipalLayout);
        PanelContenedorPrincipalLayout.setHorizontalGroup(
            PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(ScrollPokemones, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagenAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Tabla_Habilidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(Imagen_Pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(siguienteImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelContenedorPrincipalLayout.setVerticalGroup(
            PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ScrollPokemones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Imagen_Pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(siguienteImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tabla_Habilidades, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(imagenAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
    private javax.swing.JLabel etiqueta_pokemon;
    private javax.swing.JToggleButton imagenAnterior;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JToggleButton siguienteImagen;
    // End of variables declaration//GEN-END:variables
}
