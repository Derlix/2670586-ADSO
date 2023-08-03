import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConstruido = 0;
        int n;
        int digito;
        int i;

        System.out.print("Ingrese un numero entre 1 y 6: ");
        n = scanner.nextInt();

        if (n < 1 || n > 6) {
            System.out.println("El numero ingresado esta fuera del rango.");
            
        }

        

        for (i = 0; i < n; i++) {
            digito = (int) (Math.random() * 10);
            numeroConstruido = numeroConstruido * 10 + digito;
        }

        System.out.println("El numero construido es: " + numeroConstruido);
        System.out.println("Resultado producto: " + (numeroConstruido * 2));
    }
}
