package ventanas;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import utils.ConsumoAPI;

public class VentanaDetalles extends JFrame {

    private String url;
    private ConsumoAPI consumo;

    public VentanaDetalles(String url) throws MalformedURLException {
        this.url = url;
        this.consumo = new ConsumoAPI();
        initComponents(); 
        componenetesAlternos();
        mostrarDetalles();
    }

    public void componenetesAlternos() {
        setTitle("Detalles Digimon");
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void mostrarDetalles() throws MalformedURLException {
        String data = this.consumo.consumoGET(this.url);
        JsonObject jsonObject = JsonParser.parseString(data).getAsJsonObject();

        if (jsonObject != null) {
            String id = jsonObject.get("id").getAsString();
            String nombre = jsonObject.get("name").getAsString();
            String imagenUrl = jsonObject.get("images").getAsJsonArray().get(0).getAsJsonObject().get("href").getAsString();
            String atributo = jsonObject.get("attributes").getAsJsonArray().get(0).getAsJsonObject().get("attribute").getAsString();
            String nivel = jsonObject.get("levels").getAsJsonArray().get(0).getAsJsonObject().get("level").getAsString();
            String tipo = jsonObject.get("types").getAsJsonArray().get(0).getAsJsonObject().get("type").getAsString();
            JsonArray fields = jsonObject.getAsJsonArray("fields");
            JPanel panelFields = new JPanel(new GridLayout(fields.size(), 1));
            mostrarFields.setViewportView(panelFields);

            id_etiqueta.setText(tipo);
            Digimon_nombre.setText(nombre);
            etqMostrarAtributo.setText(atributo);
            etqMostrarLevel.setText(nivel);
            etqTipo.setText(tipo);

            for (int i = 0; i < fields.size(); i++) {
                JsonObject field = fields.get(i).getAsJsonObject();
                String nombreField = field.get("field").getAsString();
                String imagenField = field.get("image").getAsString();

                JLabel labelField = new JLabel(nombreField);
                ImageIcon icon = new ImageIcon(new URL(imagenField));
                Image scaledImage = icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                labelField.setIcon(new ImageIcon(scaledImage));

                panelFields.add(labelField);
            }

            if (imagenUrl != null) {
                try {
                    URL url = new URL(imagenUrl);
                    Image img = ImageIO.read(url);
                    Image scaledImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                    DigimonImagen.setIcon(new ImageIcon(scaledImg));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                DigimonImagen.setText("Imagen no disponible");
            }
        } else {
            Digimon_nombre.setText("No se pudieron obtener los detalles del Digimon");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDetalles = new javax.swing.JPanel();
        Digimon_nombre = new javax.swing.JLabel();
        id_etiqueta = new javax.swing.JLabel();
        DigimonImagen = new javax.swing.JLabel();
        etqNivel = new javax.swing.JLabel();
        etqAtributo = new javax.swing.JLabel();
        etqTipo = new javax.swing.JLabel();
        etqMostrarLevel = new javax.swing.JLabel();
        etqMostrarAtributo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mostrarFields = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelDetalles.setBackground(new java.awt.Color(255, 255, 255));

        Digimon_nombre.setText("jLabel1");

        id_etiqueta.setText("jLabel2");

        DigimonImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DigimonImagen.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        etqNivel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqNivel.setText("Level");

        etqAtributo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqAtributo.setText("Atributo");

        etqTipo.setText("Tipo");

        etqMostrarLevel.setText("jLabel4");

        etqMostrarAtributo.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Tipo");

        javax.swing.GroupLayout panelDetallesLayout = new javax.swing.GroupLayout(panelDetalles);
        panelDetalles.setLayout(panelDetallesLayout);
        panelDetallesLayout.setHorizontalGroup(
            panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetallesLayout.createSequentialGroup()
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(DigimonImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(mostrarFields, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetallesLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(etqNivel)
                                .addGap(59, 59, 59)
                                .addComponent(etqAtributo))
                            .addGroup(panelDetallesLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(etqMostrarLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqMostrarAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetallesLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel6))
                            .addGroup(panelDetallesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etqTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDetallesLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Digimon_nombre)
                            .addComponent(id_etiqueta))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelDetallesLayout.setVerticalGroup(
            panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetallesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(id_etiqueta)
                .addGap(18, 18, 18)
                .addComponent(Digimon_nombre)
                .addGap(18, 18, 18)
                .addComponent(DigimonImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNivel)
                    .addComponent(etqAtributo)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqMostrarAtributo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etqMostrarLevel)
                    .addComponent(etqTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(mostrarFields, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetalles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DigimonImagen;
    private javax.swing.JLabel Digimon_nombre;
    private javax.swing.JLabel etqAtributo;
    private javax.swing.JLabel etqMostrarAtributo;
    private javax.swing.JLabel etqMostrarLevel;
    private javax.swing.JLabel etqNivel;
    private javax.swing.JLabel etqTipo;
    private javax.swing.JLabel id_etiqueta;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane mostrarFields;
    private javax.swing.JPanel panelDetalles;
    // End of variables declaration//GEN-END:variables
}
