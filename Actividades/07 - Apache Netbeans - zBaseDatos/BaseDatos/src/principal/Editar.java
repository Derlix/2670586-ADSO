
package principal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import tipografias.Fuentes;
import utils.BaseDatos;
import utils.Persona;


public class Editar extends javax.swing.JFrame {
    
    BaseDatos bd = new BaseDatos();
    Fondopanel fondo = new Fondopanel();
    Fuentes fuenteTipo;
    public Editar() {
        fuenteTipo = new Fuentes();
        this.setContentPane(fondo);
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Edicion de Persona");
        contenedorEdicion.setOpaque(false);
        contenedorBsq.setOpaque(false);
        buscar.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 1, 14));
        etq_Bsq.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 1, 20));
        etq_apellidos.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 0, 20));
        etq_nombres.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 0, 20));
        etq_telefono.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 0, 20));
        etq_direccion.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 0, 20));
        etq_correo.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 0, 20));
        etq_documento.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 0, 20));
        completarEdit.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 1, 20));
        jLabel1.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 1, 20));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorEdicion =  new RoundedPanel(50, Color.PINK);
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
        contenedorBsq = new RoundedPanel(50, Color.LIGHT_GRAY);
        etq_Bsq = new javax.swing.JLabel();
        buscar = new javax.swing.JToggleButton();
        campoBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap()
                .addGroup(contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDoc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorEdicionLayout.createSequentialGroup()
                        .addGroup(contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_apellidos)
                            .addComponent(etq_telefono)
                            .addComponent(etq_direccion)
                            .addComponent(etq_correo)
                            .addComponent(etq_documento)
                            .addComponent(etq_nombres))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(campoApe, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoTele, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoDirec, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(contenedorEdicionLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(completarEdit)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        contenedorEdicionLayout.setVerticalGroup(
            contenedorEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorEdicionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(etq_documento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoApe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTele, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(completarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Persona a Editar");

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
                        .addComponent(jLabel1)))
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
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorBsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorBsqLayout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contenedorBsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenedorBsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String cedulaBusqueda = campoBusqueda.getText();
        Persona persona = bd.buscarPorcedula(cedulaBusqueda);
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
        bd.buscarPorcedula(cedulaBusqueda);
    }//GEN-LAST:event_buscarActionPerformed

    private void completarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarEditActionPerformed
        String cedulaBusqueda = campoBusqueda.getText();
        String cedula = campoDoc.getText();
        String nombres = campoName.getText();
        String apellidos = campoApe.getText();
        String tlefono = campoTele.getText();
        String direccion = campoDirec.getText();
        String email = campoEmail.getText();
        
        bd.actualizarPersona(cedulaBusqueda,cedula, nombres, apellidos, tlefono, direccion, email);
    }//GEN-LAST:event_completarEditActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNameActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar().setVisible(true);
            }
        });
    }
    
    class RoundedPanel extends JPanel{
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
  
    } 
    
    class Fondopanel extends JPanel{
        private Image imgFondo;
        @Override
        public void paint(Graphics g){
            imgFondo = new ImageIcon(getClass().getResource("/imagenes/editarFondo.jpeg")).getImage();
        
            g.drawImage(imgFondo,0, 0,getWidth(),getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

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
    // End of variables declaration//GEN-END:variables
}
