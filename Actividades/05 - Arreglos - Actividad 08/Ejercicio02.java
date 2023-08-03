import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int tamano;
        long producto = 1;

        System.out.print(" Ingresa hasta que numero quieres ir: ");
        tamano = leer.nextInt();

        int Arreglo[] = new int[tamano];

        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = (int) (Math.random() * 1000) + 1;
            producto *= Arreglo[i];
        }

        System.out.println("El producto de los elementos del arreglo son: " + producto);
    }
}
