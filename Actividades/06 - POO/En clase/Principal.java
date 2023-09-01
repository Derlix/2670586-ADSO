import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Persona listadepepersona[] = new Persona[99];
        int indicePersona = 0;
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNums = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n");
            System.out.println("+----------------------------------------+");
            System.out.println("|               MENU DE PERSONAS         |");
            System.out.println("|----------------------------------------|");
            System.out.println("|                              Memoria:" + (99 - indicePersona) + "|");
            System.out.println("| 1: Registrar Persona                   |");
            System.out.println("| 2: Ver lista de Personas               |");
            System.out.println("| 3: Editar Persona                      |");
            System.out.println("| 4: Eliminar Persona                    |");
            System.out.println("| 5: Salir                               |");
            System.out.println("+----------------------------------------|");
            System.out.print(" -} Ingresa una opcion:");
            opcion = entradaNums.nextInt();

            if (opcion == 1) {
                System.out.println("\n\n");
                System.out.println("+----------------------------------------+");
                System.out.println("|            Registrando persona         |");
                System.out.println("+----------------------------------------+");
                System.out.print(" Ingrese Cedula:");
                int cedula = entradaNums.nextInt();
                entradaTexto.nextLine(); // Limpiar el búfer de entrada
                System.out.print(" Ingrese Nombres:");
                String nombres = entradaTexto.nextLine();
                System.out.print(" Ingrese Apellidos:");
                String apellidos = entradaTexto.nextLine();
                System.out.print(" Ingrese Edad:");
                int edad = entradaNums.nextInt();
                System.out.print(" Ingrese Altura:");
                int altura = entradaNums.nextInt();
                System.out.print(" Ingrese Peso:");
                double peso = entradaNums.nextDouble();

                Persona temporal = new Persona(cedula, nombres, apellidos, edad, altura, peso);
                listadepepersona[indicePersona] = temporal;

                indicePersona++;
            }

            if (opcion == 2) {
                System.out.println("\n\n");
                System.out.println("+----------------------------------------+");
                System.out.println("|            Lista de Personas           |");
                System.out.println("+----------------------------------------+");

                for (int i = 0; i < listadepepersona.length; i++) {
                    if (listadepepersona[i] != null) {
                        System.out.println((i + 1) + " -} " + listadepepersona[i].getInfo());
                    }
                }
            }

            if (opcion == 3) {
                System.out.println("\n\n");
                System.out.println("+----------------------------------------+");
                System.out.println("|            Editar persona              |");
                System.out.println("+----------------------------------------+");
                System.out.print(" Ingrese cedula: ");
                int cedula = entradaNums.nextInt();

                int indiceEncontrada = -1;
                entradaTexto.nextLine(); // Limpiar el búfer de entrada
                for (int i = 0; i < listadepepersona.length; i++) {
                    if (listadepepersona[i] != null && listadepepersona[i].getCedula() == cedula) {
                        indiceEncontrada = i;
                    }
                }

                if (indiceEncontrada != -1) {
                    System.out.print(" Ingrese Nombres:");
                    String nombres = entradaTexto.nextLine();
                    System.out.print(" Ingrese Apellidos:");
                    String apellidos = entradaTexto.nextLine();
                    System.out.print(" Ingrese Edad:");
                    int edad = entradaNums.nextInt();
                    System.out.print(" Ingrese Altura:");
                    int altura = entradaNums.nextInt();
                    System.out.print(" Ingrese Peso:");
                    double peso = entradaNums.nextDouble();

                    Persona temporal = new Persona(cedula, nombres, apellidos, edad, altura, peso);
                    listadepepersona[indiceEncontrada] = temporal;
                } else {
                    System.out.println("+----------------------------------------+");
                    System.out.println("|          La cedula: " + cedula + "          |");
                    System.out.println("|         no a sido encontrada           |");
                    System.out.println("+----------------------------------------+");
                }
            }

            if (opcion == 4) {
                System.out.println("\n\n");
                System.out.println("+----------------------------------------+");
                System.out.println("|            Eliminar persona            |");
                System.out.println("+----------------------------------------+");
                System.out.print(" Ingrese cedula: ");
                int cedula = entradaNums.nextInt();

                int indiceEncontrada = -1;
                entradaTexto.nextLine(); // Limpiar el búfer de entrada
                for (int i = 0; i < listadepepersona.length; i++) {
                    if (listadepepersona[i] != null && listadepepersona[i].getCedula() == cedula) {
                        indiceEncontrada = i;
                    }
                }

                if (indiceEncontrada != -1) {
                    for (int i = indiceEncontrada; i < listadepepersona.length - 1; i++) {
                        listadepepersona[i] = listadepepersona[i + 1];
                    }
                    listadepepersona[listadepepersona.length - 1] = null;
                    indicePersona--;
                    System.out.println("+----------------------------------------+");
                    System.out.println("|            Persona eliminada            |");
                    System.out.println("+----------------------------------------+");
                }
            }

            if (opcion == 5) {
                System.out.println("\n");
                System.out.println(" SALIENDO....");
                System.out.println("\n");
            }

            System.out.println("\n\n ");
        }
    }
}
