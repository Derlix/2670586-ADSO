import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        maximo(10, 30, 20);
        Scanner leer = new Scanner(System.in);

    }

    public static void maximo(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(" El numero mayor es: " + a);

        } else if (b > a && b > c) {
            System.out.println(" El numero mayor es: " + b);
        } else {
            System.out.println(" El numero mayor es " + c);
        }
    }
}
