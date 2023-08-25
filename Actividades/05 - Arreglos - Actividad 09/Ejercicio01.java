import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamano;

        System.out.print(" Ingresa el tamano: ");
        tamano = leer.nextInt();

        leer.nextLine();
        String datos[]= new String[tamano];
        
        for(int i = 0;i<datos.length;i++){
            System.out.println("Ingresa solo palabras: ");
            datos[i] = leer.nextLine();
        }

        System.out.println(" ");

        for(int i = 0;i<tamano;i++){
            System.out.println("Los datos ingresados son: "+datos[i]);
        }
        
    }    
}
