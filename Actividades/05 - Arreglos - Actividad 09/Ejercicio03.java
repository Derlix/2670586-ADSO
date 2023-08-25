import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int tamano = 100;
        String[] clientes = new String[tamano];
        int contador = 0;
        int opcion = 1;
        int CanClientes;

        while (opcion != 5) {

            System.out.println(" ");
            System.out.println(" Memoria disponible: " + (tamano - contador) + " Registros.");
            System.out.println("1: Registrar cliente.");
            System.out.println("2: Ver lista de clientes.");
            System.out.println("3: Editar cliente.");
            System.out.println("4: Eliminar cliente.");
            System.out.println("5: Salir");
            System.out.print("Ingresa la opcion deseada: ");
            opcion = leer.nextInt();

            if (opcion == 1) {
                if (contador == tamano) {
                    System.out.println(" La memoria esta llena, no puedes registrar mas clientes ");
                } else {

                    System.out.print(" Ingresa la cantidad de clientes que queires ingresar: ");
                    int clientesAregistrar = leer.nextInt();

                    leer.nextLine();

                    for (int i = 0; i < clientesAregistrar; i++) {
                        System.out.println(" ");
                        System.out.println(" Ingresa el nombre del cliente: ");
                        String nombreCliente = leer.nextLine();

                        boolean encontrado = false;
                        for (int j = 0; j < contador; j++) {
                            if (clientes[j].equals(nombreCliente)) {
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            clientes[contador] = nombreCliente;
                            contador++;
                            System.out.println("El cliente se ha registrado ");
                        } else {
                            System.out.println(" Este cliente ya se encuentra en el sistema ");
                        }

                    }

                }
            } else if (opcion == 2) {
                System.out.println(" Lista de clientes registrados: ");
                for (int i = 0; i < contador; i++) {
                    System.out.println((i + 1) + ": " + clientes[i]);
                }
            } else if (opcion == 3) {
                System.out.println(" Ingresa el nombre del cliente que deseas editar: ");
                leer.nextLine();
                String nombreBuscado = leer.nextLine();

                int posicionEncontrada = -1;
                for (int i = 0; i < contador; i++) {
                    if (clientes[i].equals(nombreBuscado)) {
                        posicionEncontrada = i;
                        break;
                    }
                }

                if (posicionEncontrada != -1) {
                    System.out.print(" Ingresa el nuevo nombre del cliente: ");
                    String nameNuevo = leer.nextLine();
                    clientes[posicionEncontrada] = nameNuevo;
                    System.out.println(" Cliente editado exitosamente.");
                } else {
                    System.out.println(" Cliente no encontrado ");
                }
            } else if (opcion == 4) {
                System.out.println("Ingresa el nombre del cliente que deseas eliminar: ");
                leer.nextLine();
                String nameQuitar = leer.nextLine();

                int posicionEliminar = -1;
                for (int i = 0; i < contador; i++) {
                    if (clientes[i].equals(nameQuitar)) {
                        posicionEliminar = i;
                        break;
                    }
                }

                if (posicionEliminar != -1) {
                    clientes[posicionEliminar] = clientes[contador - 1];
                    clientes[contador - 1] = null;
                    contador--;
                    System.out.println(" Cliente eliminado exitosamente ");
                } else {
                    System.out.println(" Cliente no encontrado ");
                }
            } else if (opcion == 5) {
                System.out.println(" Saliendo ");

            } else {

                System.out.println(" Opcion invalida Por favor, ingresa una opcion valida ");

            }

            System.out.println("  ");
        }
    }
}