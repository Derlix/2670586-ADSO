import java.util.Scanner;

public class Interes_compuesto {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);


    double inicial;
    double interes;
    double periodoNums;
    
    double interesD;
    double monto_final;
    
    System.out.println("Ingrese una inversion inicial");
    inicial = entrada.nextDouble();
    
    System.out.println("Ingresa la tasa de interes");
    System.out.println("(En porcentaje: por ejemplo 0.1 para 1%)");
    interes = entrada.nextDouble();

    System.out.println("Ingresa el numero de periodos");
    periodoNums = entrada.nextDouble();

    interesD = interes / 100;
    monto_final = inicial * Math.pow((1 + interesD), periodoNums);

    System.out.println("El monto final es: " + monto_final);
    }   
}
