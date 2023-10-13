import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);

        Perro perros[] = new Perro[50];

        // perros[0] = new Perro("Pecas", "Daniela", 108, "Boxer", 30.5, 50);
        // perros[1] = new Perro("Pepe", "Sebas", 9, "Pitbull", 40.6, 90);
        // perros[2] = new Perro("Pepe", "Sebas", 9, "Pitbull", 90.0, 90);

        for (int i = 0; i < perros.length; i++) {

            if (perros[i] != null) {

                System.out.println("Perro " + (i + 1) + " :" + perros[i].getNombre());

                perros[i].imprimir_detalle();

            }

        }
        // Perro mas pesado
        Perro mas_pesado = perros[0];
        for (int i = 0; i < perros.length; i++) {
            if (perros[i] != null) {

                if (perros[i].getPeso() >= mas_pesado.getPeso()) {
                    mas_pesado = perros[i];
                }

            }
        }
        if (mas_pesado != null) {
            System.out.println("Nombre mas pesado: " + mas_pesado.getNombre());
            System.out.println("Propietario de mas pesado: " + mas_pesado.getPropietario());
            System.out.println("Peso de mas pesado: " + mas_pesado.getPeso());
        } else {
            System.out.println(" La lista no contiene perros");
        }

        numero.close();
        leer.close();
    }
}