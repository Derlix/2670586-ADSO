import java.util.Scanner;

public class Segundos_a_horas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int segundos;
        int horas;
        int minutos;
        
        System.out.print("Ingresa el número de segundos: ");
        segundos = entrada.nextInt();

        horas = segundos / 3600;
        segundos -= horas * 3600;

        minutos = segundos / 60;
        segundos -= minutos *60;

        System.out.print("El tiempo equivalente es:  " + horas + " Horas, " + minutos+ " Minutos, " + segundos + " segundos " );
    }
}
