import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double horas;
        double TRHora;
        double salarioSemanal;
        double horasEXT;
        
        System.out.print(" Ingresa las horas trabajadas: ");
        horas = entrada.nextInt();

        System.out.print(" Ingresa la tarifa de horas de trabajo: ");
        TRHora = entrada.nextInt();
        
        horasEXT = 0;

        if(horas<=40 ){
            salarioSemanal = horas * TRHora;
        }else{
            
            salarioSemanal = (40 * TRHora) + ((horas - 40) * TRHora * 1.5);
        }

        System.out.print(" El salario semanal es:" + salarioSemanal);
        /* no se que tarifas de hora poner  */
    }
}
