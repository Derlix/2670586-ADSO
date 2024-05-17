package principal;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import util.ConsumoAPI;

public class Insertar_persona extends javax.swing.JFrame {

    ConsumoAPI consumo = new ConsumoAPI();

    public Insertar_persona() {
        setTitle("Insertar Persona");
        setVisible(true);
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IngresarPersona = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresa tu nombre(s):");

        jLabel2.setText("Ingresa tus apellidos:");

        jLabel3.setText("Ingresa tu  cedula:");

        jLabel4.setText("Ingresa tu telefono:");

        jLabel5.setText("Ingresa tu direccion:");

        jLabel6.setText("Ingresa tu email:");

        IngresarPersona.setText("Aceptar");
        IngresarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarPersonaActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Cancelar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IngresarPersona)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1))
                    .addComponent(email)
                    .addComponent(direccion)
                    .addComponent(telefono)
                    .addComponent(apellidos)
                    .addComponent(nombre)
                    .addComponent(cedula))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresarPersona)
                    .addComponent(jToggleButton1))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    
    
    private void IngresarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarPersonaActionPerformed
        Map<String, String> datosInsertar = new HashMap<>();
        datosInsertar.put("cedula", cedula.getText());
        datosInsertar.put("nombres", nombre.getText());
        datosInsertar.put("apellidos", apellidos.getText());
        datosInsertar.put("telefono", telefono.getText());
        datosInsertar.put("direccion", direccion.getText());
        datosInsertar.put("email", email.getText());
        if (cedula.getText().equalsIgnoreCase("") && nombre.getText().equalsIgnoreCase("") && telefono.getText().equalsIgnoreCase("") && apellidos.getText().equalsIgnoreCase("") && email.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null,"Todos los campos son requeridos");
        } else {
            String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php", datosInsertar);
            System.out.println("Respuesta insertar" + respuesta02);
        }

        cedula.setText("");
        nombre.setText("");
        apellidos.setText("");
        telefono.setText("");
        direccion.setText("");
        email.setText("");
        
        

    }//GEN-LAST:event_IngresarPersonaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton IngresarPersona;
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
