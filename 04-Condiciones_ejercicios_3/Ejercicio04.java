import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;

        double prom;

        System.out.print(" Ingresa tu primera nota: ");
        nota1 = entrada.nextDouble();
        
        System.out.print(" Ingresa tu segunda nota: ");
        nota2 = entrada.nextDouble();
        
        System.out.print(" Ingresa tu tercera nota: ");
        nota3 = entrada.nextDouble();

        prom = (nota1 + nota2 + nota3) / 3;

        if(prom >= 7){
            System.out.print( "Tu nota es: " + prom +" por lo tanto has aprobado ");
        }else{
            System.out.print( "Tu nota es: " + prom + " por lo tanto no has aprobado ");
        }
    }
}
