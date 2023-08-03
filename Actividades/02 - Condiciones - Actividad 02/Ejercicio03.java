import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int x ;
        int y ;
        String cuadrante;

        System.out.println(" Ingresa el valor de X y Y, para saber en que cuadrante se encuentra ");
        System.out.print(" X: ");
        x = entrada.nextInt();
        System.out.print(" Y: ");
        y = entrada.nextInt();

        if(x > 0 && y > 0){
            cuadrante = " Primer cuadrante ";
        }else if(x < 0 && y > 0){
            cuadrante = " Segundo cuadrante ";
        }else if(x < 0 && y< 0){
            cuadrante = " Tercer cuadrante ";
        }else if( x > 0 && y < 0) {
            cuadrante = " Cuarto cuadrante ";
        }else{
            cuadrante = "  origen ";
        }

        System.out.println(" El punto X: " + x + " Y el punto Y: " + y + " Se encuentra en el " + cuadrante);
    }
    
}
