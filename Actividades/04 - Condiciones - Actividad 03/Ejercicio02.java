import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;    
        int num4;
        
        System.out.print(" Ingresa 4 numeros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();
        num4 = entrada.nextInt();
        
        if(num1 == num2 && num1 == num3 && num1 == num4) {
            System.out.println("Todos los numeros son iguales no hay un maximo definido");

        }
        else if(num1 > num2 && num1 > num3 && num1 >num4){
            System.out.print(num1 + " Es el maximo de los 4 digitos  ingresados ");
        }else if(num2 > num1 && num2 > num3 && num2 > num4){
            System.out.print( num2+ " Es el maximo  de los 4 digitos ingresados");
        }else if(num3 > num1 && num3 > num2 && num3 > num4){
            System.out.print(num3 + " Es el maximo de los 4 digitos  ingresados");
        }else if(num4 > num1 && num4 > num2  && num4 > num3){
            System.out.print(num4 + " Es el maximo de los 4 digitos ingresados");
        }
    }   
}
