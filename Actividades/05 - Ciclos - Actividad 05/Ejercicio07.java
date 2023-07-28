import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int i;
        int espacios;
        int j;

        System.out.print("Ingrese un numero entero impar: ");
        n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("El numero debe ser impar");
        }

        for ( i = 1; i <= n; i += 2) {
            espacios = (n - i) / 2;
            for (j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        for ( i = n - 2; i > 0; i -= 2) {
            espacios = (n - i) / 2;
            for (j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
