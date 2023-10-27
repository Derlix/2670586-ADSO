import java.util.Scanner;

public class Cursos {
    // Atributos
    Scanner leer = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    String codigo;
    String nombre;
    String areadeconocimiento;
    int DuracionEnHoras;
    String temas[] = new String[14];
    {
        temas[0] = "Tema 1";
        temas[1] = "Tema 2";
        temas[2] = "Tema 3";
        temas[3] = "Tema 4";
        temas[4] = "Tema 5";
        temas[5] = "Tema 6";
        temas[6] = "Tema 7";
        temas[7] = "Tema 8";
        temas[8] = "Tema 9";
        temas[9] = "Tema 10";
        temas[10] = "Tema 11";
        temas[11] = "Tema 12";
        temas[12] = "Tema 13";
        temas[13] = "Tema 14";
    }

    // Constructor
    public Cursos(String code, String name, String knowledge, int hours, String themes) {
        codigo = code;
        nombre = name;
        areadeconocimiento = knowledge;
        DuracionEnHoras = hours;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreadeconocimiento() {
        return areadeconocimiento;
    }

    public void setAreadeconocimiento(String areadeconocimiento) {
        this.areadeconocimiento = areadeconocimiento;
    }

    public int getDuracionEnHoras() {
        return DuracionEnHoras;
    }

    public void setDuracionEnHoras(int duracionEnHoras) {
        DuracionEnHoras = duracionEnHoras;
    }

    public String[] getTemas() {
        return temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public void imprimir_detalle() {
        System.out.println("+--------------------------------+");
        System.out.println("| Codigo | Nombre | Duracion hrs |");
        System.out.println("|  " + codigo + " | " + nombre + " | " + DuracionEnHoras + "|");
        System.out.println("+--------------------------------+");

    }

    public Cursos crearCurso() {

        System.out.print("Agrega el codigo del curso: ");
        codigo = leer.nextLine();

        System.out.print("Pon un nombre para este curso: ");
        nombre = leer.nextLine();
        System.out.print("Escribe el area de conocimiento: ");
        areadeconocimiento = leer.nextLine();
        System.out.print("Ingresa las horas del curso: ");
        DuracionEnHoras = num.nextInt();
        System.out.println("Elige el tema: ");
        for (int i = 0; i < temas.length; i++) {
            System.out.print("[" + temas[i] + "]");
        }
        String tema = leer.nextLine();

        return new Cursos(codigo, nombre, areadeconocimiento, DuracionEnHoras, tema);
    }

    public void editar(int indice, Cursos[] cursos) {

        if (indice >= 0 && indice < cursos.length) {
            System.out.println(" Nuevo Codigo ");
            String newcode = leer.nextLine();
            System.out.println(" Nuevo Nombre ");
            String newnombre = leer.nextLine();
            System.out.println("Nuevo Area de conocimiento ");
            String newnareadec = leer.nextLine();
            System.out.println("Nueva duracion ");
            int newnduracion = leer.nextInt();
            for (int i = 0; i < temas.length; i++) {
                System.out.print("[" + temas[i] + "]");
            }
            String tema = leer.nextLine();
            cursos[indice].setCodigo(newcode);
            cursos[indice].setNombre(newnombre);
            cursos[indice].setAreadeconocimiento(newnareadec);
            cursos[indice].setDuracionEnHoras(newnduracion);
            cursos[indice].setTemas(tema);
            System.out.println("+-----------------------------+");
            System.out.println("| Curso editado correctamente |");
            System.out.println("+-----------------------------+");

        } else {
            System.out.println("+-----------------------------+");
            System.out.println("|   Indice fuera de rango     |");
            System.out.println("| No se puede editar el curso |");
            System.out.println("+-----------------------------+");
        }

    }

    public void agregarTema(String nuevoTema) {
        for (int i = 0; i < temas.length; i++) {
            if (temas[i] == null) {
                temas[i] = nuevoTema;
                System.out.println("Tema agregado exitosamente: " + nuevoTema);
                return; // Termina la función una vez que se ha agregado el tema.
            }
        }
        System.out.println("No se pueden agregar más temas a este curso.");
    }

}
