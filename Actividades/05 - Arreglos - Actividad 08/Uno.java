import java.io.IOException;
import java.util.Scanner;

public class Uno {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int memoria = 100;
        String[] clientes = new String[memoria];
        int n_clientes = 0;
        int opcion = 0;
        do {
            try {
                System.out.println("Memoria disponible: " + memoria);
                System.out.println("1: Registrar cliente.");
                System.out.println("2: Ver lista de clientes.");
                System.out.println("3: Editar cliente.");
                System.out.println("4: Eliminar cliente.");
                System.out.println("5: Salir");
                System.out.print("Ingrese una opcion: ");
                opcion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese una opcion valida");
                break;
            }
            switch (opcion) {
                case 1:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    scanner.nextLine();
                    if (n_clientes == memoria) {
                        System.out.println("No hay memoria disponible para mas clientes.");
                    } else {
                        System.out.print("Ingrese el nombre completo del cliente: ");
                        String nombre = scanner.nextLine();
                        int buscar = -1;
                        for (int i = 0; i < n_clientes; i++) {
                            if (clientes[i] != null && clientes[i].equals(nombre)) {
                                buscar = i;
                                break;
                            }
                        }
                        if (buscar != -1) {
                            System.out.println("El cliente ya está registrado.");
                        } else {
                            clientes[n_clientes] = nombre;
                            n_clientes++;
                            System.out.println("Cliente registrado exitosamente.");
                            memoria--;
                        }
                    }
                    break;
                case 2:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Lista de clientes:");
                    for (int i = 0; i < n_clientes; i++) {
                        System.out.println((i + 1) + ". " + clientes[i]);
                    }
                    break;
                case 3:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del cliente a editar: ");
                    String Editar = scanner.nextLine();

                    int indiceEditar = -1;
                    for (int i = 0; i < n_clientes; i++) {
                        if (clientes[i] != null && clientes[i].equals(Editar)) {
                            indiceEditar = i;
                            break;
                        }
                    }
                    if (indiceEditar == -1) {
                        System.out.println("El cliente no esta registrado.");
                    } else {
                        System.out.print("Ingrese el nuevo nombre: ");
                        String nuevoNombre = scanner.nextLine();

                        clientes[indiceEditar] = nuevoNombre;
                        System.out.println("El cliente fue editado exitosamente.");
                    }
                    break;
                case 4:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del cliente que desea eliminar: ");
                    String Eliminar = scanner.nextLine();

                    int indiceEliminar = -1;
                    for (int i = 0; i < n_clientes; i++) {
                        if (clientes[i] != null && clientes[i].equals(Eliminar)) {
                            indiceEliminar = i;
                            break;
                        }
                    }
                    if (indiceEliminar == -1) {
                        System.out.println("El cliente no esta registrado.");
                    } else {
                        for (int i = indiceEliminar; i < n_clientes - 1; i++) {
                            clientes[i] = clientes[i + 1];
                        }
                        clientes[n_clientes - 1] = null;
                        n_clientes--;

                        System.out.println("El cliente fue eliminado");
                        memoria++;
                    }
                    break;
                case 5:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
            System.out.println();
        } while (opcion != 5);
        scanner.close();
    }
}