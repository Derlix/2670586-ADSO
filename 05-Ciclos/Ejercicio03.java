import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int altura;
        int i;
        int j;
        
        System.out.print("Ingresa la altura de la piramide: ");
        altura = entrada.nextInt();

        for ( i = 1; i <= altura; i++) {
            for ( j = 1; j <= i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
