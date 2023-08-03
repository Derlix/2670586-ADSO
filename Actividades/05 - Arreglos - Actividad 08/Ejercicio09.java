import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        int n;
        int m;

        System.out.println(" Ingresa hasta que numero queires ir: ");
        n = leer.nextInt();

        int Arreglo[] = new int[n];

        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = random.nextInt(100) + 1;
        }

        System.out.println(" Ingresa el numero a buscar: ");
        m = leer.nextInt();

        int posicion = -1;

        for (int i = 0; i < Arreglo.length; i++) {
            if (Arreglo[i] == m) {
                posicion = i;
                break;
            }
        }
        if (posicion != -1) {
            System.out.println("El numero " + m + " se encuentra en la posicion " + posicion);
        } else {
            System.out.println("El numero " + m + " no se encuentra en el arreglo Posicion" + posicion);
            
        }

    }
}
