import java.util.Scanner;

public class Variable_sin_auxiliar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingresa un número");
        num1 = entrada.nextInt();

        System.out.println("Ingresa otro número");
        num2 = entrada.nextInt();

        
        System.out.println("Los valores son");

        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Valores intercambiados:");
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
    }
}