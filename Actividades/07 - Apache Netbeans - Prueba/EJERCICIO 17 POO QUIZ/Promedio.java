import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.*;

public class Promedio extends JFrame {

    private String materia;
    Materia arreglo [];
    int indice;
    private int creditos;
    private int total_prom;
    private JLabel listaJLabels[];
    private JLabel etq_materia;
    private JLabel etq_creditos;
    private JLabel etq_notas;
    private JLabel etq_total;
    private JLabel etq_resumen;
    private JLabel etq_titulo;
    private JTextField input_materia;
    private JTextField input_creditos;
    private JTextField input_notas;
    private JButton btn_registrar;
    private JButton btn_limpiar;
    private JPanel contenedorItems;

    public Promedio(String materia, int creditos, int total_prom) {
        this.materia = materia;
        this.creditos = creditos;
        this.total_prom = total_prom;
        initComponent();
    }

    public void initComponent() {
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension tamaño = sistema.getScreenSize();
        this.listaJLabels = new JLabel[50];
        setTitle("Promedio Ponderado");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel contPrincipal = new JPanel();
        contPrincipal.setLayout(new GridBagLayout());
        contPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 10));
        GridBagConstraints restriccion = new GridBagConstraints();


        //-----------------------TITULO---------------------


        etq_titulo = new JLabel();
        etq_titulo.setText("CALCULAR PROMEDIO");
        etq_titulo.setFont(new Font("Arial", Font.BOLD, 25));
        etq_titulo.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.gridwidth = 4;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.CENTER;
        contPrincipal.add(etq_titulo, restriccion);


        //-----------------------MATERIA---------------------


        etq_materia = new JLabel("Materia:");
        etq_materia.setFont(new Font("Arial", Font.PLAIN, 18));
        etq_materia.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridx = 0;
        restriccion.gridy = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(etq_materia, restriccion);

        input_materia = new JTextField();
        input_materia.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        input_materia.setPreferredSize(new Dimension(200, 30));
        restriccion.gridx = 1;
        restriccion.gridy = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weightx = 40;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(input_materia, restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);


        //-----------------------CREDITOS---------------------


        etq_creditos = new JLabel("Creditos:");
        etq_creditos.setFont(new Font("Arial", Font.PLAIN, 18));
        etq_creditos.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridx = 2;
        restriccion.gridy = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(etq_creditos, restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);

        input_creditos = new JTextField();
        input_creditos.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        restriccion.gridx = 3;
        restriccion.gridy = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weightx = 40;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(input_creditos, restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);


        //-----------------------NOTA---------------------


        etq_notas = new JLabel("Nota:");
        etq_notas.setFont(new Font("Arial", Font.PLAIN, 18));
        etq_notas.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridx = 0;
        restriccion.gridy = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(5, 10, 0, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(etq_notas, restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);

        input_notas = new JTextField();
        input_notas.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        restriccion.gridx = 1;
        restriccion.gridy = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.insets = new Insets(5, 10, 0, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(input_notas, restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);


        //-----------------------BTN REGISTRAR---------------------


        btn_registrar = new JButton("REGISTRAR");
        btn_registrar.setBackground(new Color(0, 0, 255));
        btn_registrar.setForeground(Color.WHITE);
		btn_registrar.setFocusable(false);
		restriccion.gridx = 2;
		restriccion.gridy = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 2;
		restriccion.weighty = 1;
		restriccion.weightx = 10;
        restriccion.insets = new Insets(5, 100, 0, 100);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_registrar, restriccion );
        restriccion.insets = new Insets(0, 0, 0, 00);
        

        //-----------------------TITULO RESUMEN---------------------


        etq_resumen = new JLabel();
        etq_resumen.setText("Resumen");
        etq_resumen.setFont(new Font("Arial", Font.BOLD, 18));
        etq_resumen.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridx = 0;
        restriccion.gridy = 3;
        restriccion.gridwidth = 4;
        restriccion.gridheight = 1;
        restriccion.weightx = 100; 
        restriccion.weighty = 1; 
        restriccion.fill = GridBagConstraints.CENTER;
        restriccion.insets = new Insets(15, 0, 0, 0);
        contPrincipal.add(etq_resumen, restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);


        //-----------------------PANEL---------------------


        contenedorItems = new JPanel();
        contenedorItems.setLayout( new GridBagLayout() );
        contenedorItems.setBackground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(contenedorItems);
        scrollPane.setBorder(null);
        
        restriccion.gridy = 4;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 89;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 0, 0, 10);
        contPrincipal.add( scrollPane, restriccion );
        
        GridBagConstraints constItems = new GridBagConstraints();
        Border borderColor = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);
        
        for (int i=0; i<this.listaJLabels.length; i++) {
            JLabel etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment( JLabel.CENTER );
            etq_temporal.setFont( new Font("Arial", Font.PLAIN, 18) );
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground( Color.white );
            etq_temporal.setBorder( borderGris );
            this.listaJLabels[i] = etq_temporal;
            constItems.gridy = i;
            constItems.gridx = 0;
            constItems.gridheight = 1;
            constItems.gridwidth = 1;
            constItems.weighty = 1;
            constItems.weightx = 1;
            constItems.fill = GridBagConstraints.HORIZONTAL;
            constItems.anchor = GridBagConstraints.NORTH;
            constItems.insets = new Insets(0, 0, 0, 0);
            contenedorItems.add(this.listaJLabels[i], constItems);
        }


        //-----------------------TOTAL---------------------


        etq_total = new JLabel("Total:");
        etq_total.setFont(new Font("Arial", Font.BOLD, 18));
        etq_total.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridx = 0;
        restriccion.gridy = 5;
        restriccion.gridwidth = 4;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.CENTER;
        contPrincipal.add(etq_total, restriccion);


        //-----------------------BTN LIMPIAR---------------------


        btn_limpiar = new JButton("LIMPIAR");
        btn_limpiar.setFocusable(false);
        btn_limpiar.setBackground(new Color(255, 0, 0));
        btn_limpiar.setForeground(Color.WHITE);
        restriccion.gridx = 0;
        restriccion.gridy = 6;
        restriccion.gridwidth = 4;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.CENTER;
        restriccion.insets = new Insets(20, 0, 0, 0);
        contPrincipal.add(btn_limpiar, restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);


        //-----------------------BTN LIMPIAR---------------------


        btn_limpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                input_materia.setText("");
                input_creditos.setText("");
                input_notas.setText("");
                for (JLabel label : listaJLabels) {
                    label.setText("");
                }
                total_prom = 0;
                creditos = 0;
                etq_total.setText("Total: 0");
                System.out.println("Campos limpiados");
            }
        });
        

        //-----------------------BTN REGISTRAR---------------------



        btn_registrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                String nombreMateria = input_materia.getText();
                float creditos = Float.parseFloat(input_creditos.getText());
                float nota = Float.parseFloat(input_notas.getText());
                Materia nuevaMateria = new Materia(nombreMateria, creditos, nota);
                System.out.println("CONTENIDO IMPRESO");
                mostrarInformacion(nuevaMateria);
                input_materia.setText("");
                input_creditos.setText("");
                input_notas.setText("");
            }
        });
        
        
        add(contPrincipal);
        setResizable(false);
        setVisible(true);
        revalidate();
        repaint();


    }


    //-----------------------IMPRIME INFORMACION---------------------


    public void mostrarInformacion(Materia nuevaMateria) {
        if (indice < listaJLabels.length) {
            listaJLabels[indice].setText("Materia: " + nuevaMateria.getNombre() + ", Creditos: " + nuevaMateria.getCreditos() + ", Nota: " + nuevaMateria.getNota());
            indice++;

            total_prom += nuevaMateria.getNota() * nuevaMateria.getCreditos();
            creditos += nuevaMateria.getCreditos();
    
            float promedioPonderado = total_prom / creditos;
    
            etq_total.setText("Total: " + promedioPonderado);
        }
    }
}
