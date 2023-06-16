import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = leer.nextInt();

        int a = 0;
        int b = 1;
        int c;
        int i;

        System.out.print("La sucesion Fibonacci es: " + a + ", " + b);

        for ( i = 2; i <= numero; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}
