import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class Facturas extends JFrame {

    public Facturas() {
        initComponents();
    }

    public void initComponents() {

        Toolkit System = Toolkit.getDefaultToolkit();
        Dimension tamanio = System.getScreenSize();
        setTitle("FACTURA");
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_factura.png")));

        setSize((int) (tamanio.width * 0.4D), (int) (tamanio.height * 0.9D));
        setDefaultCloseOperation(3);
        setLocationRelativeTo((Component) null);
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 10));
        GridBagConstraints restriccion = new GridBagConstraints();

        JLabel etiqueta_datos_cliente = new JLabel(" DATOS CLIENTE: ");
        etiqueta_datos_cliente.setFont(new Font("Arial", 1, 20));
        restriccion.gridy = 0;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 100.0D;
        restriccion.fill = 1;
        contenedor.add(etiqueta_datos_cliente, restriccion);

        JLabel etiqueta_cedula_cliente = new JLabel(" CEDULA ");
        restriccion.gridy = 1;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.fill = 1;
        contenedor.add(etiqueta_cedula_cliente, restriccion);

        JTextField campo_cedula_cliente = new JTextField();
        restriccion.gridy = 1;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 80.0D;
        restriccion.insets = new Insets(0, 10, 0, 0);
        restriccion.fill = 1;
        contenedor.add(campo_cedula_cliente, restriccion);

        JButton boton_cliente = new JButton(" BUSCAR ");
        restriccion.gridy = 1;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.fill = 1;
        contenedor.add(boton_cliente, restriccion);

        JLabel etiqueta_clientes_nombres = new JLabel(" NOMBRES: ");
        restriccion.gridy = 2;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.insets = new Insets(10, 0, 10, 0);
        restriccion.fill = 1;
        contenedor.add(etiqueta_clientes_nombres, restriccion);

        JTextField campo_cliente_nombre = new JTextField();
        campo_cliente_nombre.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        restriccion.gridy = 2;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 90.0D;
        restriccion.insets = new Insets(10, 10, 10, 10);
        restriccion.fill = 1;
        contenedor.add(campo_cliente_nombre, restriccion);

        JLabel etiqueta_direccion_del_cliente = new JLabel("DIRECCION:");
        restriccion.gridy = 3;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.insets = new Insets(0, 0, 10, 0);
        restriccion.fill = 1;
        contenedor.add(etiqueta_direccion_del_cliente, restriccion);

        JTextField campo_direccion_cliente = new JTextField();
        campo_direccion_cliente.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        restriccion.gridy = 3;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 90.0D;
        restriccion.insets = new Insets(0, 10, 10, 10);
        restriccion.fill = 1;
        contenedor.add(campo_direccion_cliente, restriccion);

        JLabel etiqueta_vendedor_datos = new JLabel(" DATOS VENDEDOR: ");
        etiqueta_vendedor_datos.setFont(new Font("Arial", 1, 20));
        etiqueta_vendedor_datos.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        restriccion.gridy = 4;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 100.0D;
        restriccion.insets = new Insets(10, 0, 0, 0);
        restriccion.fill = 1;
        contenedor.add(etiqueta_vendedor_datos, restriccion);

        JLabel etiquieta_cedula_vendedor_cliente = new JLabel(" CEDULA ");
        restriccion.gridy = 5;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = 1;
        contenedor.add(etiquieta_cedula_vendedor_cliente, restriccion);

        JTextField campo_vendedor_cedula = new JTextField();
        campo_vendedor_cedula.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        restriccion.gridy = 5;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 80.0D;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = 1;
        contenedor.add(campo_vendedor_cedula, restriccion);

        JButton boton_vendedor_buscador = new JButton(" BUSCAR ");
        restriccion.gridy = 5;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.fill = 1;
        contenedor.add(boton_vendedor_buscador, restriccion);

        JLabel etiqueta_vendedor_nombre = new JLabel(" NOMBRES: ");
        restriccion.gridy = 6;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.insets = new Insets(10, 0, 10, 0);
        restriccion.fill = 1;
        contenedor.add(etiqueta_vendedor_nombre, restriccion);

        JTextField campo_vendedor_nombre = new JTextField();
        campo_vendedor_nombre.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        restriccion.gridy = 6;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 90.0D;
        restriccion.insets = new Insets(10, 10, 10, 10);
        restriccion.fill = 1;
        contenedor.add(campo_vendedor_nombre, restriccion);

        JLabel etiqueta_datos_productos = new JLabel(" LISTA PRODUCTOS FACTURADOS: ");
        etiqueta_datos_productos.setFont(new Font("Arial", 1, 20));
        etiqueta_datos_productos.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        restriccion.gridy = 7;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 100.0D;
        restriccion.insets = new Insets(10, 0, 0, 0);
        restriccion.fill = 1;
        contenedor.add(etiqueta_datos_productos, restriccion);

        JLabel etiqueta_productos_id = new JLabel("ID");
        etiqueta_productos_id.setHorizontalAlignment(0);
        restriccion.gridy = 8;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = 1;
        contenedor.add(etiqueta_productos_id, restriccion);

        JLabel etiqueta_nombre_productos = new JLabel(" NOMBRES ");
        etiqueta_nombre_productos.setHorizontalAlignment(0);
        restriccion.gridy = 8;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 70.0D;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = 1;
        contenedor.add(etiqueta_nombre_productos, restriccion);

        JLabel etiqueta_cantidad_productos = new JLabel(" CANT.");
        etiqueta_cantidad_productos.setHorizontalAlignment(0);
        restriccion.gridy = 8;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = 1;
        contenedor.add(etiqueta_cantidad_productos, restriccion);

        JLabel etiqueta_boton_producto = new JLabel();
        restriccion.gridy = 8;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = 1;
        contenedor.add(etiqueta_boton_producto, restriccion);

        JTextField campo_ID_productos = new JTextField();
        campo_ID_productos.setHorizontalAlignment(0);
        restriccion.gridy = 9;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = 1;
        contenedor.add(campo_ID_productos, restriccion);

        JTextField campo_producto_nombre = new JTextField();
        campo_producto_nombre.setHorizontalAlignment(0);
        restriccion.gridy = 9;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 70.0D;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = 1;
        contenedor.add(campo_producto_nombre, restriccion);

        JTextField campo_cantidad_producto = new JTextField();
        campo_cantidad_producto.setHorizontalAlignment(0);
        restriccion.gridy = 9;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = 1;
        contenedor.add(campo_cantidad_producto, restriccion);

        JButton boton_agregar_producto = new JButton(" ADD ");
        restriccion.gridy = 9;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 10.0D;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = 1;
        contenedor.add(boton_agregar_producto, restriccion);

        JPanel caja_productos = new JPanel();
        caja_productos.setLayout(new GridBagLayout());
        caja_productos.setBackground(Color.WHITE);

        JScrollPane barrita_de_navegacion = new JScrollPane(caja_productos);
        caja_productos.setBorder((Border) null);
        restriccion.gridy = 10;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 89.0D;
        restriccion.weightx = 100.0D;
        restriccion.fill = 1;
        restriccion.insets = new Insets(10, 0, 0, 10);
        contenedor.add(barrita_de_navegacion, restriccion);

        JLabel etiqueta_total = new JLabel(" Total: $ 0");
        etiqueta_total.setHorizontalAlignment(4);
        etiqueta_total.setFont(new Font("Arias", 1, 20));
        etiqueta_total.setOpaque(true);
        etiqueta_total.setBackground(Color.white);
        etiqueta_total.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        restriccion.gridy = 11;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2.0D;
        restriccion.weightx = 100.0D;
        restriccion.fill = 1;
        restriccion.insets = new Insets(0, 0, 0, 10);
        contenedor.add(etiqueta_total, restriccion);
        campo_cliente_nombre.setEnabled(false);
        campo_cliente_nombre.setEnabled(false);
        setContentPane(contenedor);
        setResizable(false);
        setVisible(true);
        revalidate();
        repaint();
    }
}