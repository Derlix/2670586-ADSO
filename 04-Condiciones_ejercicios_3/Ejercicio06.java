import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.print(" Ingresa tu edad para votar ");
        edad = entrada.nextInt();

        if(edad >= 18){
            System.out.print(" Usted es mayor de edad por lo tanto puede votar ");
        }else{
            System.out.print(" Usted es menor de edad por lo tanto no puede votar ");
        }
    }
}
