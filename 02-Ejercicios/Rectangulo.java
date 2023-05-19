import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ancho;
        int altura;
        double area;
        System.out.println("Escribe el ancho de un rectángulo");
        ancho = entrada.nextInt();

        System.out.println("Escribe la altura de un rectángulo");
        altura = entrada.nextInt();

        area = ancho + altura;

        System.out.println("El área es "+ area);
    }
}
