import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int mcm;
        int max;
        System.out.println("A continuacion ingresa 3 numeros enteros:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();

        
        max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        
        mcm = max;
        while (true) {
            if (mcm % num1 == 0 && mcm % num2 == 0 && mcm % num3 == 0) {
                break;
            }
            mcm++;
        }

        System.out.println("El MCM de los numeros ingresados es: " + mcm);
    }
}
