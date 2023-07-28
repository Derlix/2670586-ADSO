import java.util.Scanner;

public class Division_y_resto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        double div;
        double resto;

        System.out.println("Ingresa un numero");
        num1 = entrada.nextInt();

        System.out.println("Ingresa otro numero");
        num2 = entrada.nextInt();

        div =  num1 / num2 ;

        resto = num1 - (div * num2);

        System.out.println("La división de " + num1 + " entre " + num2 + " es: " + div);
        System.out.println("El resto de la division de " + num1 + " entre " +num2+ " es "+resto);
    }
    
}
