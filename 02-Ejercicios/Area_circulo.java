import java.util.Scanner;

public class Area_circulo{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double radio;
        double perimetro;
        double area;
        double Py;
        Py = 3.14159;

        System.out.println("Escribe el radio de un círculo");
        radio = entrada.nextDouble();

        perimetro = 2 * Py * radio;

        area = Py * radio * radio;

        System.out.println("El perímetro del círculo es: " + perimetro);
        System.out.println("El área del circulo es " + area);
    }
}
