import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int resul;

        System.out.println("Escribe un número para sumar");
        num1 = entrada.nextInt();

        System.out.println("Escribe otro número para ver el resultado de la suma");
        num2 = entrada.nextInt();

        resul = num1 + num2;

        System.out.println("El resultado es "+resul);
    }
}