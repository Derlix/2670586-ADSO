import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int tamano;

        System.out.println(" Ingresa cuantos numeros quieres imprimir: ");
        tamano = leer.nextInt();

        int par[] = new int[tamano];
        int impar[] = new int[tamano];
        int arreglo[] = new int[tamano];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100) + 1;
        }

        int CanPares = 0;
        int CanImpares = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                par[CanPares] = arreglo[i];
                CanPares++;
            } else {
                impar[CanImpares] = arreglo[i];
                CanImpares++;
            }
        }

        System.out.println("Arreglo generado:");
        for (int i = 0; i < tamano; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + arreglo[i]);
        }

        System.out.println("\nArreglo de numeros pares:");
        for (int i = 0; i < CanPares; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println("\nArreglo de numeros impares:");
        for (int i = 0; i < CanImpares; i++) {
            System.out.print(impar[i] + " ");
        }
    }
}
