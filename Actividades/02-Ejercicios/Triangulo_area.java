import java.util.Scanner;

public class Triangulo_area {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.println("Ingresa la base del triangulo");
        base = entrada.nextInt();

        System.out.println("Ingresa la altura del triangulo");
        altura = entrada.nextInt();

        area = base * altura/2;

        System.out.println("El área del triangulo es " + area);
    }
}
