import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.println("Hola usuario, Cual es tu edad");
        edad = entrada.nextInt();

        if(edad < 18 ){
            System.out.println("Usted es menor de edad por lo tanto tiene un auxilio de $800.000");
        
        }else{
            System.out.println("Usted es mayor de edad por lo tanto tiene un auxilio de $200.000");

        }
    }
}