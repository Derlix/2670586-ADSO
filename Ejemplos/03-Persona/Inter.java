import javax.swing.*;
import java.awt.*;

public class Inter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Interfaz Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel(new GridLayout(13, 3)); // 13 filas y 3 columnas

        frame.add(panel);
        frame.setVisible(true);
    }
}
