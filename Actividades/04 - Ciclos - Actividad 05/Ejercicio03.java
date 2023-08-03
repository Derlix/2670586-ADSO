
import java.util.Scanner;
import java.util.Random;


public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        int contador=1;
        int numero=2;
        int i;
        int aleatorio;
        boolean primo;
        
        

        System.out.print(" Ingresa un numero ");
        n = leer.nextInt();

        while(contador<=n){
            aleatorio = new Random().nextInt(100)+1;
            primo = true;

            for(i=2;i<= aleatorio/2;i++){
                if(aleatorio % i == 0){
                primo = false;   
                break;    
            }

            }

            if(primo){
                System.out.println("Primo " + contador + " generado: " +aleatorio);
                contador = contador +1;
            }

            
            
        }

        
    }
}
