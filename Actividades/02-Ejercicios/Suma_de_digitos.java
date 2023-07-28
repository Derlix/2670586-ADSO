import java.util.Scanner;

public class Suma_de_digitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int resul;

        System.out.print("Ingresa 5 numeros enteros: ");
        num = entrada.nextInt();
        
        num1 =  num%10;
        num2 = (num%100)/10;
        num3 = (num%1000)/100;
        num4 = (num%10000)/1000;
        num5 =  num/10000;

        System.out.println("Numero 1:  " + num1);
        System.out.println("Numero 2:  " + num2);
        System.out.println("Numero 3:  " + num3);
        System.out.println("Numero 4:  " + num4);
        System.out.println("Numero 5:  " + num5);

        resul = num1 + num2 + num3 + num4 + num5;

        System.out.println("El resultado es "+ resul);
    }
}
