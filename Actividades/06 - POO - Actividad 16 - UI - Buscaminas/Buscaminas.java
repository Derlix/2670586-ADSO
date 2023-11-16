import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImagingOpException;

import javax.swing.border.*;

public class Buscaminas extends JFrame {

    JButton botones_para_jugar[][] = new JButton[9][9];

    public Buscaminas() {
        initComponent();
    }

    public void initComponent() {

        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_bomba.png")));

        setTitle("BuscaMinas");
        setSize(300, 400);

        JPanel contenedor_principal = new JPanel();
        contenedor_principal.setLayout(new GridBagLayout());
        contenedor_principal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 10));
        GridBagConstraints restricciones = new GridBagConstraints();
        contenedor_principal.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel escore_minas = new JLabel("0" + 20, 0);
        escore_minas.setOpaque(true);
        escore_minas.setBackground(Color.BLACK);
        escore_minas.setForeground(Color.red);
        escore_minas.setFont(new Font("Arial", 1, 30));
        escore_minas.setBorder(new EmptyBorder(5, 10, 5, 10));

        restricciones.gridy = 0;
        restricciones.gridx = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 3;
        restricciones.weighty = 1;
        restricciones.weightx = 1;
        restricciones.fill = 10;
        contenedor_principal.add(escore_minas, restricciones);

        JButton boton_reinciar_juego = new JButton("");
        Image imagen_boton = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_happy.png"));
        imagen_boton = imagen_boton.getScaledInstance(25, 25, 4);
        boton_reinciar_juego.setIcon(new ImageIcon(imagen_boton));
        boton_reinciar_juego.setBorder(new EmptyBorder(10, 10, 10, 10));
        restricciones.gridy = 0;
        restricciones.gridx = 3;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 3;
        restricciones.weighty = 1;
        restricciones.weightx = 1;
        restricciones.fill = 10;

        contenedor_principal.add(boton_reinciar_juego, restricciones);

        JLabel numero_banderas = new JLabel("000");
        numero_banderas.setOpaque(true);
        numero_banderas.setBackground(Color.BLACK);
        numero_banderas.setForeground(Color.red);
        numero_banderas.setFont(new Font("Arial", Font.BOLD, 30));
        numero_banderas.setBorder(new EmptyBorder(5, 10, 5, 10));
        restricciones.gridy = 0;
        restricciones.gridx = 6;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 3;
        restricciones.weighty = 1;
        restricciones.weightx = 1;
        restricciones.fill = 10;
        contenedor_principal.add(numero_banderas, restricciones);

        imprimirBotones(contenedor_principal);

        add(contenedor_principal);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setResizable(false);
        setVisible(true);
        revalidate();
        repaint();
    }

    public void imprimirBotones(JPanel contenedor_principal) {
        for (int i = 0; i < botones_para_jugar.length; i++) {
            for (int j = 0; j < botones_para_jugar[i].length; j++) {
                JButton boton = new JButton();
                GridBagConstraints restricciones = new GridBagConstraints();

                boton.setPreferredSize(new Dimension(30, 30));

                restricciones.gridy = i + 1;
                restricciones.gridx = j;
                restricciones.gridheight = 1;
                restricciones.gridwidth = 1;
                restricciones.weighty = 1;
                restricciones.weightx = 1;
                restricciones.fill = GridBagConstraints.BOTH;

                botones_para_jugar[i][j] = boton;

                contenedor_principal.add(boton, restricciones);
            }
        }
    }
}
