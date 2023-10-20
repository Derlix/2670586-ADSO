import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        Cursos cursos [] = new Cursos[100];
        int cursoCount=0;
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("+--------------------------------------------+");
            System.out.println("|                MENU DE CURSOS              |");
            System.out.println("+--------------------------------------------+ ");
            System.out.println("|                             Memoria:"+(100-cursoCount)+"    |");
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
            if (opcion == 1) {
                
                if (cursoCount < 100) {
                    cursos[cursoCount] = new Cursos("", "", "", 0, null); // Crear una instancia de Cursos
                    cursos[cursoCount] = cursos[cursoCount].crearCurso(); // Llamar a crearCurso en la instancia
                    cursoCount++;
                } else {
                    System.out.println("LA MEMORIA ESTA LLENA NO PUEDES");
                    System.out.println("     AGREGAR MAS CURSOS");
                }
            }
            if (opcion == 2) {
                System.out.println("Lista de todos los cursos:");
                for (int i = 0; i < cursoCount; i++) {
                    if (cursos[i] != null) {
                        System.out.println("Curso " + (i + 1));
                        cursos[i].imprimir_detalle();
                    }
                }
            }            
            if (opcion == 3) {
                System.out.println("Ingresa el codigo del curso: ");
                String code = leer.nextLine();
                boolean cursoEncontrado = false;
            
                for (int i = 0; i < cursoCount; i++) {
                    if (cursos[i] != null && cursos[i].getCodigo().equals(code)) {
                        cursos[i].imprimir_detalle();
                        cursoEncontrado = true;
                        break; // Terminamos el bucle porque ya encontramos el curso
                    }
                }
            
                if (!cursoEncontrado) {
                    System.out.println("No se encontro un curso con el codigo especificado.");
                }
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

    
}
