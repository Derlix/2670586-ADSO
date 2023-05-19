import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double celsius;
        double fahrenheit;
        
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        celsius = entrada.nextDouble();
        
        fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);

    }
}

