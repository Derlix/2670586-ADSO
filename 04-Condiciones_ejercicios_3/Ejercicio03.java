import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int proceso;
        System.out.print(" Ingresa un numero ");
        num1 = entrada.nextInt();   

        proceso = num1 % 2 ;
        
        if(proceso == 0){
            System.out.print(" El numero ingresado es par");
        }else{
            System.out.print(" El numero ingresado no es par");
        }
        
        
    }
}
