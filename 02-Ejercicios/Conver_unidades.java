import java.util.Scanner;

public class Conver_unidades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double metros;
        double centimetros;
        double pulgadas;
        double pies;

        System.out.print("Ingrese la longitud en metros: ");
        metros = entrada.nextDouble();
        
        centimetros = metros *100;
        pulgadas = metros * 39.37;
        pies = metros * 3.281;

        System.out.println("Longitud en centímetros: " + centimetros);
        System.out.println("Longitud en pulgadas: " + pulgadas);
        System.out.println("Longitud en pies: "+pies);
    }
}
