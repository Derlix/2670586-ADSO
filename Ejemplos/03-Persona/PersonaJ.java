class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class EjemploArregloPersonas {
    public static void main(String[] args) {
        Persona[] personas = new Persona[10];

        personas[0] = new Persona("Alice", 25);
        personas[1] = new Persona("Bob", 30);
        personas[2] = new Persona("Charlie", 22);
        personas[3] = new Persona("David", 28);
        personas[4] = new Persona("Eve", 23);
        personas[5] = new Persona("Frank", 35);

        System.out.println("Lista de personas:");

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null) {
                System.out.println("Nombre: " + personas[i].getNombre() + ", Edad: " + personas[i].getEdad());
            }
        }
    }
}
