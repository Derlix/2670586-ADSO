import java.util.Scanner;

public class Registro_de_empleados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        int salario;


        System.out.println(" Ingrese su nombre ");
        nombre = entrada.nextLine();

        System.out.println(" Ingrese su edad ");
        edad = entrada.nextInt();

        System.out.println(" Ingrese su salario ");
        salario = entrada.nextInt();

        System.out.println(" Nombre: " + nombre);
        System.out.println(" Edad: " + edad);
        System.out.println("Salario:" + salario);
    }
 
}
