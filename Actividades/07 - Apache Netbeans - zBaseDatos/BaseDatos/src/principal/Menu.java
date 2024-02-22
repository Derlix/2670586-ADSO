/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import Clases.PanelRound;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import utils.Agregar;
import tipografias.Fuentes;
import utils.*;



public class Menu extends javax.swing.JFrame {
   
    Fuentes fuenteTipo;
    Fondopanel fondo = new Fondopanel();

    /**
     * Creates new form Menu
     */
    public Menu() {
        this.setContentPane(fondo);
        fuenteTipo = new Fuentes();
        initComponents();
        componentesAlternos();
        transparencia();
        redimensionarImagen(boton_agregar, "src/imagenes/boton+.png");
        redimensionarImagen(boton_leer,"src/imagenes/botonleer.png");
        redimensionarImagen(boton_actualizar,"src/imagenes/botonedit.png");
        redimensionarImagen(boton_eliminar, "src/imagenes/boton-.png");
        redimensionarImagen(etq_agregarimg, "src/imagenes/agregarkitty.png");
        redimensionarImagen(etq_leerimg, "src/imagenes/leerKitty.png");
        redimensionarImagen(etq_eliminarimg, "src/imagenes/deletekitty.png");
        redimensionarImagen(etq_editimg, "src/imagenes/editKitty.png");
        
        
    }
    
    public void transparencia(){
        boton_agregar.setOpaque(false);
        boton_agregar.setContentAreaFilled(false);
        boton_agregar.setBorderPainted(false);
        
        boton_actualizar.setOpaque(false);
        boton_actualizar.setContentAreaFilled(false);
        boton_actualizar.setBorderPainted(false);
        
        boton_eliminar.setOpaque(false);
        boton_eliminar.setContentAreaFilled(false);
        boton_eliminar.setBorderPainted(false);
        
        boton_leer.setOpaque(false);
        boton_leer.setContentAreaFilled(false);
        boton_leer.setBorderPainted(false);
        
        etq_agregarimg.setOpaque(false);
        etq_agregarimg.setContentAreaFilled(false);
        etq_agregarimg.setBorderPainted(false);
        
        etq_leerimg.setOpaque(false);
        etq_leerimg.setContentAreaFilled(false);
        etq_leerimg.setBorderPainted(false);
        
        etq_eliminarimg.setOpaque(false);
        etq_eliminarimg.setContentAreaFilled(false);
        etq_eliminarimg.setBorderPainted(false);
        
        etq_editimg.setOpaque(false);
        etq_editimg.setContentAreaFilled(false);
        etq_editimg.setBorderPainted(false);
        
        PanelPrincipal.setOpaque(false);
        paneetqmenu.setOpaque(false);
    }
    
