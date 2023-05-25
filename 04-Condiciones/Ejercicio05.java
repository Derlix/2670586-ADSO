import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;

        System.out.print(" Ingresa un numero: ");
        num1 = entrada.nextInt();

        System.out.print(" Ingresa otro numero: ");
        num2 = entrada.nextInt();

        System.out.print(" Ingresa el ultimo numero: ");
        num3 = entrada.nextInt();

        if(num1 < num2 && num2 < num3){
            System.out.println(" Los numeros se ingresaron en orden Ascendente ");

        }else {
            System.out.println(" Los numeros no fueron agregados en orden ascendente ");
        }
    }
}
