import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;

        System.out.print("Ingrese un numero N: ");
        n = leer.nextInt();

        System.out.println("Cuadrado latino:");

        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
