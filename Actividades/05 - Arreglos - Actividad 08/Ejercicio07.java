import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int tamano;

        System.out.print(" Ingresa el tamano:");
        tamano = leer.nextInt();

        int Arreglo[] = new int[tamano];

        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = random.nextInt(100) + 1;
        }


        int OrderInv[] = new int[tamano];

        System.out.println("Arreglo generado:");
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + Arreglo[i]);
        }
        for (int i = tamano - 1, j = 0; i >= 0; i--, j++) {
            OrderInv[j] = Arreglo[i];
        }
        System.out.println("\nArreglo en orden inverso:");
        for (int i = 0; i < OrderInv.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + OrderInv[i]);
        }
    }
}