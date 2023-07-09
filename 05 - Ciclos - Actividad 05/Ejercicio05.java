import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero;
        int contador = 1;
        int fac = 1;
        String sucesion = "";

        System.out.print(" Ingrese numero N: ");
        numero = leer.nextInt();

        do{
            fac *= contador;
            sucesion += contador;
            if(contador< numero){
                sucesion +=",";
            }
            contador++;
        }while(contador <= numero);
        System.out.println(" Sucesion de numeros: " + sucesion);
        System.out.println(" Factorial de " + numero +": " + fac);
    }    
}
