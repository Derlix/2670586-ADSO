import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        boolean esPrimo;
        int i;

        System.out.print("Ingresar un numero: ");
        numero = leer.nextInt();

        esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                
                }
            }
        }

        System.out.println("------------------------------------");
        if (esPrimo) {
            System.out.println("Numero ingresado Es Primo.");
        } else {
            System.out.println("Numero ingresado NO Es Primo.");
        }
    }
}
