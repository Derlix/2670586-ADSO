import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double CFinanciada;
        double CCPagadas;
        double VCCuato;
        double IPagados;
        double IenPorcentaje;

        System.out.print(" Ingresa la cantidad total financiada: ");
        CFinanciada = leer.nextDouble();

        System.out.print(" Ingresa la cantidad de cuatos pagadas: ");
        CCPagadas = leer.nextDouble();

        System.out.print(" Valor de cada cuota: ");
        VCCuato = leer.nextDouble();

        IPagados = (CCPagadas * VCCuato) - CFinanciada;
        IenPorcentaje = (IPagados /CFinanciada) * 100;

        System.out.print(" Total de interes pagado:" +IenPorcentaje + "%" );
    }
}
