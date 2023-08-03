import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamano;
        int minimo;

        System.out.print(" Ingresa hasta que numero queires ir: ");
        tamano = leer.nextInt();

        int arreglo[] = new int[tamano];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 1000) + 1;
        }

        minimo = arreglo[0];

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Arreglos: " + arreglo[i]);
        }

        System.out.println("El valor minimo en el arreglo es: " + minimo);
    }
}
