import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 3) {
            System.out.println("");
            System.out.println("|------- Bienvenido -------|");
            System.out.println("| 1. Docente               |");
            System.out.println("| 2. Estudiante            |");
            System.out.println("| 3. Salir                 |");
            System.out.println("|--------------------------|");
            System.out.print("--> Ingresa una opcion: ");
            opcion = leer.nextInt();

            if (opcion == 1) {
                int CNotas = 0;
                System.out.print(" Ingresa la cantidad de notas deseadas: ");
                CNotas = leer.nextInt();

                double prom;
                double nota;
                double sumaNotas = 0;
                int contador;
                contador = 1;

                while (contador <= CNotas) {
                    System.out.print(" Ingresa notas " + contador + ":");
                    nota = leer.nextDouble();

                    sumaNotas = sumaNotas + nota;

                    contador = contador + 1;
                }
                prom = sumaNotas / CNotas;
                System.out.println("-> El promedio del estudiante es: " + prom);

            } else if (opcion == 2) {
                double Cmaterias;
                double nota = 0;
                double creditos = 0;
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
                    System.out.print(" Ingresa credito nota " + contador + ":");
                    creditos = leer.nextInt();

                    promcredito = promcredito + creditos;
                    sumaNotas = nota + sumaNotas;
                    contador = contador + 1;
                }
                prom = sumaNotas / Cmaterias;
                System.out.print(" Los creditos son " + promcredito);
                System.out.print(" El promedio  es:" + prom);
                System.out.println();
                System.out.println();

            } else if (opcion == 03) {
                System.out.println(" Usted salio :)");
            }

        }

    }
}
