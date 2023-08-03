import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int num = leer.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Ingresa un valor para la posición " + i + ": ");
            arr[i] = leer.nextInt();
        }

        System.out.print("Ingresa el número de movimientos: ");
        int numMovimientos = leer.nextInt();

        
        for (int mov = 1; mov <= numMovimientos; mov++) {
            int temp = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = temp;

        
            System.out.print("Movimiento " + mov + ": { ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" }");
        }
    }
}
