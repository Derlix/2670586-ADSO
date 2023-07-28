import java.util.Scanner;

public class Calculo_promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        double prom;
        double resul;

        System.out.println("Ingresa numeros");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();
        num4 = entrada.nextInt();
        num5 = entrada.nextInt();

        prom = num1 + num2 + num3 + num4 + num5;

        resul = prom / 5;


        System.out.println("El promedio de los números es " + resul);
    }
}
