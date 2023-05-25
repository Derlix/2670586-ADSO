import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print("Ingresa el primer numero: ");
        num1 = entrada.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        num2 = entrada.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        num3 = entrada.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es: " + num2);
        } else {
            System.out.println("El numero mayor es: " + num3);
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("El numero menor es: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("El numero menor es: " + num2);
        } else {
            System.out.println("El numero menor es: " + num3);
        }
    }
}
