import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        int NumOrigin;

        int d1;
        int d2;
        int d3;
        int d4;

        System.out.print(" Ingresa un numero para determinar si es palindromo ");
        num = entrada.nextInt();

        NumOrigin = num;

        d1 = num % 10;
        num = num / 10;

        d2 = num % 10;
        num = num / 10;
        
        d3 = num % 10;
        num = num / 10;

        d4 = num % 10;
        num = num / 10;

        if( (d1 == d4) && (d2 == d3)){
            System.out.print("El numero " + NumOrigin + " es un palindromo "  );
        }else if(d1==d3&& d3== d1){
            System.out.println(" El numero " + NumOrigin + " es palindromo ");
        }else{
            System.out.print("El numero " + NumOrigin + " no es un palindromo");
        }
    }
}
