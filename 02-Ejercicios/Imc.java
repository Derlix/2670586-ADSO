import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double peso;
        double altura;
        double indice;

        System.out.println("Ingrese su peso y altura");
        peso = entrada.nextDouble();
        altura = entrada.nextDouble();
        
        indice = peso / (altura * altura);

        System.out.println("Su indice de masa corporal es: " + indice);

    }

}
