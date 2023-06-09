import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double area;


        System.out.print(" Ingresa la base de un triangulo en valor positivo: ");
        base = entrada.nextInt();

        System.out.print(" Ingresa la altura de un triangulo en valor positivo: ");
        altura = entrada.nextInt();

        if(base < 0 && altura < 0){
            System.out.print(" La base y altura deben ser valores positivos ");
        }

        

        if(base > 0 && altura > 0){
            area = (base * altura) / 2;
            System.out.print("El area del triangulo es:  " + area);

        }
    }
}
