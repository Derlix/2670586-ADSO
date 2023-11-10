import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Facturas extends JFrame {

    public Facturas(){
        initComponents();
    }
    
    public void initComponents(){

        setTitle(" FACTURA ");

        setSize(760,960);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.GRAY);
        contenedor.setLayout(new GridBagLayout());
        GridBagConstraints restricciones = new GridBagConstraints();
        
        contenedor.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        
       
        add(contenedor);
        setVisible(true);
        revalidate();
    }
}