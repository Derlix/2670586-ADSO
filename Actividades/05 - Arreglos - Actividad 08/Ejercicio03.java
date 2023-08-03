import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamano;
        int maximo;

        System.out.print(" Ingresa hasta que numero queires ir: ");
        tamano = leer.nextInt();

        int arreglo[] = new int[tamano];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 1000) + 1;
        }

        maximo = arreglo[0];

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        System.out.print("Arreglo: ");
        for (int i = 0; i < tamano; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        System.out.println("El valor máximo en el arreglo es: " + maximo);
    }
}
