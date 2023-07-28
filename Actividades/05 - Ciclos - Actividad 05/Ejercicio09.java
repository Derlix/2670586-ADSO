import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sumaDigitos;

        System.out.print("Ingrese un numero entero: ");
        n = scanner.nextInt();

        while (n > 9) {
            sumaDigitos = 0;
            while (n != 0) {
                sumaDigitos += n % 10;
                n /= 10;
            }
            n = sumaDigitos;
        }

        System.out.println("La raiz digital del numero es: " + n);
    }
}
