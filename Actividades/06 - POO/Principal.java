public class Principal {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Pecas", "Maria", 108, "Boxer", 30.5, 10);
        Perro perro2 = new Perro("Pepito", "Oscar", 2, "Weimaraner", 4.5, 100);

        perro1.imprimir_detalle();
        perro1.ladrar(61);
        perro1.imprimir_detalle();

    }
}

// Clases: Definen nuevos tipos de datos,Una clase es una plantilla que se usara
// para crear Objetos/Variables
// Archivos con extension .java
//
// Atributos: Datos propios de la calse definida.
// Caracteristicas de la clase.
// Los atributos son variables globales.
//
// Metodos: Acciones que puede realizar un objeto perteneciente a la clase.
// Se representan como funciones
