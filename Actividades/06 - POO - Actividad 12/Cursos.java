public class Cursos {
    // Atributos

    String codigo;
    String nombre;
    String areadeconocimiento;
    int DuracionEnHoras;
    String temas[];

    // Constructor
    public Cursos(String code, String name, String knowledge, int hours, int cantTemas) {
        codigo = code;
        nombre = name;
        areadeconocimiento = knowledge;
        DuracionEnHoras = hours;
        temas = new String[cantTemas];
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
        System.out.println("+------------------------------------+");
        System.out.println("| Codigo | Nombre | Duracion hrs |");
        System.out.println("|  " + codigo + " | " + nombre + " | " + DuracionEnHoras + " |");
        System.out.println("+------------------------------------+");
    }

    public void imprimir_detalles() {
        
        System.out.println("+------------------------------------+");
        System.out.println("| Codigo | Nombre | Duracion hrs | Temas  |");
        System.out.println("|  " + codigo + " | " + nombre + " | " + DuracionEnHoras + " | " + temas);
        System.out.println("+------------------------------------+");
    }


    public void agregarTema(String nuevoTema) {
        for (int i = 0; i < temas.length; i++) {
            if (temas[i] == null) {
                temas[i] = nuevoTema;
                System.out.println("Tema agregado exitosamente: " + nuevoTema);
                return; // Termina la función una vez que se ha agregado el tema.
            }else{
                System.out.println("No se pueden agregar mas temas a este curso.");
            }
        }
    }

}
