import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int n = leer.nextInt();

        int[] arregloPrimos = new int[n];
        int numero = 2;
        int contador = 0;

        while (contador < n) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                arregloPrimos[contador] = numero;
                contador++;
            }

            numero++;
        }

        System.out.println("Arreglo de numeros primos:");
        for (int i = 0; i < n; i++) {
            System.out.print(arregloPrimos[i] + " ");
        }
    }
}