    private void redimensionarImagen(JToggleButton name,String ruta){
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(name.getWidth(), name.getHeight(), Image.SCALE_DEFAULT));
        name.setIcon(icon);
        this.repaint();
    }
     private void componentesAlternos() {
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Opciones de Menu ");
        etqTitulo.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 1, 40));
        
        
        //Colocando imagen a boton Agregar
        
       
        //boton_agregar.setBackground(new Color(0,0,0,10));
        //boton_agregar.setHorizontalTextPosition(SwingConstants.CENTER);
        //boton_agregar.setVerticalTextPosition(SwingConstants.BOTTOM);
        etq_agregar.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 1, 35));
        
        //Colocando imagen a boton Leer
        //Image icono_leer = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/buscar_usuario.png"));
        //icono_leer = icono_leer.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        etq_leer.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 1, 50));
        //boton_leer.setIcon(new ImageIcon(icono_leer));
        //boton_leer.setHorizontalTextPosition(SwingConstants.CENTER);
        //boton_leer.setVerticalTextPosition(SwingConstants.BOTTOM);
        
       
        
        //Colocando imagen a boton actualizar
        
        //Image icono_actualizar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/editKitty.jpeg"));
        //icono_actualizar = icono_actualizar.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        //boton_actualizar.setIcon(new ImageIcon(icono_actualizar));
        etq_edit.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 1, 40));
        //boton_actualizar.setHorizontalTextPosition(SwingConstants.CENTER);
        //boton_actualizar.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        //Colocando imagen a boton eliminar 
        //Image icono_eliminar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/eliminar.png"));
        //icono_eliminar = icono_eliminar.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        //boton_eliminar.setIcon(new ImageIcon(icono_eliminar));
        etq_eliminar.setFont(fuenteTipo.fuente(fuenteTipo.RIO, 1, 35));
        //boton_eliminar.setHorizontalTextPosition(SwingConstants.CENTER);
        //boton_eliminar.setVerticalTextPosition(SwingConstants.BOTTOM);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new RoundedPanel(50, Color.GRAY);
        panelAgregar = new javax.swing.JPanel();
        boton_agregar = new javax.swing.JToggleButton();
        etq_agregar = new javax.swing.JLabel();
        etq_agregarimg = new javax.swing.JToggleButton();
        panelleer = new javax.swing.JPanel();
        boton_leer = new javax.swing.JToggleButton();
        etq_leer = new javax.swing.JLabel();
        etq_leerimg = new javax.swing.JToggleButton();
        editPanel = new javax.swing.JPanel();
        boton_actualizar = new javax.swing.JToggleButton();
        etq_edit = new javax.swing.JLabel();
        etq_editimg = new javax.swing.JToggleButton();
        panel_eliminar = new javax.swing.JPanel();
        boton_eliminar = new javax.swing.JToggleButton();
        etq_eliminar = new javax.swing.JLabel();
        etq_eliminarimg = new javax.swing.JToggleButton();
        paneetqmenu = new RoundedPanel(50, Color.PINK);
        etqTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(255, 204, 204));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(345, 518));

        panelAgregar.setBackground(new java.awt.Color(255, 255, 255));

        boton_agregar.setBackground(new java.awt.Color(236, 207, 253));
        boton_agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_agregar.setBorder(null);
        boton_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });

        etq_agregar.setForeground(new java.awt.Color(102, 0, 51));
        etq_agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_agregar.setText("AGREGAR");
        etq_agregar.setToolTipText("");
        etq_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelAgregarLayout = new javax.swing.GroupLayout(panelAgregar);
        panelAgregar.setLayout(panelAgregarLayout);
        panelAgregarLayout.setHorizontalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_agregarimg, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(etq_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelAgregarLayout.setVerticalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etq_agregarimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelleer.setBackground(new java.awt.Color(255, 255, 255));

        boton_leer.setBackground(new java.awt.Color(236, 207, 253));
        boton_leer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_leer.setForeground(new java.awt.Color(255, 255, 255));
        boton_leer.setBorder(null);
        boton_leer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_leer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_leer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_leerActionPerformed(evt);
            }
        });

        etq_leer.setForeground(new java.awt.Color(102, 0, 51));
        etq_leer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_leer.setText("LEER");
        etq_leer.setFocusable(false);
        etq_leer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelleerLayout = new javax.swing.GroupLayout(panelleer);
        panelleer.setLayout(panelleerLayout);
        panelleerLayout.setHorizontalGroup(
            panelleerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelleerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_leerimg, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_leer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_leer, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        panelleerLayout.setVerticalGroup(
            panelleerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_leerimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etq_leer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelleerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_leer, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        editPanel.setBackground(new java.awt.Color(255, 255, 255));

        boton_actualizar.setBackground(new java.awt.Color(236, 207, 253));
        boton_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        boton_actualizar.setBorder(null);
        boton_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });

        etq_edit.setForeground(new java.awt.Color(102, 0, 51));
        etq_edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_edit.setText("EDITAR");

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_editimg, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(etq_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_editimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etq_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panel_eliminar.setBackground(new java.awt.Color(255, 255, 255));

        boton_eliminar.setBackground(new java.awt.Color(236, 207, 253));
        boton_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminar.setBorder(null);
        boton_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        etq_eliminar.setForeground(new java.awt.Color(102, 0, 51));
        etq_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_eliminar.setText("ELIMINAR");
        etq_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel_eliminarLayout = new javax.swing.GroupLayout(panel_eliminar);
        panel_eliminar.setLayout(panel_eliminarLayout);
        panel_eliminarLayout.setHorizontalGroup(
            panel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_eliminarimg, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(etq_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        panel_eliminarLayout.setVerticalGroup(
            panel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_eliminarimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etq_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelleer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelleer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        etqTitulo.setBackground(new java.awt.Color(255, 204, 204));
        etqTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("MENU");

        javax.swing.GroupLayout paneetqmenuLayout = new javax.swing.GroupLayout(paneetqmenu);
        paneetqmenu.setLayout(paneetqmenuLayout);
        paneetqmenuLayout.setHorizontalGroup(
            paneetqmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        paneetqmenuLayout.setVerticalGroup(
            paneetqmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(paneetqmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(paneetqmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_eliminarActionPerformed

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        Agregar ventana = new Agregar();
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void boton_leerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_leerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_leerActionPerformed

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_actualizarActionPerformed

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
    private javax.swing.JPanel editPanel;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etq_agregar;
    private javax.swing.JToggleButton etq_agregarimg;
    private javax.swing.JLabel etq_edit;
    private javax.swing.JToggleButton etq_editimg;
    private javax.swing.JLabel etq_eliminar;
    private javax.swing.JToggleButton etq_eliminarimg;
    private javax.swing.JLabel etq_leer;
    private javax.swing.JToggleButton etq_leerimg;
    private javax.swing.JPanel paneetqmenu;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JPanel panel_eliminar;
    private javax.swing.JPanel panelleer;
    // End of variables declaration//GEN-END:variables

    
    class Fondopanel extends JPanel{
        private Image imgFondo;
        @Override
        public void paint(Graphics g){
            imgFondo = new ImageIcon(getClass().getResource("/imagenes/fondoKitty.jpeg")).getImage();
        
            g.drawImage(imgFondo,0, 0,getWidth(),getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
   class RoundedPanel extends JPanel
    {
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
   
}

