/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import utils.Agregar;


public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        componentesAlternos();
    }
    
     private void componentesAlternos() {
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Opciones de Menu ");
        
        //Colocando imagen a boton Agregar
        Image icono_crear = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/crear_usuario.png"));
        icono_crear = icono_crear.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        boton_agregar.setIcon(new ImageIcon(icono_crear));
        boton_agregar.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_agregar.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        //Colocando imagen a boton Leer
        Image icono_leer = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/buscar_usuario.png"));
        icono_leer = icono_leer.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        boton_leer.setIcon(new ImageIcon(icono_leer));
        boton_leer.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_leer.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        //Colocando imagen a boton actualizar
        
        Image icono_actualizar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/editar_usuario.png"));
        icono_actualizar = icono_actualizar.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        boton_actualizar.setIcon(new ImageIcon(icono_actualizar));
        boton_actualizar.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_actualizar.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        Image icono_eliminar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/eliminar_usuario.png"));
        icono_eliminar = icono_eliminar.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        boton_eliminar.setIcon(new ImageIcon(icono_eliminar));
        
        boton_eliminar.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_eliminar.setVerticalTextPosition(SwingConstants.BOTTOM);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        boton_agregar = new javax.swing.JToggleButton();
        boton_actualizar = new javax.swing.JToggleButton();
        boton_eliminar = new javax.swing.JToggleButton();
        boton_leer = new javax.swing.JToggleButton();
        etqTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(153, 0, 204));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        boton_agregar.setBackground(new java.awt.Color(236, 207, 253));
        boton_agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_agregar.setForeground(new java.awt.Color(255, 255, 255));
        boton_agregar.setText("AGREGAR");
        boton_agregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });

        boton_actualizar.setBackground(new java.awt.Color(236, 207, 253));
        boton_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        boton_actualizar.setText("ACTUALIZAR");
        boton_actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boton_eliminar.setBackground(new java.awt.Color(236, 207, 253));
        boton_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminar.setText("ELIMINAR");
        boton_eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boton_leer.setBackground(new java.awt.Color(236, 207, 253));
        boton_leer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_leer.setForeground(new java.awt.Color(255, 255, 255));
        boton_leer.setText("REVISAR");
        boton_leer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_leer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("MENU");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_leer, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(boton_leer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        Agregar ventana = new Agregar();
    }//GEN-LAST:event_boton_agregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JToggleButton boton_actualizar;
    private javax.swing.JToggleButton boton_agregar;
    private javax.swing.JToggleButton boton_eliminar;
    private javax.swing.JToggleButton boton_leer;
    private javax.swing.JLabel etqTitulo;
    // End of variables declaration//GEN-END:variables

   
}
