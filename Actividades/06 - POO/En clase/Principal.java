import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Persona listadepepersona[] = new Persona[99];
        int indicePersona = 0;
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNums = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 11) {
            System.out.println("\n");
            System.out.println("+----------------------------------------+");
            System.out.println("|               MENU DE PERSONAS         |");
            System.out.println("|----------------------------------------|");
            System.out.println("|                              Memoria:" + (99 - indicePersona) + "|");
            System.out.println("| 1: Registrar Persona                   |");
            System.out.println("| 2: Ver lista de Personas               |");
            System.out.println("| 3: Editar Persona                      |");
            System.out.println("| 4: Eliminar Persona                    |");
            System.out.println("| 5: Persona mayor edad                  |");
            System.out.println("| 6: Persona menor edad                  |");
            System.out.println("| 7: Persona más alta                    |");
            System.out.println("| 8: Persona más baja                    |");
            System.out.println("| 9: Promedio de edades                  |");
            System.out.println("| 10: Promedio de altura                 |");
            System.out.println("| 11: Salir                              |");
            System.out.println("+----------------------------------------|");
            System.out.print(" -} Ingresa una opcion:");
            opcion = entradaNums.nextInt();

            if (opcion == 1) {
                System.out.println("\n");
                System.out.println("+----------------------------------------+");
                System.out.println("|            Registrando persona         |");
                System.out.println("+----------------------------------------+");
                System.out.print(" Ingrese Cedula:");
                int cedula = entradaNums.nextInt();
                entradaTexto.nextLine();
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
                System.out.println("\n");
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
                System.out.println("\n");
                System.out.println("+----------------------------------------+");
                System.out.println("|            Editar persona              |");
                System.out.println("+----------------------------------------+");
                System.out.print(" Ingrese cedula: ");
                int cedula = entradaNums.nextInt();

                int indiceEncontrada = -1;
                entradaTexto.nextLine();
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
                System.out.println("\n");
                System.out.println("+----------------------------------------+");
                System.out.println("|            Eliminar persona            |");
                System.out.println("+----------------------------------------+");
                System.out.print(" Ingrese cedula: ");
                int cedula = entradaNums.nextInt();

                int indiceEncontrada = -1;
                entradaTexto.nextLine();
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

                int mayorEdad = -1;
                Persona personaMayorEdad = null;

                for (int i = 0; i < listadepepersona.length; i++) {
                    if (listadepepersona[i] != null && listadepepersona[i].getEdad() > mayorEdad) {
                        mayorEdad = listadepepersona[i].getEdad();
                        personaMayorEdad = listadepepersona[i];
                    }
                }

                if (personaMayorEdad != null) {
                    System.out.println("Persona con mayor edad:");
                    System.out.println(personaMayorEdad.getInfo());
                } else {
                    System.out.println("No hay personas registradas.");
                }
            }

            if (opcion == 6) {

                int menorEdad = Integer.MAX_VALUE;
                Persona personaMenorEdad = null;

                for (int i = 0; i < listadepepersona.length; i++) {
                    if (listadepepersona[i] != null && listadepepersona[i].getEdad() < menorEdad) {
                        menorEdad = listadepepersona[i].getEdad();
                        personaMenorEdad = listadepepersona[i];
                    }
                }

                if (personaMenorEdad != null) {
                    System.out.println("Persona con menor edad:");
                    System.out.println(personaMenorEdad.getInfo());
                } else {
                    System.out.println("No hay personas registradas.");
                }
            }

            if (opcion == 7) {
                int alturaMaxima = 0;
                int indicePersonaMasAlta = -1;

                for (int i = 0; i < listadepepersona.length; i++) {
                    if (listadepepersona[i] != null && listadepepersona[i].getAltura() > alturaMaxima) {
                        alturaMaxima = listadepepersona[i].getAltura();
                        indicePersonaMasAlta = i;
                    }
                }

                if (indicePersonaMasAlta != -1) {
                    System.out.println(
                            "La persona más alta es: " + listadepepersona[indicePersonaMasAlta].getNombres() + " "
                                    + listadepepersona[indicePersonaMasAlta].getApellidos());
                    System.out.println("Altura: " + listadepepersona[indicePersonaMasAlta].getAltura());
                } else {
                    System.out.println("No hay personas registradas para determinar la más alta.");
                }

            }

            if (opcion == 8) {

                int alturaMinima = Integer.MAX_VALUE;
                int indicePersonaMasBaja = -1;

                for (int i = 0; i < listadepepersona.length; i++) {
                    if (listadepepersona[i] != null && listadepepersona[i].getAltura() < alturaMinima) {
                        alturaMinima = listadepepersona[i].getAltura();
                        indicePersonaMasBaja = i;
                    }
                }

                if (indicePersonaMasBaja != -1) {
                    System.out.println(
                            "La persona más baja es: " + listadepepersona[indicePersonaMasBaja].getNombres() + " "
                                    + listadepepersona[indicePersonaMasBaja].getApellidos());
                    System.out.println("Altura: " + listadepepersona[indicePersonaMasBaja].getAltura());
                } else {
                    System.out.println("No hay personas registradas para determinar la más baja.");
                }
            }

            if (opcion == 9) {
                int sumaEdades = 0;
                int totalPersonas = 0;

                for (int i = 0; i < listadepepersona.length; i++) {
                    if (listadepepersona[i] != null) {
                        sumaEdades += listadepepersona[i].getEdad();
                        totalPersonas++;
                    }
                }

                if (totalPersonas > 0) {
                    double promedioEdades = (double) sumaEdades / totalPersonas;
                    System.out.println("Promedio de edades: " + promedioEdades);
                } else {
                    System.out.println("No hay personas registradas para calcular el promedio de edades.");
                }

            }

            if (opcion == 10) {
                int sumaAlturas = 0;
                int totalPersonas = 0;

                for (int i = 0; i < listadepepersona.length; i++) {
                    if (listadepepersona[i] != null) {
                        sumaAlturas += listadepepersona[i].getAltura();
                        totalPersonas++;
                    }
                }

                if (totalPersonas > 0) {
                    double promedioAlturas = (double) sumaAlturas / totalPersonas;
                    System.out.println("Promedio de altura: " + promedioAlturas);
                } else {
                    System.out.println("No hay personas registradas para calcular el promedio de altura.");
                }
            }
            if (opcion == 11) {
                System.out.println("\n");
                System.out.println(" SALIENDO....");
                System.out.println("\n");
            }
        }
    }
}
