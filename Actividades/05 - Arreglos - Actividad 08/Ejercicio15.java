import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo: ");
        int tamano = leer.nextInt();

        int[] arreglo = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingresa el elemento " + (i + 1) + ": ");
            arreglo[i] = leer.nextInt();
        }

        boolean esPalindromo = true;
        for (int i = 0; i < tamano / 2; i++) {
            if (arreglo[i] != arreglo[tamano - 1 - i]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("El arreglo es PALiNDROMO.");
        } else {
            System.out.println("El arreglo NO es palíndromo.");
        }
    }
}

