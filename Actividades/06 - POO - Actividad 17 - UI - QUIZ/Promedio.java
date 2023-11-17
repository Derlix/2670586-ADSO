import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.*;

public class Promedio extends JFrame {

    Materia arreglo[];
    JLabel imprimidor_cja[];
    int indice;

    Border color_del_borde = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode("#D5D5D5"));
    Border relleno_caja = new EmptyBorder(3, 10, 3, 10);
    Border colorGRIS = new CompoundBorder(color_del_borde, relleno_caja);

    public Promedio() {
        arreglo = new Materia[50];
        imprimidor_cja = new JLabel[50];
        initComponent();
        indice = 0;
    }

    public void initComponent() {
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_promedio.png")));

        setTitle(" Promedio Ponderado");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());

        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel etiqueta_titulo = new JLabel("CALCULAR PROMEDIO ");
        etiqueta_titulo.setForeground(Color.BLACK);
        etiqueta_titulo.setFont(new Font("Arial", Font.BOLD, 35));
        etiqueta_titulo.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = 1;
        restricciones.insets = new Insets(10, 0, 10, 0);
        contenedor.add(etiqueta_titulo, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etiqueta_materia = new JLabel("Materia:");
        etiqueta_materia.setFont(new Font("Arial", NORMAL, 20));
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.weightx = 1;
        restricciones.fill = 1;
        contenedor.add(etiqueta_materia, restricciones);

        JTextField campo_materia = new JTextField();
        campo_materia.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = 1;
        contenedor.add(campo_materia, restricciones);

        JLabel etiqueta_creditos = new JLabel("Creditos:");
        etiqueta_creditos.setFont(new Font("Arial", NORMAL, 20));
        restricciones.gridx = 2;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.fill = 1;
        contenedor.add(etiqueta_creditos, restricciones);

        JTextField campo_credito = new JTextField();
        campo_credito.setColumns(8);
        restricciones.gridx = 3;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.fill = 1;
        contenedor.add(campo_credito, restricciones);

        JLabel etiqueta_nota = new JLabel("Nota:");
        etiqueta_nota.setFont(new Font("Arial", NORMAL, 20));
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.fill = 1;
        contenedor.add(etiqueta_nota, restricciones);

        JTextField campo_nota = new JTextField();
        campo_nota.setColumns(8);
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.fill = 1;
        contenedor.add(campo_nota, restricciones);

        JButton boton_registrar = new JButton(" REGISTRAR");
        boton_registrar.setForeground(Color.WHITE);
        boton_registrar.setBackground(Color.blue);
        restricciones.gridx = 3;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = 1;
        contenedor.add(boton_registrar, restricciones);

        JLabel etiqueta_resumen = new JLabel("RESUMEN");
        etiqueta_resumen.setForeground(Color.black);
        etiqueta_resumen.setFont(new Font("Arial", Font.BOLD, 20));
        etiqueta_resumen.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = 1;
        etiqueta_resumen.setBorder(new EmptyBorder(0, 0, 0, 0));
        contenedor.add(etiqueta_resumen, restricciones);

        JPanel caja_objetos = new JPanel();
        caja_objetos.setLayout(new GridBagLayout());
        caja_objetos.setBackground(Color.WHITE);

        JScrollPane barrita_navegadora = new JScrollPane(caja_objetos);
        barrita_navegadora.setBorder(color_del_borde);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 90;
        restricciones.fill = 1;
        contenedor.add(barrita_navegadora, restricciones);

        imprimirCaja(caja_objetos);

        JLabel total = new JLabel(" TOTAL: ---- ");
        total.setFont(new Font("Arial", NORMAL, 25));
        total.setForeground(Color.BLACK);
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = 1;
        total.setHorizontalAlignment(JLabel.CENTER);

        contenedor.add(total, restricciones);

        JButton boton_limpiar = new JButton(" LIMPIAR");
        boton_limpiar.setFont(new Font("Arial", NORMAL, 18));
        boton_limpiar.setBackground(Color.red);
        boton_limpiar.setForeground(Color.white);
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = 0;
        restricciones.insets = new Insets(10, 0, 10, 0);

        boton_limpiar.setHorizontalAlignment(JLabel.CENTER);
        restricciones.insets = new Insets(0, 0, 0, 0);

        contenedor.add(boton_limpiar, restricciones);

        add(contenedor);
        setVisible(true);
        revalidate();

        ActionListener limpiar = new ActionListener() {

            public void actionPerformed(ActionEvent event) {

                for (int i = 0; i < Promedio.this.indice; i++) {

                    Promedio.this.arreglo[i] = null;
                    Promedio.this.imprimidor_cja[i].setText("");

                }

                Promedio.this.indice = 0;

                campo_credito.setText(" ");
                total.setText("  TOTAL: ---- ");
                campo_nota.setText(" ");
                campo_materia.setText(" ");

            }

        };

        boton_limpiar.addActionListener(limpiar);

        ActionListener registro = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String materia = campo_materia.getText();
                double credito = Double.parseDouble(campo_credito.getText());
                double nota = Double.parseDouble(campo_nota.getText());

                double nota_suma = 0;
                double credito_suma = 0;

                Promedio.this.arreglo[Promedio.this.indice] = new Materia(materia, credito, nota);
                Promedio.this.indice++;

                for (int i = 0; i < Promedio.this.indice; i++) {
                    Promedio.this.imprimidor_cja[i].setText(
                            Promedio.this.arreglo[i].nombre + " CREDITO: " +
                                    Promedio.this.arreglo[i].creditos + " NOTA: " +
                                    Promedio.this.arreglo[i].notas);
                }

                for (int j = 0; j < Promedio.this.indice; j++) {
                    nota_suma = nota_suma + (Promedio.this.arreglo[j].notas) * (Promedio.this.arreglo[j]).creditos;
                    credito_suma = credito_suma + (Promedio.this.arreglo[j]).creditos;

                }

                double total = nota_suma / credito_suma;

                campo_credito.setText(" ");
                campo_materia.setText(" ");
                campo_nota.setText(" ");

                total.setText("TOTAL: " + total);

            }

        };

        boton_registrar.addActionListener(registro);

    }

    public void imprimirCaja(JPanel contenedor) {
        GridBagConstraints restricciones = new GridBagConstraints();

        for (int i = 0; i < this.imprimidor_cja.length; i++) {
            JLabel etiqueta_tempo = new JLabel(" ");
            etiqueta_tempo.setFont(new Font("Arial", Font.PLAIN, 18));
            etiqueta_tempo.setOpaque(true);
            etiqueta_tempo.setBackground(Color.WHITE);
            etiqueta_tempo.setBorder(color_del_borde);
            this.imprimidor_cja[i] = etiqueta_tempo;
            restricciones.gridy = i;
            restricciones.gridx = 0;
            restricciones.gridheight = 1;
            restricciones.gridwidth = 1;
            restricciones.weighty = 2;
            restricciones.weightx = 11;
            restricciones.fill = GridBagConstraints.BOTH;
            restricciones.anchor = GridBagConstraints.WEST;
            contenedor.add(this.imprimidor_cja[i], restricciones);
        }

    }
}
