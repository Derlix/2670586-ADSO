import java.util.Scanner;

public class Ponderado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double nota;
        double nota2;
        double nota3;

        int cred;
        int cred2;
        int cred3;

        double sumaN;
        int sumaC;
        double resulP;

        System.out.println("POR FAVOR INGRESA LAS NOTAS Y LOS CREDITOS ");
        System.out.println("               DE LAS 3 MATERIAS           ");
        System.out.println("                                           ");
        System.out.println("Nota de la 1era materia");
        nota = entrada.nextDouble();

        System.out.println("Creditos de la 1era materia");
        cred = entrada.nextInt();

        System.out.println("Nota de la 2da materia");
        nota2 = entrada.nextDouble();

        System.out.println("Creditos de la 2da materia");
        cred2 = entrada.nextInt();

        System.out.println("Nota de la 3era materia");
        nota3 = entrada.nextDouble();

        System.out.println("Creditos de la 3era materia");
        cred3 = entrada.nextInt();

        sumaN = (nota*cred) + (nota2*cred2) + (nota3*cred3);
        sumaC = cred + cred2 + cred3;
        resulP = sumaN / sumaC;

        System.out.println("El promedio ponderado de las notas es " + resulP);



    }
}
