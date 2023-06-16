import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int CNotas;
        double prom;
        double nota;
        double sumaNotas = 0;
        int contador;

        System.out.print(" Ingresa la cantidad de notas deseadas: ");
        CNotas = leer.nextInt();
        
        contador = 1;
        while(contador <= CNotas){
            System.out.print(" Ingresa notas " +contador+":");
            nota = leer.nextDouble();

            sumaNotas = sumaNotas + nota;

            contador = contador+1;
        }

        prom = sumaNotas / CNotas;
        System.out.print("-> El promedio del estudiante es: " + prom);
    }    
}
