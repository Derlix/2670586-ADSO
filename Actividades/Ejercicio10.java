import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa el tamaño del arreglo: ");
        int tamano = leer.nextInt();

        int[] arregloOriginal = new int[tamano];

        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloOriginal[i] = random.nextInt(100) + 1;
        }

        int[] arregloSinRepetir = new int[tamano];
        int index = 0;

        for (int i = 0; i < arregloOriginal.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < index; j++) {
                if (arregloOriginal[i] == arregloSinRepetir[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                arregloSinRepetir[index] = arregloOriginal[i];
                index++;
            }
        }

        
        System.out.println("Arreglo original:");
        for (int i = 0; i < arregloOriginal.length; i++) {
            System.out.print(arregloOriginal[i] + " ");
        }

        System.out.println("\nArreglo sin repetir:");
        for (int i = 0; i < index; i++) {
            System.out.print(arregloSinRepetir[i] + " ");
        }
    }
}
