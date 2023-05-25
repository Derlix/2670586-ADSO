import java.util.Scanner;

public class Ejercicio06{
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num;
        int opcion;
        int digito;
        digito = 0;
        System.out.print(" Ingresa un numero que contenga 6 digitos: ");
        num = entrada.nextInt();

        System.out.println(" El numero es:" + num);
        System.out.println("---------------------------------------------------------");
        System.out.println("| Menu                                                  |");
        System.out.print("| 1. primer digito");System.out.print(" 2. segundo digito "); System.out.println(" 3. tercer digito  |");
        System.out.print("| 4. cuarto digito");System.out.print(" 5. cinco digito   ");   System.out.println(" 6. sexto digito   |");
        System.out.println("---------------------------------------------------------");
        System.out.print(" Ingresa una opcion valida ");
        opcion = entrada.nextInt();
              
        
        
        if (opcion == 1) {
            digito = num / 100000;
        } else if (opcion == 2) {
            digito = (num / 10000) % 10;
        } else if (opcion == 3) {
            digito = (num / 1000) % 10;
        } else if (opcion == 4) {
            digito = (num / 100) % 10;
        } else if (opcion == 5) {
            digito = (num / 10) % 10;
        } else if (opcion == 6) {
            digito = num % 10;
        }
    
        System.out.println("El digito seleccionado es: " + digito);

    }
}