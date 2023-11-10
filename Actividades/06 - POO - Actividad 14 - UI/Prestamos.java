import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Prestamos extends JFrame {
    
    public Prestamos(){
        initComponents();
    }

    public void initComponents(){
        setTitle(" Simulador de prestamos ");
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ));

        setSize(400,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        GridBagConstraints restricciones = new GridBagConstraints();
        
        contenedor.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        
        JLabel etq_titulo = new JLabel();
        etq_titulo.setText("Prestamos");
        etq_titulo.setFont(new Font ("Arial",Font.BOLD,30));
        etq_titulo.setHorizontalAlignment(JLabel.CENTER);

        restricciones.gridx=0;
        restricciones.gridy=0;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx =100 ;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_titulo, restricciones);

        JLabel etq_capital = new JLabel();
        etq_capital.setText("Capital: ");
        etq_capital.setFont(new Font ("Arial",Font.BOLD,20));
        
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty=1;
        restricciones.insets= new Insets(5, 0, 0, 0);
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets= new Insets(0, 0, 0, 0);
        contenedor.add(etq_capital, restricciones);        

        JTextField campo_capital = new JTextField();
        campo_capital.setColumns(20);
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 80;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_capital, restricciones); 
        

        JLabel etq_intereses = new JLabel();
        etq_intereses.setText("Interes: ");
        etq_intereses.setFont(new Font ("Arial",Font.BOLD,20));

        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty=1;
        restricciones.insets= new Insets(5, 0, 0, 0);
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets= new Insets(5, 0, 0, 0);
        contenedor.add(etq_intereses, restricciones);     
        
        JTextField campo_intereses = new JTextField();
        campo_intereses.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 80;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_intereses, restricciones); 
        
        JLabel etq_cuatos = new JLabel();
        etq_cuatos.setText("Cuatos: ");
        etq_cuatos.setFont(new Font ("Arial",Font.BOLD,20));

        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty=1;
        restricciones.insets= new Insets(5, 0, 0, 0);
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets= new Insets(5, 0, 0, 0);
        contenedor.add(etq_cuatos, restricciones);     
        
        JTextField campo_cuatos = new JTextField();
        campo_cuatos.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 80;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_cuatos, restricciones);

        JButton btn_calcuar = new JButton();
        btn_calcuar.setText(" CALCULAR ");
        btn_calcuar.setBackground(new Color(50,50,255));
        btn_calcuar.setForeground(Color.WHITE);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(btn_calcuar, restricciones);  

        JLabel etq_planpagos = new JLabel();
        etq_planpagos.setText("Plan de pagos: ");
        etq_planpagos.setFont(new Font ("Arial",Font.BOLD,20));

        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_planpagos, restricciones);   
         
        JLabel etq_plan_pagos = new JLabel();
        etq_plan_pagos.setText("----");
        etq_plan_pagos.setHorizontalAlignment(JLabel.CENTER);
        JScrollPane scroll = new JScrollPane(etq_plan_pagos);
        
        
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty=90;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(scroll, restricciones); 
        
        JButton btn_limpiar = new JButton();
        btn_limpiar.setText(" LIMPIAR ");
        btn_limpiar.setBackground(Color.RED);
        btn_limpiar.setForeground(Color.WHITE);
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(btn_limpiar, restricciones);
         
        ActionListener evento_calcular = new ActionListener() {
            //CLICK COMPORTAMIENTO
            public void actionPerformed(ActionEvent event) {
                System.out.println(" Click en CACLCULAR");
                double capital = Double.parseDouble(campo_capital.getText());
                double intereses = Double.parseDouble(campo_intereses.getText());
                double cuato = Double.parseDouble(campo_cuatos.getText());

                double valor_cuato = (capital+(capital*(intereses / 100)))/cuato;

                System.out.println(cuato + " " + capital + " " + intereses + "Cuato:"+valor_cuato);
                
                String texto ="<html>";

                for(int i = 0; i<= cuato;i++){
                    texto += " Cuato N#: "+(i+1)+": "+valor_cuato+"<br>"; 
                }
                texto +="</html>";
                etq_plan_pagos.setText(texto);
            }
            
        };              
         
        btn_calcuar.addActionListener(evento_calcular);
        ActionListener evento_limpiar = new ActionListener() {
            //CLICK COMPORTAMIENTO
            public void actionPerformed(ActionEvent event) {
                System.out.println(" Click en LIMPIAR");

            }
            
        };              
        btn_limpiar.addActionListener(evento_limpiar);


        add(contenedor);
        setVisible(true);
        revalidate();
    }
    
}
