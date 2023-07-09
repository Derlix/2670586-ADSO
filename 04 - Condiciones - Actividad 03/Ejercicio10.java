import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /* cambio entrada por leer porque lo entiendo mas facil por pseint */
        
        int FechaDeNacimiento;
        int edad;

        System.out.print(" Ingresa tu fecha de nacimiento: ");
        FechaDeNacimiento = leer.nextInt();

        edad = 2023 - FechaDeNacimiento;

        if(edad >= 18){
            System.out.print(" Eres mayor de edad ");
        }else{
            System.out.print(" Eres menor de edad ");
        }
    }
}
