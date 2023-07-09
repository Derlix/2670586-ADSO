import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int divisor;
        int digito;

        System.out.println("Ingresa un numero de hasta 6 digitos:");
        numero = leer.nextInt();

        if (numero < 0 || numero > 999999) {
            System.out.println("Numero invalido. Debe estar entre 0 y 999999.");
        } else {
            System.out.println("Digitos separados:");

            
            divisor = 100000;
            while (divisor >= 1) {
                digito = numero / divisor;
                System.out.println(digito);
                numero %= divisor;
                divisor /= 10;
            }
        }
    }
}
