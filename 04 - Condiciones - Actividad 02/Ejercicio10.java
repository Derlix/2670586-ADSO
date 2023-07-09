import java.util.Scanner;

public class Ejercicio10 { 
    /**
     * @param args
     */
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double nota5;
        double prom;
        double NotaNec;

        System.out.print(" Ingresa la nota de Cultura Fisica: ");
        nota1 = entrada.nextDouble();

        System.out.print(" Ingresa la nota de Lengua y Literatura: ");
        nota2 = entrada.nextDouble();
        
        System.out.print(" Ingresa la nota de Ingles: ");
        nota3 = entrada.nextDouble();
        
        System.out.print(" Ingresa la nota de Matematicas: ");
        nota4 = entrada.nextDouble();
        
        System.out.print(" Ingresa la nota de Ciencias naturales: ");
        nota5 = entrada.nextDouble();
        
        System.out.println(" Notas de Cultura fisica: " +nota1);
        System.out.println(" Notas de Lengua y Literatura: " +nota2);
        System.out.println(" Notas de Ingles: " +nota3);
        System.out.println(" Notas de Matematicas: " +nota4);
        System.out.println(" Notas de Ciencias naturales: " +nota5);
        System.out.println("                      ");
        
        if (nota1 > nota2 && nota1 > nota3 && nota1 > nota4 && nota1 > nota5) {
            System.out.println(" => La asignatura con mejor nota es: Cultura Fisica");
        } else if (nota2 > nota1 && nota2 > nota3 && nota2 > nota4 && nota2 > nota5) {
            System.out.println(" => La asignatura con mejor nota es: Lengua y Literatura");
        } else if (nota3 > nota1 && nota3 > nota2 && nota3 > nota4 && nota3 > nota5) {
            System.out.println(" => La asignatura con mejor nota es: Ingles");
        } else if (nota4 > nota1 && nota4 > nota2 && nota4 > nota3 && nota4 > nota5) {
            System.out.println(" => La asignatura con mejor nota es: Matematicas");
        } else if (nota5 > nota1 && nota5 > nota2 && nota5 > nota3 && nota5 > nota4) {
            System.out.println(" => La asignatura con mejor nota es: Ciencias naturales");
        }

        if(nota1 < nota2 && nota1 < nota3 && nota1 < nota4 && nota1 < nota5){
            System.out.println(" => La asignatura con menor nota es: Cultura Fisica ");
        }else if(nota2 < nota1 && nota2 < nota3 && nota3 < nota4 && nota3 < nota5 ){
            System.out.println(" => La asignatura con menor nota es: Lengua y literatura");
        }else if(nota3 < nota1 && nota3 < nota2 && nota3 < nota4 && nota3 < nota5){
            System.out.println(" => La asignatura con menor nota es: Ingles");
        }else if( nota4 < nota1 && nota4 < nota2 && nota4 < nota3 && nota4 < nota5){
            System.out.println(" => La asignatura con menor nota es: Matematicas");
        }else if(nota5 < nota1 && nota5 < nota2 && nota5 < nota3 && nota5 < nota4){
            System.out.println(" => La asignatura con menor nota es: Ciencias Naturales ");

        }

        prom = (nota1 + nota2 + nota3 + nota4 + nota5) /5;

        System.out.print(" => El promedio de sus notas son: " + prom);
        
        if ( prom < 3){
            if(nota1 <= nota2 && nota1<= nota3 && nota1 <= nota4 && nota1 < nota5 ){
                NotaNec = (3 * 5)-(nota2 + nota3 + nota4 + nota5);
                System.out.println(" Debio obtener una nota de " + NotaNec + "en Cultura Fisica para alcanzar el promedio de 3. ");
            }
        }
    }
}