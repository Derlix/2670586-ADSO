import java.util.Scanner;

public class Concatenacion_de_cadenas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena1;
        String cadena2;
        String concadenar;

        System.out.println("Ingresa la primera cadena de texto");
        cadena1 = entrada.nextLine();

        System.out.println("Ingresa la segunda cadena de texto");
        cadena2 = entrada.nextLine();

        concadenar = cadena1 + cadena2; 

        System.out.println("La concatenación de las cadenas es: " + concadenar);
    }
}
