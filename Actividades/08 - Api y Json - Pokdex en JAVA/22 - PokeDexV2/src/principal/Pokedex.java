package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.management.StringValueExp;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import utils.ConsumoAPI;

public class Pokedex extends javax.swing.JFrame {

    ConsumoAPI consumo;
    int pagina;
    int listaPaginas[];
    int totalPaginas;

    public Pokedex() {
        this.consumo = new ConsumoAPI();
        this.listaPaginas = new int[7];
        this.pagina = 1;
        this.totalPaginas = 66;
        initComponents();
        initAlternComponents();
        cargarPokemones();
        cargarPaginador();
    }

    public void initAlternComponents() {
        setTitle("POKEDEX");
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png")));
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void cargarPokemones() {
        if (pagina < 1) {
            pagina = 1;
        } else if (pagina > totalPaginas) {
            pagina = totalPaginas;
        }
        int offset = (this.pagina * 20) - 20;
        String endpoint = "https://pokeapi.co/api/v2/pokemon?offset=" + offset + "&limit=20";
        String data = this.consumo.consumoGET(endpoint);

        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray results = dataJson.getAsJsonArray("results");
        panelBotones.removeAll();
        for (int i = 0; i < results.size(); i++) {
            JsonObject temp = results.get(i).getAsJsonObject();

            JButton btn = new JButton(temp.get("name").getAsString());
            panelBotones.add(btn);

            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Nombre: " + temp.get("name").getAsString());
                    System.out.println("Url: " + temp.get("url").getAsString());

                    panelDetalle.removeAll();
                    DetallePokemon detalle = new DetallePokemon(temp);
                    detalle.setSize(panelDetalle.getSize());
                    detalle.setPreferredSize(panelDetalle.getPreferredSize());
                    panelDetalle.add(detalle);

                    revalidate();
                    repaint();
                }
            });
        }

        panelDetalle.removeAll();
        DetallePokemon detalle = new DetallePokemon(results.get(0).getAsJsonObject());
        detalle.setSize(panelDetalle.getSize());
        detalle.setPreferredSize(panelDetalle.getPreferredSize());
        panelDetalle.add(detalle);

        revalidate();
        repaint();
    }

    public void cargarPaginador() {
        panelPaginador.setLayout(new FlowLayout(FlowLayout.CENTER)); 
        panelPaginador.removeAll();
        panelPaginador.add(Box.createHorizontalBox());

        JButton btnPrimerPagina = new JButton("<<");
        panelPaginador.add(btnPrimerPagina);
        btnPrimerPagina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = 1;
                cargarPokemones();
            }
        });
        JButton btnAtras = new JButton("<");
        panelPaginador.add(btnAtras);
        btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pagina > 1) {
                    pagina--;
                    cargarPokemones();
                }
            }
        });

        for (int i = 1; i < listaPaginas.length + 1; i++) {

            int numPagina = i + 1;
            JButton btn = new JButton(String.valueOf(numPagina));
            panelPaginador.add(btn);
            btn.addActionListener(e -> {
                pagina = numPagina;
                cargarPokemones();
            });
        }

        JButton btnSiguiente = new JButton(">");
        panelPaginador.add(btnSiguiente);
        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pagina < totalPaginas) {
                    pagina++;
                    cargarPokemones();
                }
            }
        });
        JButton btnUltimaPagina = new JButton(">>");
        panelPaginador.add(btnUltimaPagina);
        btnUltimaPagina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = totalPaginas;
                cargarPokemones();
            }
        });
        panelPaginador.add(Box.createHorizontalGlue());
        repaint();
        revalidate();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelBotones = new javax.swing.JPanel();
        panelDetalle = new javax.swing.JPanel();
        panelPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(204, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("POKEMON");

        panelBotones.setLayout(new javax.swing.BoxLayout(panelBotones, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(panelBotones);

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelPaginador.setLayout(new javax.swing.BoxLayout(panelPaginador, javax.swing.BoxLayout.X_AXIS));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addComponent(panelDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}
