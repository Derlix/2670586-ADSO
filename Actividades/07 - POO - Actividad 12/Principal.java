import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 7) {
            System.out.println("+--------------------------------------------+");
            System.out.println("|                MENU DE CURSOS              |");
            System.out.println("+--------------------------------------------+ ");
            System.out.println("|                             Memoria: 100   |");
            System.out.println("|  1. Crear curso.                           |");
            System.out.println("|  2. Listar todos los cursos.               |");
            System.out.println("|  3. Ver detalle de curso.                  |");
            System.out.println("|  4. Editar informacion de un curso.        |");
            System.out.println("|  5. Agregar tema a curso.                  |");
            System.out.println("|  6. Eliminar curso.                        |");
            System.out.println("|  7. Salir.                                 |");
            System.out.println("|                                            |");
            System.out.println("+--------------------------------------------+ ");
            System.out.print(" -> Elige una opcion: ");
            opcion = num.nextInt();
        }
        if (opcion == 1) {

        }
        if (opcion == 2) {

        }
        if (opcion == 3) {

        }
        if (opcion == 4) {

        }
        if (opcion == 5) {

        }
        if (opcion == 6) {

        }

        if (opcion == 7) {
            System.out.println("+----------------+");
            System.out.println("|   Saliendo...  | ");
            System.out.println("+----------------+ ");
        }
    }
}
