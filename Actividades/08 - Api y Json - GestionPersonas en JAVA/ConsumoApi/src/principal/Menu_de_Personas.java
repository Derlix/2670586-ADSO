
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import util.ConsumoAPI;


public class Menu_de_Personas extends javax.swing.JFrame {

    DefaultTableModel modelo;
    ConsumoAPI consumo = new ConsumoAPI();
    public Menu_de_Personas() {
        initComponents();
        setVisible(true);
        
        setLocationRelativeTo(null);
        setResizable(false);
        revalidate();
        altertComponents();
        imprimirPersonas();
        botonInsertar.setBackground(null);
    }

   public void altertComponents(){
        modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Documento","Nombres","Apellidos","Telefono","Direccion","Correo Electronico"}
        );
        
        tabla_Datos.setModel(modelo);
        
        //Tamano de columnas
        tabla_Datos.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabla_Datos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabla_Datos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabla_Datos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tabla_Datos.getColumnModel().getColumn(4).setPreferredWidth(150);
        tabla_Datos.getColumnModel().getColumn(5).setPreferredWidth(150);

        tabla_Datos.getTableHeader().setReorderingAllowed(false);
        tabla_Datos.getTableHeader().setResizingAllowed(false);
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_Datos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tabla_Datos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        //alto de las filas
        tabla_Datos.setRowHeight(30);
    }
   
   
   public void imprimirPersonas(){
        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        System.out.println("Respuesta Obtener: "+ respuesta01 );

        modelo.setRowCount(0);
        JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
        
        for (int i = 0; i < registros.size(); i++) {
        
            JsonObject temp = registros.get(i).getAsJsonObject();
            String cedula = temp.get("cedula").getAsString();
            String nombre = temp.get("nombres").getAsString();
            String apellidos = temp.get("apellidos").getAsString();
            String telefono = temp.get("telefono").getAsString();
            String direccion = temp.get("direccion").getAsString();
            String email = temp.get("email").getAsString();
            System.out.println(nombre + apellidos);
            Object dato []= new Object[]{cedula,nombre,apellidos,telefono,direccion,email};
            modelo.addRow(dato);
            
        
        }
        
       
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        botonInsertar = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Datos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        campo_eliminar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        botonInsertar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonInsertar.setText("INSERTAR PERSONA");
        botonInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        tabla_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Telefono", "Correo Electronico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_Datos);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ELIMINAR PERSONA POR CEDULA");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EDITAR PERSONA");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        campo_eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setText("INGRESA LA CEDULA DE LA PERSONA QUE DESEAS ELIMINAR");

        jButton3.setBackground(new java.awt.Color(0, 255, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("LOAD");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(campo_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Insertar_persona ventana = new Insertar_persona();
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Actualizar_persona ventana = new Actualizar_persona();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Endpoint eliminar
        
        Map<String,String> datosEliminar = new HashMap<>();
        datosEliminar.put("cedula",campo_eliminar.getText());    //Aqui mandamos el endpoint segun la funcion que queramos hacer ↓
        String respuesta04 = consumo.consumoPOST("https://codetesthub.com/API/Eliminar.php",datosEliminar);
        System.out.println("Respuesta actualizar" + respuesta04);
        imprimirPersonas();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        imprimirPersonas();
    }//GEN-LAST:event_jButton3ActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonInsertar;
    private javax.swing.JTextField campo_eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tabla_Datos;
    // End of variables declaration//GEN-END:variables
}
