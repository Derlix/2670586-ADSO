package principal;

import utils.BaseDatos;
import utils.Persona;


public class PanelEditar extends javax.swing.JPanel {

    BaseDatos DB;
    public PanelEditar(BaseDatos DB) {
        this.DB = DB;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        contenedorEdicion = new javax.swing.JPanel();
        completarEdit = new javax.swing.JToggleButton();
        campoDoc = new javax.swing.JTextField();
        campoName = new javax.swing.JTextField();
        campoApe = new javax.swing.JTextField();
        campoTele = new javax.swing.JTextField();
        campoDirec = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        etq_documento = new javax.swing.JLabel();
        etq_nombres = new javax.swing.JLabel();
        etq_apellidos = new javax.swing.JLabel();
        etq_telefono = new javax.swing.JLabel();
        etq_direccion = new javax.swing.JLabel();
        etq_correo = new javax.swing.JLabel();
        contenedorBsq = new javax.swing.JPanel();
        etq_Bsq = new javax.swing.JLabel();
        buscar = new javax.swing.JToggleButton();
        campoBusqueda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PANEL EDITAR");

        contenedorEdicion.setBackground(new java.awt.Color(255, 204, 204));

        completarEdit.setText("CONFIRMAR EDICION");
        completarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completarEditActionPerformed(evt);
            }
        });

        campoDoc.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        campoName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        campoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNameActionPerformed(evt);
            }
        });

        campoApe.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        campoTele.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        campoDirec.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });

        etq_documento.setText("Documento:");

        etq_nombres.setText("Nombres:");

        etq_apellidos.setText("Apellidos:");

        etq_telefono.setText("Telefono:");

        etq_direccion.setText("Direccion:");

        etq_correo.setText("Correo Electronico:");

        javax.swing.GroupLayout contenedorEdicionLayout = new javax.swing.GroupLayout(contenedorEdicion);
        contenedorEdicion.setLayout(contenedorEdicionLayout);
        contenedorEdicionLayout.setHorizontalGroup(
            contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorEdicionLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(completarEdit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenedorEdicionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campoApe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(campoName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_apellidos, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_documento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_nombres, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDoc, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoEmail)
                        .addComponent(etq_correo))
                    .addComponent(etq_telefono)
                    .addGroup(contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoDirec)
                        .addComponent(campoTele, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                    .addComponent(etq_direccion))
                .addGap(124, 124, 124))
        );
        contenedorEdicionLayout.setVerticalGroup(
            contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorEdicionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorEdicionLayout.createSequentialGroup()
                        .addComponent(etq_documento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorEdicionLayout.createSequentialGroup()
                        .addComponent(etq_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTele, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorEdicionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etq_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etq_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoApe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorEdicionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etq_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(completarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );

        contenedorBsq.setBackground(new java.awt.Color(204, 204, 255));

        etq_Bsq.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_Bsq.setText("Ingresa el Documento de la ");

        buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        campoBusqueda.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Persona a Editar");

        javax.swing.GroupLayout contenedorBsqLayout = new javax.swing.GroupLayout(contenedorBsq);
        contenedorBsq.setLayout(contenedorBsqLayout);
        contenedorBsqLayout.setHorizontalGroup(
            contenedorBsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorBsqLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(contenedorBsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_Bsq)
                    .addGroup(contenedorBsqLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorBsqLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar)
                .addGap(25, 25, 25))
        );
        contenedorBsqLayout.setVerticalGroup(
            contenedorBsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorBsqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_Bsq, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorBsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorBsqLayout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(contenedorBsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenedorEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contenedorBsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void completarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarEditActionPerformed
        String cedulaBusqueda = campoBusqueda.getText();
        String cedula = campoDoc.getText();
        String nombres = campoName.getText();
        String apellidos = campoApe.getText();
        String tlefono = campoTele.getText();
        String direccion = campoDirec.getText();
        String email = campoEmail.getText();
        

        if( cedula.equals("") || nombres.equals("") || apellidos.equals("") || tlefono.equals("") || email.equals("") ){
           Alerta ventana = new Alerta();
            System.out.println("RELLENA LOS CAMPOS");
        }else{
            DB.actualizarPersona(cedulaBusqueda,cedula, nombres, apellidos, tlefono, direccion, email);
        }

        
    }//GEN-LAST:event_completarEditActionPerformed

    private void campoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNameActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String cedulaBusqueda = campoBusqueda.getText();
        Persona persona = DB.buscarPorcedula(cedulaBusqueda);
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
        DB.buscarPorcedula(cedulaBusqueda);
    }//GEN-LAST:event_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buscar;
    private javax.swing.JTextField campoApe;
    private javax.swing.JTextField campoBusqueda;
    private javax.swing.JTextField campoDirec;
    private javax.swing.JTextField campoDoc;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoName;
    private javax.swing.JTextField campoTele;
    private javax.swing.JToggleButton completarEdit;
    private javax.swing.JPanel contenedorBsq;
    private javax.swing.JPanel contenedorEdicion;
    private javax.swing.JLabel etq_Bsq;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_documento;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
