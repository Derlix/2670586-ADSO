public class Aprendices {
    // Atributos
    String codigo;
    String nombre;
    String areadeconocimiento;
    int DuracionEnHoras;
    String temas[] = new String[14];

    // Constructor
    public Aprendices(String code, String name, String knowledge, int hours, String themes) {
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

    }

}
