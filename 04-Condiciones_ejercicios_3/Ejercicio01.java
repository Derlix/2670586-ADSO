import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int num1;

    System.out.print(" Ingrese un numer0: ");
    num1 = entrada.nextInt();
    
    if(num1 < 0 ){
        System.out.print(" El numero: "+ num1 +" es negativo ");
    }else{
        System.out.print(" El numero: "+ num1 + " es positivo");
    }

    }


}