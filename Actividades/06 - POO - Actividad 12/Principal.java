import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        Cursos cursos[] = new Cursos[100];
        int cursoCount = 0;
        int opcion = 0;

        cursos[0]=new Cursos("1089", "Ingles", "Tobe", 48, 3);
        cursos[1]=new Cursos("188", "Matematicas", "Funciones", 102,4);


        while (opcion != 7) {
            System.out.println("+--------------------------------------------+");
            System.out.println("|                MENU DE CURSOS              |");
            System.out.println("+--------------------------------------------+ ");
            System.out.println("|                             Memoria:" + (100 - cursoCount) + "    |");
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
                    System.out.print("Agrega el codigo del curso: ");
                    String codigo = leer.nextLine();

                    System.out.print("Pon un nombre para este curso: ");
                    String nombre = leer.nextLine();
                    System.out.print("Escribe el area de conocimiento: ");
                    String areadeconocimiento = leer.nextLine();
                    System.out.print("Ingresa las horas del curso: ");
                    int DuracionEnHoras = num.nextInt();
                    
                    System.out.print("Ingresa las cantidad de temas: ");
                    int cantidadTemas = num.nextInt();
                    
        
                    cursos[cursoCount] = new Cursos(codigo, nombre, areadeconocimiento, DuracionEnHoras, cantidadTemas);
                    // Crear una instancia de Cursos
                    cursoCount++;
                } else {
                    System.out.println("LA MEMORIA ESTA LLENA NO PUEDES");
                    System.out.println("     AGREGAR MAS CURSOS        ");
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
                        cursos[i].imprimir_detalles();
                        cursoEncontrado = true;
                        break; // Terminamos el bucle porque ya encontramos el curso
                    }
                }

                if (!cursoEncontrado) {
                    System.out.println("No se encontro un curso con el codigo especificado.");
                }
            }

            if (opcion == 4) {
                System.out.println(" Digita el codigo del curso a editar: ");
                for (int i = 0; i < cursoCount; i++) {
                    if (cursos[i] != null) {
                        System.out.println(" Ficha: " + cursos[i].getCodigo());
                    }
                }
                int code = num.nextInt();
                boolean cursoEncontrado = false;
                for (int i = 0; i < cursoCount; i++) {
                    if (cursos[i] != null && cursos[i].getCodigo().equals(code)) {
                        
                        System.out.println(" Nuevo Codigo ");
                        String newcode = leer.nextLine();
                        System.out.println(" Nuevo Nombre ");
                        String newnombre = leer.nextLine();
                        System.out.println("Nuevo Area de conocimiento ");
                        String newnareadec = leer.nextLine();
                        System.out.println("Nueva duracion ");
                        int newnduracion = leer.nextInt();
                        System.out.println("nuevo tema " );

                        cursos[i].setCodigo(newcode);
                        cursos[i].setNombre(newnombre);
                        cursos[i].setAreadeconocimiento(newnareadec);
                        cursos[i].setDuracionEnHoras(newnduracion);
                        System.out.println("+-----------------------------+");
                        System.out.println("| Curso editado correctamente |");
                        System.out.println("+-----------------------------+");

                        cursoEncontrado = true;
                        break; // Terminamos el bucle porque ya encontramos el curso
                    }
                }
                if (cursoEncontrado!= false) {
                    System.out.println(" El curso no ha sido encontrado ");
                }
                
            }
            if (opcion == 5) {
                
                System.out.print("Codigo del curso al que deseas agregar un tema: ");
                String codigoCurso = leer.nextLine();
                boolean cursoEncontrado = false;
                for (int i = 0; i < cursoCount; i++) {
                    if (cursos[i] != null && cursos[i].getCodigo().equals(codigoCurso)) {
                        
                        System.out.print("Nombre del tema: ");
                        String nuevoTema = leer.nextLine();
                        cursos[i].agregarTema(nuevoTema);
                        break; // Termina el bucle una vez que se ha encontrado y actualizado el curso.
                        
                    }
                }
                if (cursoEncontrado!= true) {
                    System.out.println(" El curso no ha sido encontrado ");
                }

            }
            if (opcion == 6){

            }

            if (opcion == 7) {
                System.out.println("+----------------+");
                System.out.println("|   Saliendo...  | ");
                System.out.println("+----------------+ ");
            }
            
        }
        leer.close();
        num.close();
    }

}
