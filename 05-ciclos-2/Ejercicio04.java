import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numeroReverso = 0;
        int numDigitos = 0;
        int numero;
        boolean esPalindromo = true;
        

        System.out.print("Ingrese un numero entero (maximo 6 digitos): ");
        numero = leer.nextInt();

        int temp = numero;

        while (temp != 0) {
            numeroReverso = numeroReverso * 10 + temp % 10;
            temp /= 10;
            numDigitos++;
        }

        temp = numero;
        int potencia = (int) Math.pow(10, numDigitos - 1);

        

        while (temp != 0) {
            int primerDigito = temp / potencia;
            int ultimoDigito = temp % 10;

            if (primerDigito != ultimoDigito) {
                esPalindromo = false;
                break;
            }

            temp = (temp % potencia) / 10;
            potencia /= 100;
        }

        if (esPalindromo) {
            System.out.println("El numero SI es PALINDROMO");
        } else {
            System.out.println("El numero NO es PALINDROMO");
        }
    }
}
