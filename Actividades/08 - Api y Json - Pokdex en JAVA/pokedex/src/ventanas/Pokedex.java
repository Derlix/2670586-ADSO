package ventanas;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.FlowLayout;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.List;
import javax.swing.Box;
import javax.swing.JButton;

public class Pokedex extends javax.swing.JFrame {

    ConsumoAPI consumo = new ConsumoAPI();
    DefaultTableModel modelo;
    String respuesta01 = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon");
    List<Image> imagenesPokemon = new ArrayList<>();
    private int indiceImagenActual = 0;
    int pagina;
    int listaPaginas[];
    int totalPaginas;

    public Pokedex() {
        this.listaPaginas = new int[7];
        this.pagina = 1;
        this.totalPaginas = 66;
        initComponents();
        initAlternComponents();
        this.getContentPane().setBackground(Color.WHITE);
        tablaNombres();
        imprimirNombrePokemonos();
        agregarMouseListenerTabla();
        paginadorMetod();

    }

    public void initAlternComponents() {
        setTitle("POKEDEX");
        Image icono = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png"));
        setIconImage(icono);
        Image iconoCarga = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.gif"));
        Image icono_sin_internet = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/sin_internet.png"));
        icono_sin_internet = icono_sin_internet.getScaledInstance(300, 200, Image.SCALE_SMOOTH);

        imagenAnterior.setEnabled(false);
        siguienteImagen.setEnabled(false);

        Tabla_Habilidades.setEnabled(false);
        Image iconoAnterior = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_atras.png"));
        Image iconoSiguiente = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_siguiente.png"));

        ImageIcon iconoAnteriorIcon = new ImageIcon(iconoAnterior.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        ImageIcon iconoSiguienteIcon = new ImageIcon(iconoSiguiente.getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        imagenAnterior.setBackground(null);
        imagenAnterior.setIcon(iconoAnteriorIcon);
        siguienteImagen.setBackground(null);
        siguienteImagen.setIcon(iconoSiguienteIcon);

        setLocationRelativeTo(null);
        setVisible(true);

        Image IconoPokedex = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokedex.png"));
        etiqueta_pokemon.setIcon(new ImageIcon(IconoPokedex.getScaledInstance(158, 88, Image.SCALE_SMOOTH)));
    }

    public void actualizarTabla(String datosAPI) {
        JsonObject jsonObject = JsonParser.parseString(datosAPI).getAsJsonObject();
        JsonArray registros = jsonObject.getAsJsonArray("results");

        modelo.setRowCount(0);
        for (int i = 0; i < registros.size(); i++) {
            JsonObject registro = registros.get(i).getAsJsonObject();
            String nombrePokemon = registro.get("name").getAsString();
            String urlPokemon = registro.get("url").getAsString();
            modelo.addRow(new Object[]{nombrePokemon, urlPokemon});
        }
    }

    public void paginadorMetod() {
        panelPaginador.removeAll();
        panelPaginador.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton btnPrimerPagina = new JButton("<<");
        panelPaginador.add(btnPrimerPagina);
        btnPrimerPagina.addActionListener(e -> {
            pagina = 1;
            imprimirNombrePokemonos();
        });
        btnPrimerPagina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButton btnAtras = new JButton("<");
        panelPaginador.add(btnAtras);
        btnAtras.addActionListener(e -> {
            if (pagina > 1) {
                pagina--;
                imprimirNombrePokemonos();
            }
        });
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        int maximoBotones = 10;
        int startPage = Math.max(1, pagina - maximoBotones / 2);
        int endPage = Math.min(totalPaginas, startPage + maximoBotones - 1);

        for (int i = startPage; i <= endPage; i++) {
            int numPagina = i;
            JButton btn = new JButton(String.valueOf(numPagina));
            panelPaginador.add(btn);
            btn.addActionListener(e -> {
                pagina = numPagina;
                imprimirNombrePokemonos();
            });
            btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }

        JButton btnSiguiente = new JButton(">");
        panelPaginador.add(btnSiguiente);
        btnSiguiente.addActionListener(e -> {
            if (pagina < totalPaginas) {
                pagina++;
                imprimirNombrePokemonos();
            }
        });
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButton btnUltimaPagina = new JButton(">>");
        panelPaginador.add(btnUltimaPagina);
        btnUltimaPagina.addActionListener(e -> {
            pagina = totalPaginas;
            imprimirNombrePokemonos();
        });
        btnUltimaPagina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPaginador.revalidate();
        panelPaginador.repaint();
    }

    public void tablaNombres() {
        modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Pokemones", "URL"}
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
        int offset = (pagina - 1) * 20;
        String url = "https://pokeapi.co/api/v2/pokemon?offset=" + offset + "&limit=20";
        String respuesta = consumo.consumoGET(url);
        System.out.println("Respuesta Obtener: " + respuesta);

        if (respuesta != null && !respuesta.isEmpty()) {
            JsonObject jsonObject = JsonParser.parseString(respuesta).getAsJsonObject();
            JsonArray registros = jsonObject.getAsJsonArray("results");

            modelo.setRowCount(0);
            for (int i = 0; i < registros.size(); i++) {
                JsonObject registro = registros.get(i).getAsJsonObject();
                String nombrePokemon = registro.get("name").getAsString();
                String urlPokemon = registro.get("url").getAsString();
                modelo.addRow(new Object[]{nombrePokemon, urlPokemon});
            }

            if (registros.size() > 0) {
                JsonObject primerPokemon = registros.get(0).getAsJsonObject();
                String nombrePrimerPokemon = primerPokemon.get("name").getAsString();
                String urlPrimerPokemon = primerPokemon.get("url").getAsString();
                cargarPrimerPokemon(urlPrimerPokemon);
            }
        } else {
            System.out.println("No se pudo obtener respuesta de la API");
        }
    }

    private void cargarPrimerPokemon(String urlPokemon) {
        String respuestaHabilidades = consumo.consumoGET(urlPokemon);
        JsonObject jsonObject = JsonParser.parseString(respuestaHabilidades).getAsJsonObject();
        JsonObject sprites = jsonObject.getAsJsonObject("sprites");

        imagenesPokemon.clear();

        try {
            cargarImagen(sprites, "front_default");
            cargarImagen(sprites, "front_shiny");
            cargarImagen(sprites, "back_default");
            cargarImagen(sprites, "back_shiny");

            indiceImagenActual = 0;
            if (!imagenesPokemon.isEmpty()) {
                Imagen_Pokemon.setIcon(new ImageIcon(imagenesPokemon.get(indiceImagenActual)));
            }
        } catch (IOException ex) {
            Logger.getLogger(Pokedex.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            String nombreHabilidad = habilidadObj.get("name").getAsString();
            String urlHabilidad = habilidadObj.get("url").getAsString();

            Object[] datoHabilidad = new Object[]{i + 1, nombreHabilidad, urlHabilidad};
            modeloHabilidades.addRow(datoHabilidad);
        }

        // Configuración de la tabla de habilidades
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
        TablaHabilidades.setRowHeight(30);
    }

    private void agregarMouseListenerTabla() {
        Tabla_Pokemones.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (pagina < 1) {
                    pagina = 1;
                } else if (pagina > totalPaginas) {
                    pagina = totalPaginas;
                }
                int fila = Tabla_Pokemones.rowAtPoint(e.getPoint());
                if (fila >= 0) {
                    imagenAnterior.setEnabled(true);
                    siguienteImagen.setEnabled(true);
                    String nombrePokemon = (String) modelo.getValueAt(fila, 0);
                    String urlPokemon = (String) modelo.getValueAt(fila, 1);

                    String respuestaHabilidades = consumo.consumoGET(urlPokemon);
                    JsonObject jsonObject = JsonParser.parseString(respuestaHabilidades).getAsJsonObject();
                    JsonObject sprites = jsonObject.getAsJsonObject("sprites");

                    imagenesPokemon.clear();

                    try {

                        cargarImagen(sprites, "front_default");
                        cargarImagen(sprites, "front_shiny");
                        cargarImagen(sprites, "back_default");
                        cargarImagen(sprites, "back_shiny");

                        indiceImagenActual = 0;
                        if (!imagenesPokemon.isEmpty()) {
                            Imagen_Pokemon.setIcon(new ImageIcon(imagenesPokemon.get(indiceImagenActual)));
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Pokedex.class.getName()).log(Level.SEVERE, null, ex);
                    }

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
                        String nombreHabilidad = habilidadObj.get("name").getAsString();
                        String urlHabilidad = habilidadObj.get("url").getAsString();

                        Object[] datoHabilidad = new Object[]{i + 1, nombreHabilidad, urlHabilidad};
                        modeloHabilidades.addRow(datoHabilidad);
                    }

                    // Configuración de la tabla de habilidades (sin cambios)
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
                    TablaHabilidades.setRowHeight(30);
                }
            }
        });

    }

    private void cambiarImagen(int direccion) {

        indiceImagenActual += direccion;
        if (indiceImagenActual < 0) {
            indiceImagenActual = imagenesPokemon.size() - 1;
        } else if (indiceImagenActual >= imagenesPokemon.size()) {
            indiceImagenActual = 0;
        }

        Imagen_Pokemon.setIcon(new ImageIcon(imagenesPokemon.get(indiceImagenActual)));
    }

    private void cargarImagen(JsonObject sprites, String key) throws IOException {
        if (sprites.has(key)) {
            String url = sprites.get(key).getAsString();
            if (url != null && !url.isEmpty()) {
                URL imageUrl = new URL(url);
                Image image = ImageIO.read(imageUrl).getScaledInstance(278, 304, Image.SCALE_SMOOTH);
                imagenesPokemon.add(image);
            }
        }
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
        jPanel1 = new javax.swing.JPanel();
        popetas = new javax.swing.JLabel();
        etiqueta_pokemon = new javax.swing.JLabel();
        imagenAnterior = new javax.swing.JButton();
        siguienteImagen = new javax.swing.JButton();
        panelPaginador = new javax.swing.JPanel();

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

        popetas.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        popetas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        popetas.setText("POKEDEX (°□°)");

        etiqueta_pokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(popetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiqueta_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(popetas, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(etiqueta_pokemon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        imagenAnterior.setBorder(null);
        imagenAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagenAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagenAnteriorActionPerformed(evt);
            }
        });

        siguienteImagen.setBorder(null);
        siguienteImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguienteImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteImagenActionPerformed(evt);
            }
        });

        panelPaginador.setLayout(new javax.swing.BoxLayout(panelPaginador, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout PanelContenedorPrincipalLayout = new javax.swing.GroupLayout(PanelContenedorPrincipal);
        PanelContenedorPrincipal.setLayout(PanelContenedorPrincipalLayout);
        PanelContenedorPrincipalLayout.setHorizontalGroup(
            PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(panelPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(ScrollPokemones, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imagenAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Imagen_Pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(siguienteImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(Tabla_Habilidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(53, Short.MAX_VALUE))))))
        );
        PanelContenedorPrincipalLayout.setVerticalGroup(
            PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPokemones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(imagenAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Imagen_Pokemon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelContenedorPrincipalLayout.createSequentialGroup()
                                    .addGap(87, 87, 87)
                                    .addComponent(siguienteImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tabla_Habilidades, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagenAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagenAnteriorActionPerformed
        cambiarImagen(-1);

    }//GEN-LAST:event_imagenAnteriorActionPerformed

    private void siguienteImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteImagenActionPerformed
        cambiarImagen(1);
    }//GEN-LAST:event_siguienteImagenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen_Pokemon;
    private javax.swing.JPanel PanelContenedorPrincipal;
    private javax.swing.JScrollPane ScrollPokemones;
    private javax.swing.JTable TablaHabilidades;
    private javax.swing.JScrollPane Tabla_Habilidades;
    private javax.swing.JTable Tabla_Pokemones;
    private javax.swing.JLabel etiqueta_pokemon;
    private javax.swing.JButton imagenAnterior;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JPanel panelPaginador;
    private javax.swing.JLabel popetas;
    private javax.swing.JButton siguienteImagen;
    // End of variables declaration//GEN-END:variables
}
