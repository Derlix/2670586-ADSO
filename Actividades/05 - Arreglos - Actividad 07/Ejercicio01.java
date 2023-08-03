import java.util.Scanner;

/**
 * Ejercicio01
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int tamano=0;
       


        System.out.print(" Ingresa el tamano deseado: ");
        tamano = leer.nextInt();

        int ar [] = new int [tamano];

        for(int i=0;i<ar.length;i++){
            ar [i] = ( i+ 1) *2 -1;
        }

        for(int i = 0;i<tamano;i++){
            System.out.print(" ["+ar[i]+"] ");   
        }

    }
    
}