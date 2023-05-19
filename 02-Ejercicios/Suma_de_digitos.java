import java.util.Scanner;

public class Suma_de_digitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int resul;

        System.out.println("Ingresa 5 numeros enteros");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();
        num4 = entrada.nextInt();
        num5 = entrada.nextInt();

        resul = num1 + num2 + num3 + num4 + num5;

        System.out.println("El resultado es "+ resul);
    }
}
