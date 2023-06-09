import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int anio;
        

        System.out.print(" Ingresa un anio para calcular si es bisiesto ");
        anio = entrada.nextInt();

        

        if(anio % 400 == 0){
            System.out.print(" El anio es bisiesto");
        }else if(anio % 100 == 0){
            System.out.print(" EL anio no es bisiesto ");
        }else if(anio %4 == 0){
            System.out.print(" El anio es bisiesto ");
        }else{
            System.out.print(" El anio no es bisiesto ");
        }
    }
}
