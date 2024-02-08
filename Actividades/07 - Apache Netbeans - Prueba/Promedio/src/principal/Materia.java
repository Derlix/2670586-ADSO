
package principal;

public class Materia {
    
    private String nombre;
    private float creditos;
    private float nota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCreditos() {
        return creditos;
    }

    public void setCreditos(float creditos) {
        this.creditos = creditos;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Materia(String nombre, float creditos, float nota) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.nota = nota;
    }
    
}
