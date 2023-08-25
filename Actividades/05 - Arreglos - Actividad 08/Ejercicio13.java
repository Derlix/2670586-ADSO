import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa el tamaño de los arreglos: ");
        int tamano = leer.nextInt();

        int[] arreglo1 = new int[tamano];
        int[] arreglo2 = new int[tamano];
        int[] arregloSuma = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            arreglo1[i] = random.nextInt(100) + 1;
            arreglo2[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < tamano; i++) {
            arregloSuma[i] = arreglo1[i] + arreglo2[i];
        }

        System.out.println("Arreglo 1:");
        for (int i = 0; i < tamano; i++) {
            System.out.print(arreglo1[i] + " ");
        }

        System.out.println("\nArreglo 2:");
        for (int i = 0; i < tamano; i++) {
            System.out.print(arreglo2[i] + " ");
        }

        System.out.println("\nArreglo suma:");
        for (int i = 0; i < tamano; i++) {
            System.out.print(arregloSuma[i] + " ");
        }
    }
}
