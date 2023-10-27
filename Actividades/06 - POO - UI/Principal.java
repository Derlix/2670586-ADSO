import javax.swing.*;/**
 * Principal
 */
import java.awt.*;
public class Principal {
    public static void main(String[] args) {
        JFrame ventana_01 = new JFrame();
        ventana_01.setTitle(" Primer ventana");
        ventana_01.setVisible(true);
        ventana_01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana_01.setSize(500, 500);
        ventana_01.setResizable(true);
        ventana_01.setLocation(500,500);
        ventana_01.setLocationRelativeTo(null);
        ventana_01.setVisible(true);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.darkGray);
        contenedor.setVisible(true);


        JLabel etiqueta_title = new JLabel();
        etiqueta_title.setText(" TITULO ");
        etiqueta_title.setOpaque(true);
        etiqueta_title.setBackground(Color.YELLOW);
        etiqueta_title.setFont(new Font("Castellar",Font.BOLD,40));

        JLabel etiqueta_cedula = new JLabel();
        etiqueta_cedula.setText(" Cedula: ");
        etiqueta_cedula.setFont(new Font("Arial",Font.PLAIN,20));

        JLabel nombre = new JLabel();
        nombre.setText(" Nombre: ");
        nombre.setFont(new Font("Arial",Font.PLAIN,20));
        
        JLabel Apellidos = new JLabel();
        Apellidos.setText(" Apellidos: ");
        Apellidos.setFont(new Font("Arial",Font.PLAIN,20));
        
        JTextField campoCed = new JTextField();
        campoCed.setColumns(10);
        
        JTextField campoNombre = new JTextField();
        campoNombre.setColumns(10);
        
        
        JTextField campoApellido = new JTextField();
        campoApellido.setColumns(10);
        
        JButton enviar = new JButton();

        JLabel envia = new JLabel(" Enviar");
        
        

        contenedor.add(etiqueta_title );
        
        contenedor.add(nombre);
        contenedor.add(campoNombre);

        contenedor.add(Apellidos);
        contenedor.add(campoApellido);

        contenedor.add(etiqueta_cedula);
        contenedor.add(campoCed);

        contenedor.add(enviar);
        enviar.add(envia);
    
        
        //ventana_01.repaint();
        ventana_01.add(contenedor);
        ventana_01.revalidate();
        //ventana_01.pack();

    }
    
}