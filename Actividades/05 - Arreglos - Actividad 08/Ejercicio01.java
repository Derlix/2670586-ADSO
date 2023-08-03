import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int tamano = 0;

        System.out.print(" Ingresa el tamano deseado: ");
        tamano = leer.nextInt();

        int ar[] = new int[tamano];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = (i + 1) * 2;
        }

        for (int i = 0; i < tamano; i++) {
            System.out.print(" [" + ar[i] + "] ");
        }

        // int edad [] = new int [10];
        //
        // edad [1] = leer.nextInt();
        //
        // int estatura [] = {180,150,120,110,140}; // no hay que indicar cuando son
        // llenos
        //
        // edad [0] = 25;
        //
        // int x [] = new int[3];
        // String listado [] = new String [10];

    }

}