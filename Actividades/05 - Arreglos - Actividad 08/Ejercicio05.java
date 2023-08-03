import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa el tamano del arreglo: ");
        int tamano = leer.nextInt();

        double[] arreglo = new double[tamano];

        for (int i = 0; i < tamano; i++) {
            arreglo[i] = random.nextDouble();
        }

        double suma = 0;
        for (int i = 0; i < tamano; i++) {
            suma += arreglo[i];
        }

        double promedio = suma / tamano;

        System.out.println("Arreglo generado: ");
        for (int i = 0; i < tamano; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + arreglo[i]);
        }

        System.out.println("El promedio de todos los elementos es: " + promedio);
    }
}
