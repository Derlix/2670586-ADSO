import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int tamano;

        int suma = 0;

        System.out.print(" Ingresa el tamano:");
        tamano = leer.nextInt();

        int Arreglo[] = new int[tamano];

        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = (int) (Math.random() * 1000) + 1;

            suma = Arreglo[i] + suma;
        }

        for (int i = 0; i < Arreglo.length; i++) {
            System.out.println("numero generado " + i + " :" + Arreglo[i] + " ");
        }

        System.out.println("La suma de los numeros random es: " + suma);
    }
}
