import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int N;
        int M;
        int fac;

        System.out.print("Ingrese numero N: ");
        N = leer.nextInt();

        System.out.print("Ingrese numero M: ");
        M = leer.nextInt();

        for (int i = N; i <= M; i++) {
            System.out.println("Factorial de " + i + " (" + i + "!):");
            fac = 1;
            System.out.print("1");

            for (int j = 2; j <= i; j++) {
                fac *= j;
                System.out.print(" x " + j);
            }

            System.out.println(" = " + fac);
        }
    }
}
