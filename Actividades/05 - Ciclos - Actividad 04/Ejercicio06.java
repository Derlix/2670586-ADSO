import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int fibonacci = 0;
        int i;
        
        System.out.print("Ingresar la posicion del n-esimo termino de Fibonacci: ");
        int n = leer.nextInt();

        if (n <= 0) {
            fibonacci = 0;
        } else if (n == 1) {
            fibonacci = 1;
        } else {
            for (i = 2; i <= n; i++) {
                fibonacci = a + b;
                a = b;
                b = fibonacci;
            }
        }

        System.out.println("El n-esimo numero de Fibonacci es: " + fibonacci);
    }
}
