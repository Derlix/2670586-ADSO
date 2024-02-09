
package principal;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.Persona;
import java.lang.invoke.MethodHandles;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.ButtonEditor;
import utils.ButtonRenderer;



public class TablaBotones extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Persona listaPersonas[];
    
    public TablaBotones() {
        listaPersonas = new Persona[100];
        listaPersonas[0] = new Persona("1089378334","Christian","Arias","3212898067","christian@gmail.com");
        listaPersonas[1] = new Persona("421005","Pepito","Sanchez","3218888880","sanchezpepito@gmail.com");
        listaPersonas[2] = new Persona("992423","Kurt","Cobain","3233356232","kurtcockbain@gmail.com");
        listaPersonas[3] = new Persona("1923224","Juja","Lag","32345323232","jujalag@gmail.com");
        listaPersonas[4] = new Persona("233424","Natalia","Perez","321984023","natalita33@gmail.com");
        initComponents();
        altertComponents();
        imprimirPersonas();
    }
    
    public void imprimirPersonas(){
        
        modelo.setRowCount(0);
        for (int i = 0; listaPersonas[i]!=null; i++) {
            String documento = listaPersonas[i].getDocumento();
            String nombres = listaPersonas[i].getNombres();
            String apellidos = listaPersonas[i].getApellidos();
            String telefono = listaPersonas[i].getTelefono();
            String correo = listaPersonas[i].getCorreo();
            
            JButton btnEditar = new JButton();
            btnEditar.setBackground(Color.WHITE);
            
            Image icono_editar = getToolkit().createImage(ClassLoader.getSystemResource("folder/icono_editar.png"));
            icono_editar = icono_editar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnEditar.setIcon( new ImageIcon(icono_editar));

            JButton btnEliminar = new JButton();
            btnEliminar.setBackground(Color.WHITE);
            
            Image icono_eliminar = getToolkit().createImage(ClassLoader.getSystemResource("folder/icono_eliminar.png"));
            icono_eliminar = icono_eliminar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnEliminar.setIcon( new ImageIcon(icono_eliminar));
            
            Object dato []= new Object[]{documento,nombres,apellidos,telefono,correo,btnEditar,btnEliminar};
            modelo.addRow(dato);
            
            btnEditar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(" Nombres: "+nombres);
                    
                    VentanaEditar ventanaedit = new VentanaEditar();
                }
            });
            
            final int posicion = i;
            btnEliminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    VentanaEliminar ventana = new VentanaEliminar("Estas seguro de Ellimnar a la Persona" + documento );
                }
            });
        }
        
    }

    public void altertComponents(){
        setTitle(" Tabla ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        revalidate();
        
        modelo = (DefaultTableModel) tabla_Datos.getModel();
        
        tabla_Datos.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(new JCheckBox()));
        tabla_Datos.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());
        
        tabla_Datos.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JCheckBox()));
        tabla_Datos.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());

        //Tamano de columnas
        tabla_Datos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla_Datos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabla_Datos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabla_Datos.getColumnModel().getColumn(3).setPreferredWidth(50);
        tabla_Datos.getColumnModel().getColumn(4).setPreferredWidth(150);
        tabla_Datos.getColumnModel().getColumn(5).setPreferredWidth(20);
        tabla_Datos.getColumnModel().getColumn(6).setPreferredWidth(20);

        tabla_Datos.getTableHeader().setReorderingAllowed(false);
        tabla_Datos.getTableHeader().setResizingAllowed(false);
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_Datos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tabla_Datos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        //alto de las filas
        tabla_Datos.setRowHeight(30);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        contenedor_Titulo = new javax.swing.JPanel();
        etiqueta_titulo = new javax.swing.JLabel();
        contenedor_Formulario = new javax.swing.JPanel();
        etiqueta_Documento = new javax.swing.JLabel();
        campo_Documento = new javax.swing.JTextField();
        etiqueta_Nombres = new javax.swing.JLabel();
        campo_Nombres = new javax.swing.JTextField();
        etiqueta_Apellidos = new javax.swing.JLabel();
        campo_Apellidos = new javax.swing.JTextField();
        etiqueta_Telefono = new javax.swing.JLabel();
        campo_Telefono = new javax.swing.JTextField();
        etiqueta_Correo = new javax.swing.JLabel();
        campo_Correo = new javax.swing.JTextField();
        boton_agregar = new javax.swing.JToggleButton();
        contenedor_Datos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Datos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor_Titulo.setBackground(new java.awt.Color(0, 0, 255));

        etiqueta_titulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        etiqueta_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_titulo.setText("Tabla con Botones");

        javax.swing.GroupLayout contenedor_TituloLayout = new javax.swing.GroupLayout(contenedor_Titulo);
        contenedor_Titulo.setLayout(contenedor_TituloLayout);
        contenedor_TituloLayout.setHorizontalGroup(
            contenedor_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiqueta_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedor_TituloLayout.setVerticalGroup(
            contenedor_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiqueta_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        contenedor_Formulario.setBackground(new java.awt.Color(102, 204, 255));

        etiqueta_Documento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Documento.setText("Documento:");

        campo_Documento.setToolTipText("");

        etiqueta_Nombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Nombres.setText("Nombres:");

        campo_Nombres.setToolTipText("");

        etiqueta_Apellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Apellidos.setText("Apellidos:");

        campo_Apellidos.setToolTipText("");

        etiqueta_Telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Telefono.setText("Telefono:");

        campo_Telefono.setToolTipText("");

        etiqueta_Correo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Correo.setText("Correo Elct:");

        campo_Correo.setToolTipText("");

        boton_agregar.setBackground(new java.awt.Color(0, 204, 51));
        boton_agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_agregar.setForeground(new java.awt.Color(255, 255, 255));
        boton_agregar.setText("AGREGAR");
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedor_FormularioLayout = new javax.swing.GroupLayout(contenedor_Formulario);
        contenedor_Formulario.setLayout(contenedor_FormularioLayout);
        contenedor_FormularioLayout.setHorizontalGroup(
            contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_FormularioLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_FormularioLayout.createSequentialGroup()
                        .addGroup(contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenedor_FormularioLayout.createSequentialGroup()
                                .addComponent(campo_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contenedor_FormularioLayout.createSequentialGroup()
                        .addGroup(contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(122, 122, 122))
        );
        contenedor_FormularioLayout.setVerticalGroup(
            contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_FormularioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_FormularioLayout.createSequentialGroup()
                            .addComponent(etiqueta_Apellidos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(contenedor_FormularioLayout.createSequentialGroup()
                            .addComponent(etiqueta_Nombres)
                            .addGap(1, 1, 1)))
                    .addGroup(contenedor_FormularioLayout.createSequentialGroup()
                        .addComponent(etiqueta_Documento)
                        .addGap(1, 1, 1)))
                .addGroup(contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campo_Documento)
                    .addComponent(campo_Nombres, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_Apellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqueta_Correo)
                    .addComponent(etiqueta_Telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedor_FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campo_Telefono)
                    .addGroup(contenedor_FormularioLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(boton_agregar))
                    .addComponent(campo_Correo, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(33, 33, 33))
        );

        contenedor_Datos.setBackground(new java.awt.Color(0, 255, 255));

        tabla_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Telefono", "Correo Electronico", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_Datos);

        javax.swing.GroupLayout contenedor_DatosLayout = new javax.swing.GroupLayout(contenedor_Datos);
        contenedor_Datos.setLayout(contenedor_DatosLayout);
        contenedor_DatosLayout.setHorizontalGroup(
            contenedor_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        contenedor_DatosLayout.setVerticalGroup(
            contenedor_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_Datos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor_Formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedor_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor_Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        
      
        String documento = campo_Documento.getText();
        String nombres = campo_Nombres.getText();
        String apellidos = campo_Apellidos.getText();
        String telefono = campo_Telefono.getText();
        String correo = campo_Correo.getText();
        
        
        
        
        
            
        
        if( documento.equalsIgnoreCase("") && nombres.equalsIgnoreCase("")&& telefono.equalsIgnoreCase("") && apellidos.equalsIgnoreCase("")&& correo.equalsIgnoreCase("") ){
            
            Alerta ventana = new Alerta(" Todos los campos son obligatorios");
            
        }else{
            
            for (Persona persona : listaPersonas){
                 if (persona != null && (persona.getDocumento().equals(documento) || persona.getCorreo().equals(correo))) {
                    Alerta ventana1 = new Alerta(" El Documento o Correo ya existen ");
                    return; // Salir del método si el documento o el correo ya existen
                }
            }
            
            int posicion = -1;
            for (int i = 0; i < listaPersonas.length; i++) {
                if(listaPersonas[i]==null){
                    posicion = i;
                    break;
                }
            }
            
            if(posicion!=1){
                listaPersonas[posicion] = new Persona(documento, nombres, apellidos, telefono, correo);
                Object data[] = new Object[]{documento,nombres,apellidos,telefono,correo};
                modelo.addRow(data);
            
                campo_Apellidos.setText("");
                campo_Correo.setText("");
                campo_Documento.setText("");
                campo_Telefono.setText("");
                campo_Nombres.setText("");
                campo_Documento.requestFocus();
            }
            
            
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_boton_agregarActionPerformed

    
    
    public static void main(String args[]) {
    
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TablaBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaBotones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton boton_agregar;
    private javax.swing.JTextField campo_Apellidos;
    private javax.swing.JTextField campo_Correo;
    private javax.swing.JTextField campo_Documento;
    private javax.swing.JTextField campo_Nombres;
    private javax.swing.JTextField campo_Telefono;
    private javax.swing.JPanel contenedor_Datos;
    private javax.swing.JPanel contenedor_Formulario;
    private javax.swing.JPanel contenedor_Titulo;
    private javax.swing.JLabel etiqueta_Apellidos;
    private javax.swing.JLabel etiqueta_Correo;
    private javax.swing.JLabel etiqueta_Documento;
    private javax.swing.JLabel etiqueta_Nombres;
    private javax.swing.JLabel etiqueta_Telefono;
    private javax.swing.JLabel etiqueta_titulo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla_Datos;
    // End of variables declaration//GEN-END:variables
}
