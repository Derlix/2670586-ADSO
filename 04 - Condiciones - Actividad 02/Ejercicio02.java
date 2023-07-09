import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        int uDigito;

        System.out.print("Ingresa un numero de 3 digitos: ");
        num = entrada.nextInt();

        uDigito = num % 10;

        if (uDigito % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }
}
