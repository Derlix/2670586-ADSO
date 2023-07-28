import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = leer.nextInt();

        int[] arreglo = new int[tamano];

        
        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el valor para la posición " + (i + 1) + ": ");
            arreglo[i] = leer.nextInt();
        }

        System.out.print("Ingrese un número correspondiente a una posición dentro del arreglo: ");
        int posicion = leer.nextInt();

        System.out.println("Arreglo original:");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.println("Valores en sentido anti horario desde la posición " + posicion + ":");
        for (int i = posicion - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        for (int i = tamano - 1; i >= posicion; i--) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
