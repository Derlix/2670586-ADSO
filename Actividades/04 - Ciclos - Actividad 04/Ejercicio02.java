import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double Cmaterias;
        double nota=0;
        double creditos=0;
        double contador;
        double sumaNotas = 0;
        double prom;
        double promcredito = 0;

        System.out.print(" Ingresa cantidad de materias ");
        Cmaterias = leer.nextInt();

        
        contador = 1;
        while (contador <= Cmaterias) {
            System.out.print(" Ingresa nota " + contador + " :");
            nota = leer.nextDouble();
            System.out.print(" Ingresa credito nota " + contador+ ":");
            creditos = leer.nextInt();

            promcredito = promcredito + creditos;
            sumaNotas = nota + sumaNotas;
            contador = contador + 1;
        }
        
        prom = sumaNotas / Cmaterias;
        System.out.print(" Los creditos son " + promcredito);
        System.out.print(" El promedio  es:"+prom);
    }
}
