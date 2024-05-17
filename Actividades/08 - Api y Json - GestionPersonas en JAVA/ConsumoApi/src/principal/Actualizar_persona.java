package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import util.ConsumoAPI;

public class Actualizar_persona extends javax.swing.JFrame {

    ConsumoAPI consumo = new ConsumoAPI();
    public Actualizar_persona() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nuevotelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Nuevosapellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nuevonombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Nuevoemail = new javax.swing.JTextField();
        Nuevacedula = new javax.swing.JTextField();
        ActualizarPersona = new javax.swing.JToggleButton();
        Nuevadireccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Ingresa el nuevo email ↓");

        jLabel5.setText("Ingresa tu nueva direccion ↓");

        jLabel4.setText("Ingresa el nuevo telefono ↓");

        jLabel2.setText("Ingresa e nuevo apellido(s) ↓");

        Nuevonombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevonombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresa el nuvo nombre(s) ↓");

        Nuevacedula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ActualizarPersona.setText("Aceptar");
        ActualizarPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActualizarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarPersonaActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresa la cedula de la persona a actualizar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Nuevacedula, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nuevonombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nuevosapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nuevoemail, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Nuevotelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jLabel1)))
                                    .addGap(8, 8, 8))
                                .addComponent(Nuevadireccion))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(ActualizarPersona)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nuevacedula, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nuevonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(Nuevosapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nuevotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nuevadireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nuevoemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ActualizarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarPersonaActionPerformed
        Map<String,String> datosActualizar = new HashMap<>();
        datosActualizar.put("cedula",Nuevacedula.getText());
        datosActualizar.put("nombres",Nuevonombre.getText());
        datosActualizar.put("apellidos", Nuevosapellidos.getText());
        datosActualizar.put("telefono", Nuevotelefono.getText());
        datosActualizar.put("direccion", Nuevadireccion.getText());
        datosActualizar.put("email", Nuevoemail.getText());
        
        if (Nuevacedula.getText().equalsIgnoreCase("") && Nuevonombre.getText().equalsIgnoreCase("") && Nuevotelefono.getText().equalsIgnoreCase("") && Nuevosapellidos.getText().equalsIgnoreCase("") && Nuevoemail.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null,"Todos los campos son requeridos");
        } else {
            String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php",datosActualizar);

        }
        
        
        Nuevacedula.setText("");
        Nuevonombre.setText("");
        Nuevosapellidos.setText("");
        Nuevotelefono.setText("");
        Nuevadireccion.setText("");
        Nuevoemail.setText("");
        
        this.dispose();
        
    }//GEN-LAST:event_ActualizarPersonaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        System.out.println("Respuesta Obtener: "+ respuesta01 );

        JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
        
        for (int i = 0; i < registros.size(); i++) {
        
            JsonObject temp = registros.get(i).getAsJsonObject();
            String cedula = temp.get("cedula").getAsString();
            String nombre = temp.get("nombres").getAsString();
            String apellidos = temp.get("apellidos").getAsString();
            String telefono = temp.get("telefono").getAsString();
            String direccion = temp.get("direccion").getAsString();
            String email = temp.get("email").getAsString();
            if(cedula.equals(Nuevacedula.getText())){
                Nuevacedula.setText(cedula);
                Nuevonombre.setText(nombre);
                Nuevosapellidos.setText(apellidos);
                Nuevotelefono.setText(telefono);
                Nuevadireccion.setText(direccion);
                Nuevoemail.setText(email);
                break;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NuevonombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevonombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevonombreActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ActualizarPersona;
    private javax.swing.JTextField Nuevacedula;
    private javax.swing.JTextField Nuevadireccion;
    private javax.swing.JTextField Nuevoemail;
    private javax.swing.JTextField Nuevonombre;
    private javax.swing.JTextField Nuevosapellidos;
    private javax.swing.JTextField Nuevotelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
