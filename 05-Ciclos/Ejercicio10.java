import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0; 
        int numero = 2; 
        int N;
        boolean esPrimo;
        int i;

        System.out.print("Ingresar numero: ");
        N = leer.nextInt();

        if (N < 1 || N > 11) {
            System.out.println("Numero invalido. El rango valido para N es de 1 a 11.");
        } else {
            System.out.println("Los numeros primos encontrados son:");

            
            
            while (contador < N * N) {
                esPrimo = true;

                if (numero <= 1) {
                    esPrimo = false;
                } else {
                    for (i = 2; i * i <= numero; i++) {
                        if (numero % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }

                if (esPrimo) {
                    System.out.print("[" + numero + "] ");
                    contador++;

                    
                    if (contador % N == 0) {
                        System.out.println();
                    }
                }

                numero++;
            }
        }
    }
}
