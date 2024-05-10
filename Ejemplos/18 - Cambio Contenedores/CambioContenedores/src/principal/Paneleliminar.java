
package principal;

import utils.BaseDatos;
import utils.Persona;


public class Paneleliminar extends javax.swing.JPanel {
    BaseDatos DB;
    public Paneleliminar(BaseDatos DB) {
        this.DB = DB;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelEliminar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoBusqueda = new javax.swing.JTextField();
        eliminar = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        campoTele = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        campoDoc = new javax.swing.JTextField();
        etq_documento = new javax.swing.JLabel();
        campoName = new javax.swing.JTextField();
        etq_nombres = new javax.swing.JLabel();
        etq_direccion = new javax.swing.JLabel();
        campoDirec = new javax.swing.JTextField();
        campoApe = new javax.swing.JTextField();
        etq_apellidos = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        etq_correo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PANEL ELIMINAR");

        panelEliminar.setBackground(new java.awt.Color(51, 102, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingresa el documento de la persona que deseas eliminar");

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jToggleButton1.setText("BUSCAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        campoTele.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        etq_telefono.setText("Telefono:");

        campoDoc.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        etq_documento.setText("Documento:");

        campoName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        campoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNameActionPerformed(evt);
            }
        });

        etq_nombres.setText("Nombres:");

        etq_direccion.setText("Direccion:");

        campoDirec.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        campoApe.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        etq_apellidos.setText("Apellidos:");

        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });

        etq_correo.setText("Correo Electronico:");

        javax.swing.GroupLayout panelEliminarLayout = new javax.swing.GroupLayout(panelEliminar);
        panelEliminar.setLayout(panelEliminarLayout);
        panelEliminarLayout.setHorizontalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEliminarLayout.createSequentialGroup()
                        .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEliminarLayout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEliminarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEliminarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelEliminarLayout.createSequentialGroup()
                                        .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(etq_apellidos)
                                            .addComponent(etq_documento)
                                            .addComponent(etq_nombres)
                                            .addComponent(campoName, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                            .addComponent(campoDoc)
                                            .addComponent(campoApe))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(campoDirec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                            .addComponent(etq_direccion, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etq_correo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etq_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoTele, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoEmail))))))
                        .addGap(0, 286, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEliminarLayout.setVerticalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEliminarLayout.createSequentialGroup()
                        .addComponent(etq_documento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoApe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEliminarLayout.createSequentialGroup()
                        .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEliminarLayout.createSequentialGroup()
                                .addComponent(etq_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTele, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etq_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEliminarLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(etq_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(eliminar)
                .addGap(261, 261, 261))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(623, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        String cedulaField = campoBusqueda.getText();

        DB.eliminarPersona(cedulaField);
    }//GEN-LAST:event_eliminarActionPerformed

    private void campoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNameActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String cedulaBusqueda = campoBusqueda.getText();
        Persona persona = DB.buscarPorcedula(cedulaBusqueda);
        if( cedulaBusqueda.equals("") ){
           Alerta ventana = new Alerta();
           System.out.println("RELLENA LOS CAMPOS");
        }
        if (persona != null) {
            // Si se encuentra la persona, establecer los valores en los campos correspondientes
            campoDoc.setText(persona.getDocumento());
            campoName.setText(persona.getNombres());
            campoApe.setText(persona.getApellidos());
            campoTele.setText(persona.getTelefono());
            campoDirec.setText(persona.getDireccion());
            campoEmail.setText(persona.getCorreo());
        } else {
            // Si no se encuentra la persona, limpiar los campos
            campoDoc.setText("");
            campoName.setText("");
            campoApe.setText("");
            campoTele.setText("");
            campoDirec.setText("");
            campoEmail.setText("");
        }
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoApe;
    private javax.swing.JTextField campoBusqueda;
    private javax.swing.JTextField campoDirec;
    private javax.swing.JTextField campoDoc;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoName;
    private javax.swing.JTextField campoTele;
    private javax.swing.JToggleButton eliminar;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_documento;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel panelEliminar;
    // End of variables declaration//GEN-END:variables
}
