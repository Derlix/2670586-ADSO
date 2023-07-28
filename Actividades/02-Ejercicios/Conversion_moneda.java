import java.util.Scanner;

public class Conversion_moneda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double COP;
        double USD;
        double EUR;
        double JPY;
        double GBP;

        double conversionCOP;
        double conversionUSD;
        double conversionEUR;
        double conversionJPY;
        double conversionGBP;

        System.out.println("Ingrese la cantidad que desea convertir");
        COP = entrada.nextInt();
        USD = 0.00022;
        EUR = 0.00020;
        JPY = 0.030;
        GBP = 0.00018;

        conversionUSD = COP * USD;
        conversionEUR = COP * EUR;
        conversionJPY = COP * JPY;
        conversionGBP = COP * GBP;


        System.out.println("USD:" + conversionUSD);
        System.out.println("EUR:" + conversionEUR);
        System.out.println("JPY:" + conversionJPY);
        System.out.println("GBP:" + conversionGBP);

    }
}
