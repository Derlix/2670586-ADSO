import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        int num1;
        int num2;
        int contadorNum2 = 0;

        System.out.print(" Ingresa la distancia que quieres recorrer: ");
        num1 = leer.nextInt();

        System.out.print(" Numero a buscar: ");
        num2 = leer.nextInt();

        int arreglo[] = new int[num1];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < num1; i++) {
            if (arreglo[i] == num2) {
                contadorNum2++;
            }
        }

        System.out.println("Arreglo generado:");
        for (int i = 0; i < num1; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + arreglo[i]);
        }

        System.out.println("El numero " + num2 + " aparece " + contadorNum2 + " veces en el arreglo.");
    }
}
