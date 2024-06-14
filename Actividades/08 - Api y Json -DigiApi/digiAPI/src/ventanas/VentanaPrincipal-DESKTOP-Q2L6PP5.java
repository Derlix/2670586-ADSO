package ventanas;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import utils.ConsumoAPI;

public class VentanaPrincipal extends javax.swing.JFrame {

    ConsumoAPI consumo;
    int pagina;
    int listaPaginas[];
    int totalPaginas;
    List<Image> imagenesPokemon = new ArrayList<>();

    public VentanaPrincipal() {
        this.consumo = new ConsumoAPI();
        this.listaPaginas = new int[7];
        this.pagina = 0;
        this.totalPaginas = 291;
        initComponents();
        componentesAlternos();
        cargarPaginador();
        cargarDigimon();
        this.getContentPane().setBackground(Color.WHITE);
    }

    public void componentesAlternos() {
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Digi API");
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono.jpg")));
        setResizable(false);
    }

    public void cargarDigimon() {
        if (pagina < 1) {
            pagina = 0;
        } else if (pagina > totalPaginas) {
            pagina = totalPaginas;
        }
        String endpoint = "https://digi-api.com/api/v1/digimon?page=" + pagina;
        String data = this.consumo.consumoGET(endpoint);
        panelMostrar.setLayout(new GridLayout(2, 3, 10, 10));
        panelMostrar.removeAll();

        System.out.println(data);

        JsonObject jsonObject = JsonParser.parseString(data).getAsJsonObject();
        JsonArray registros = jsonObject.getAsJsonArray("content");

        for (int i = 0; i < 5; i++) {
            JsonObject registro = registros.get(i).getAsJsonObject();
            String nombreDigimon = registro.get("name").getAsString();
            String urlDigimon = registro.get("href").getAsString();
            String imagenDigimon = registro.get("image").getAsString();

            Icon imagen = cargarImagen(imagenDigimon);
            JPanel panelDigimon = new JPanel(new BorderLayout());
            JLabel digimonName = new JLabel(nombreDigimon, SwingConstants.CENTER);
            JLabel digimonImage = new JLabel(imagen);

            panelDigimon.add(digimonName, BorderLayout.NORTH);
            panelDigimon.add(digimonImage, BorderLayout.CENTER);
            panelDigimon.setBackground(Color.WHITE);
            panelDigimon.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panelDigimon.setPreferredSize(new Dimension(200, 250));

            panelDigimon.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    panelDigimon.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    panelDigimon.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }

                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        VentanaDetalles ventana = new VentanaDetalles(urlDigimon);
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });

            panelMostrar.add(panelDigimon);
        }

        repaint();
        revalidate();
    }

    private Icon cargarImagen(String url) {
        try {
            Image img = ImageIO.read(new URL(url));
            Image imagenEscalada = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            return new ImageIcon(imagenEscalada);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void cargarPaginador() {
        panelPaginador.setLayout(new GridLayout(1, 6));
        panelPaginador.removeAll();

        JButton btnPrimerPagina = new JButton("<<");
        panelPaginador.add(btnPrimerPagina);
        btnPrimerPagina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = 0;
                cargarDigimon();
            }
        });
        btnPrimerPagina.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPrimerPagina.setBorderPainted(false);
        btnPrimerPagina.setBackground(Color.LIGHT_GRAY);

        JButton btnAtras = new JButton("<");
        panelPaginador.add(btnAtras);
        btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pagina > 1) {
                    pagina--;
                    cargarDigimon();
                }
            }
        });
        btnAtras.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAtras.setBorderPainted(false); 
        btnAtras.setBackground(Color.LIGHT_GRAY);

        for (int i = 1; i < 7; i++) {
            int numPagina = i;
            JButton btn = new JButton(String.valueOf(numPagina));
            panelPaginador.add(btn);
            btn.addActionListener(e -> {
                pagina = numPagina;
                cargarDigimon();
            });
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            btn.setBorderPainted(false); 
            btn.setBackground(Color.LIGHT_GRAY);
        }

        JButton btnSiguiente = new JButton(">");
        panelPaginador.add(btnSiguiente);
        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pagina < totalPaginas) {
                    pagina++;
                    cargarDigimon();
                }
            }
        });
        btnSiguiente.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSiguiente.setBorderPainted(false); 
        btnSiguiente.setBackground(Color.LIGHT_GRAY);

        JButton btnUltimaPagina = new JButton(">>");
        panelPaginador.add(btnUltimaPagina);
        btnUltimaPagina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = totalPaginas;
                cargarDigimon();
            }
        });
        btnUltimaPagina.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnUltimaPagina.setBorderPainted(false); 
        btnUltimaPagina.setBackground(Color.LIGHT_GRAY);

        repaint();
        revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMostrar = new javax.swing.JPanel();
        panelPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMostrar.setBackground(new java.awt.Color(255, 255, 255));
        panelMostrar.setLayout(new java.awt.GridBagLayout());

        panelPaginador.setBackground(new java.awt.Color(0, 0, 0));
        panelPaginador.setLayout(new javax.swing.BoxLayout(panelPaginador, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMostrar;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}
