import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        int dia = numero / 1000000;
        int mes = (numero / 10000) % 100;
        int anio = numero % 10000;

        String fechaEnTexto = "";

        if (dia >= 1 && dia <= 31) {
            if (dia <= 19) {
                if (dia == 1) {
                    fechaEnTexto = "UNO";
                } else if (dia == 2) {
                    fechaEnTexto = "DOS";
                } else if (dia == 3) {
                    fechaEnTexto = "TRES";
                } else if (dia == 4) {
                    fechaEnTexto = "CUATRO";
                } else if (dia == 5) {
                    fechaEnTexto = "CINCO";
                } else if (dia == 6) {
                    fechaEnTexto = "SEIS";
                } else if (dia == 7) {
                    fechaEnTexto = "SIETE";
                } else if (dia == 8) {
                    fechaEnTexto = "OCHO";
                } else if (dia == 9) {
                    fechaEnTexto = "NUEVE";
                } else if (dia == 10) {
                    fechaEnTexto = "DIEZ";
                } else if (dia == 11) {
                    fechaEnTexto = "ONCE";
                } else if (dia == 12) {
                    fechaEnTexto = "DOCE";
                } else if (dia == 13) {
                    fechaEnTexto = "TRECE";
                } else if (dia == 14) {
                    fechaEnTexto = "CATORCE";
                } else if (dia == 15) {
                    fechaEnTexto = "QUINCE";
                } else if (dia == 16) {
                    fechaEnTexto = "DIECISÉIS";
                } else if (dia == 17) {
                    fechaEnTexto = "DIECISIETE";
                } else if (dia == 18) {
                    fechaEnTexto = "DIECIOCHO";
                } else if (dia == 19) {
                    fechaEnTexto = "DIECINUEVE";
                }
            } else if (dia >= 20 && dia <= 29) {
                fechaEnTexto = "VEINTI";

                int unidad = dia % 10;

                if (unidad == 1) {
                    fechaEnTexto += "UNO";
                } else if (unidad == 2) {
                    fechaEnTexto += "DOS";
                } else if (unidad == 3) {
                    fechaEnTexto += "TRES";
                } else if (unidad == 4) {
                    fechaEnTexto += "CUATRO";
                } else if (unidad == 5) {
                    fechaEnTexto += "CINCO";
                } else if (unidad == 6) {
                    fechaEnTexto += "SEIS";
                } else if (unidad == 7) {
                    fechaEnTexto += "SIETE";
                } else if (unidad == 8) {
                    fechaEnTexto += "OCHO";
                } else if (unidad == 9) {
                    fechaEnTexto += "NUEVE";
                }
            } else if (dia == 30) {
                fechaEnTexto = "TREINTA";
            } else if (dia == 31) {
                fechaEnTexto = "TREINTA Y UNO";
            }

            if (mes >= 1 && mes <= 12) {
                fechaEnTexto += " DE ";

                if (mes == 1) {
                    fechaEnTexto += "ENERO";
                } else if (mes == 2) {
                    fechaEnTexto += "FEBRERO";
                } else if (mes == 3) {
                    fechaEnTexto += "MARZO";
                } else if (mes == 4) {
                    fechaEnTexto += "ABRIL";
                } else if (mes == 5) {
                    fechaEnTexto += "MAYO";
                } else if (mes == 6) {
                    fechaEnTexto += "JUNIO";
                } else if (mes == 7) {
                    fechaEnTexto += "JULIO";
                } else if (mes == 8) {
                    fechaEnTexto += "AGOSTO";
                } else if (mes == 9) {
                    fechaEnTexto += "SEPTIEMBRE";
                } else if (mes == 10) {
                    fechaEnTexto += "OCTUBRE";
                } else if (mes == 11) {
                    fechaEnTexto += "NOVIEMBRE";
                } else if (mes == 12) {
                    fechaEnTexto += "DICIEMBRE";
                }

                if (anio >= 1 && anio <= 9999) {
                    fechaEnTexto += " DEL ";

                    if (anio >= 1 && anio <= 9) {
                        if (anio == 1) {
                            fechaEnTexto += "UNO";
                        } else if (anio == 2) {
                            fechaEnTexto += "DOS";
                        } else if (anio == 3) {
                            fechaEnTexto += "TRES";
                        } else if (anio == 4) {
                            fechaEnTexto += "CUATRO";
                        } else if (anio == 5) {
                            fechaEnTexto += "CINCO";
                        } else if (anio == 6) {
                            fechaEnTexto += "SEIS";
                        } else if (anio == 7) {
                            fechaEnTexto += "SIETE";
                        } else if (anio == 8) {
                            fechaEnTexto += "OCHO";
                        } else if (anio == 9) {
                            fechaEnTexto += "NUEVE";
                        }
                    } else if (anio >= 10 && anio <= 99) {
                        int decena = anio / 10;
                        int unidad = anio % 10;

                        if (decena == 1) {
                            if (unidad == 0) {
                                fechaEnTexto += "DIEZ";
                            } else if (unidad == 1) {
                                fechaEnTexto += "ONCE";
                            } else if (unidad == 2) {
                                fechaEnTexto += "DOCE";
                            } else if (unidad == 3) {
                                fechaEnTexto += "TRECE";
                            } else if (unidad == 4) {
                                fechaEnTexto += "CATORCE";
                            } else if (unidad == 5) {
                                fechaEnTexto += "QUINCE";
                            } else if (unidad >= 6 && unidad <= 9) {
                                fechaEnTexto += "DIECI";

                                if (unidad == 6) {
                                    fechaEnTexto += "SEIS";
                                } else if (unidad == 7) {
                                    fechaEnTexto += "SIETE";
                                } else if (unidad == 8) {
                                    fechaEnTexto += "OCHO";
                                } else if (unidad == 9) {
                                    fechaEnTexto += "NUEVE";
                                }
                            }
                        } else if (decena == 2) {
                            fechaEnTexto += "VEINTI";

                            if (unidad == 0) {
                                fechaEnTexto += "CERO";
                            } else if (unidad == 1) {
                                fechaEnTexto += "UNO";
                            } else if (unidad == 2) {
                                fechaEnTexto += "DOS";
                            } else if (unidad == 3) {
                                fechaEnTexto += "TRES";
                            } else if (unidad == 4) {
                                fechaEnTexto += "CUATRO";
                            } else if (unidad == 5) {
                                fechaEnTexto += "CINCO";
                            } else if (unidad == 6) {
                                fechaEnTexto += "SEIS";
                            } else if (unidad == 7) {
                                fechaEnTexto += "SIETE";
                            } else if (unidad == 8) {
                                fechaEnTexto += "OCHO";
                            } else if (unidad == 9) {
                                fechaEnTexto += "NUEVE";
                            }
                        } else if (decena >= 3 && decena <= 9) {
                            if (decena == 3) {
                                fechaEnTexto += "TREINTA";
                            } else if (decena == 4) {
                                fechaEnTexto += "CUARENTA";
                            } else if (decena == 5) {
                                fechaEnTexto += "CINCUENTA";
                            } else if (decena == 6) {
                                fechaEnTexto += "SESENTA";
                            } else if (decena == 7) {
                                fechaEnTexto += "SETENTA";
                            } else if (decena == 8) {
                                fechaEnTexto += "OCHENTA";
                            } else if (decena == 9) {
                                fechaEnTexto += "NOVENTA";
                            }

                            if (unidad >= 1 && unidad <= 9) {
                                fechaEnTexto += " Y ";

                                if (unidad == 1) {
                                    fechaEnTexto += "UNO";
                                } else if (unidad == 2) {
                                    fechaEnTexto += "DOS";
                                } else if (unidad == 3) {
                                    fechaEnTexto += "TRES";
                                } else if (unidad == 4) {
                                    fechaEnTexto += "CUATRO";
                                } else if (unidad == 5) {
                                    fechaEnTexto += "CINCO";
                                } else if (unidad == 6) {
                                    fechaEnTexto += "SEIS";
                                } else if (unidad == 7) {
                                    fechaEnTexto += "SIETE";
                                } else if (unidad == 8) {
                                    fechaEnTexto += "OCHO";
                                } else if (unidad == 9) {
                                    fechaEnTexto += "NUEVE";
                                }
                            }
                        }
                    } else if (anio >= 100 && anio <= 999) {
                        int centena = anio / 100;
                        int resto = anio % 100;

                        if (centena == 1) {
                            fechaEnTexto += "CIEN";
                        } else if (centena >= 2 && centena <= 9) {
                            if (centena == 2) {
                                fechaEnTexto += "DOSCIENTOS";
                            } else if (centena == 3) {
                                fechaEnTexto += "TRESCIENTOS";
                            } else if (centena == 4) {
                                fechaEnTexto += "CUATROCIENTOS";
                            } else if (centena == 5) {
                                fechaEnTexto += "QUINIENTOS";
                            } else if (centena == 6) {
                                fechaEnTexto += "SEISCIENTOS";
                            } else if (centena == 7) {
                                fechaEnTexto += "SETECIENTOS";
                            } else if (centena == 8) {
                                fechaEnTexto += "OCHOCIENTOS";
                            } else if (centena == 9) {
                                fechaEnTexto += "NOVECIENTOS";
                            }

                            if (resto >= 1 && resto <= 9) {
                                if (resto == 1) {
                                    fechaEnTexto += " UNO";
                                } else if (resto == 2) {
                                    fechaEnTexto += " DOS";
                                } else if (resto == 3) {
                                    fechaEnTexto += " TRES";
                                } else if (resto == 4) {
                                    fechaEnTexto += " CUATRO";
                                } else if (resto == 5) {
                                    fechaEnTexto += " CINCO";
                                } else if (resto == 6) {
                                    fechaEnTexto += " SEIS";
                                } else if (resto == 7) {
                                    fechaEnTexto += " SIETE";
                                } else if (resto == 8) {
                                    fechaEnTexto += " OCHO";
                                } else if (resto == 9) {
                                    fechaEnTexto += " NUEVE";
                                }
                            } else if (resto >= 10 && resto <= 99) {
                                int decena = resto / 10;
                                int unidad = resto % 10;

                                if (decena == 1) {
                                    if (unidad == 0) {
                                        fechaEnTexto += " DIEZ";
                                    } else if (unidad == 1) {
                                        fechaEnTexto += " ONCE";
                                    } else if (unidad == 2) {
                                        fechaEnTexto += " DOCE";
                                    } else if (unidad == 3) {
                                        fechaEnTexto += " TRECE";
                                    } else if (unidad == 4) {
                                        fechaEnTexto += " CATORCE";
                                    } else if (unidad == 5) {
                                        fechaEnTexto += " QUINCE";
                                    } else if (unidad >= 6 && unidad <= 9) {
                                        fechaEnTexto += " DIECI";

                                        if (unidad == 6) {
                                            fechaEnTexto += "SEIS";
                                        } else if (unidad == 7) {
                                            fechaEnTexto += "SIETE";
                                        } else if (unidad == 8) {
                                            fechaEnTexto += "OCHO";
                                        } else if (unidad == 9) {
                                            fechaEnTexto += "NUEVE";
                                        }
                                    }
                                } else if (decena == 2) {
                                    fechaEnTexto += " VEINTI";

                                    if (unidad == 0) {
                                        fechaEnTexto += "CERO";
                                    } else if (unidad == 1) {
                                        fechaEnTexto += "UNO";
                                    } else if (unidad == 2) {
                                        fechaEnTexto += "DOS";
                                    } else if (unidad == 3) {
                                        fechaEnTexto += "TRES";
                                    } else if (unidad == 4) {
                                        fechaEnTexto += "CUATRO";
                                    } else if (unidad == 5) {
                                        fechaEnTexto += "CINCO";
                                    } else if (unidad == 6) {
                                        fechaEnTexto += "SEIS";
                                    } else if (unidad == 7) {
                                        fechaEnTexto += "SIETE";
                                    } else if (unidad == 8) {
                                        fechaEnTexto += "OCHO";
                                    } else if (unidad == 9) {
                                        fechaEnTexto += "NUEVE";
                                    }
                                } else if (decena >= 3 && decena <= 9) {
                                    if (decena == 3) {
                                        fechaEnTexto += " TREINTA";
                                    } else if (decena == 4) {
                                        fechaEnTexto += " CUARENTA";
                                    } else if (decena == 5) {
                                        fechaEnTexto += " CINCUENTA";
                                    } else if (decena == 6) {
                                        fechaEnTexto += " SESENTA";
                                    } else if (decena == 7) {
                                        fechaEnTexto += " SETENTA";
                                    } else if (decena == 8) {
                                        fechaEnTexto += " OCHENTA";
                                    } else if (decena == 9) {
                                        fechaEnTexto += " NOVENTA";
                                    }

                                    if (unidad >= 1 && unidad <= 9) {
                                        fechaEnTexto += " Y ";

                                        if (unidad == 1) {
                                            fechaEnTexto += "UNO";
                                        } else if (unidad == 2) {
                                            fechaEnTexto += "DOS";
                                        } else if (unidad == 3) {
                                            fechaEnTexto += "TRES";
                                        } else if (unidad == 4) {
                                            fechaEnTexto += "CUATRO";
                                        } else if (unidad == 5) {
                                            fechaEnTexto += "CINCO";
                                        } else if (unidad == 6) {
                                            fechaEnTexto += "SEIS";
                                        } else if (unidad == 7) {
                                            fechaEnTexto += "SIETE";
                                        } else if (unidad == 8) {
                                            fechaEnTexto += "OCHO";
                                        } else if (unidad == 9) {
                                            fechaEnTexto += "NUEVE";
                                        }
                                    }
                                }
                            }
                        }
                    }

                    System.out.println("La fecha en texto es: " + fechaEnTexto);
                } else {
                    System.out.println("El año no es válido.");
                }
            } else {
                System.out.println("El mes no es válido.");
            }
        } else {
            System.out.println("El día no es válido.");
        }
    }
}
