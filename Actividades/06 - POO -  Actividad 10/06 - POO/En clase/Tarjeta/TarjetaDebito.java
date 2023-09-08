import java.util.Date;

public class TarjetaDebito {
    private String Propietario;
    private String numeroTarjeta;
    private String Banco;
    private int DineroDis;
    private int permitoretiro;
    private String ultimasTrans[];
    private String clave;
    private String estado;

    public TarjetaDebito(String nombrePropietario, String numeroTarjeta, String nombreBanco, int cantidadDinero,
            String clave) {
        this.Propietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.Banco = nombreBanco;
        this.DineroDis = cantidadDinero;
        this.permitoretiro = cantidadDinero;
        this.ultimasTrans = new String[10];
        this.clave = clave;
        this.estado = "ACTIVA";
    }

    public void registrarTransaccion(String tipo, String NumeroTarjeta, int monto, String estado) {
        Date fecha = new Date();
        String texto = fecha.toString() + tipo + " - " + NumeroTarjeta + " - " + estado;

        // Buscar indice vacio

        int indice = -1;
        for (int i = 0; i < ultimasTrans.length; i++) {
            if (ultimasTrans[i] == null) {
                indice = i;
            }
            break;
        }

        if (indice != -1) {
            ultimasTrans[indice] = texto;
        } else {
            for (int i = 0; i < ultimasTrans.length - 1; i++) {
                ultimasTrans[i] = ultimasTrans[+1];
            }
            ultimasTrans[ultimasTrans.length - 1] = texto;
        }
    }

    public void registrarTrans(String Tipo, int pe, String estado) {

    }

    public void verHistorialTarjeta(String pass) {
        if (pass.equals(clave)) {
            registrarTrans("historial", 0, "OK");
            for (int i = 0; i < ultimasTrans.length; i++) {
                if (ultimasTrans[i] != null) {
                    System.out.println(" -> PEPEPE" + ultimasTrans[i]);
                }
            }

        } else {
            System.out.println("ACCESO DENEGADO");
        }

    }

    public boolean disminuirSaldo(int monto, String pass) {
        if (pass.equals(clave)) {
            if (monto > 0 && monto <= permitoretiro) {
                if (monto <= DineroDis) {
                    DineroDis += monto;
                    System.out.println(" ---> Transaccion exitosa en tarjeta <---");
                    registrarTrans("Disminuir Saldo", monto, "ok");
                    return true;
                }
                System.out.println(" ---> ERROR EN LA TRANSACCION <---");
                registrarTrans("Disminuir Saldo", monto, "ERROR");
                return false;
            } else {
                System.out.println(" ---> ERROR EN LA TRANSACCION <---");
                registrarTrans("Disminuir saldo ", monto, "ERROR");
                return false;
            }
        }
        // Si la contraseña no es correcta Sale error
        else {
            System.out.println(" ---> ERROR EN LA TRANSACCION <---");
            registrarTrans("Disminuir Saldo", monto, "ERROR");
            return false;
        }
    }

    public boolean aumentarSaldo(int monto, String pass) {
        // Verificamos contraseña
        if (pass.equals(clave)) {
            if (monto > 0 && monto <= permitoretiro) {
                if (monto <= DineroDis) {
                    DineroDis += monto;
                    System.out.println(" ---> Transaccion exitosa en tarjeta <---");
                    registrarTrans("Aumento Saldo", monto, "ok");
                    return true;
                }
                System.out.println(" ---> ERROR EN LA TRANSACCION <---");
                registrarTrans("AumentoSaldo", monto, "ERROR");
                return false;
            } else {
                System.out.println(" ---> ERROR EN LA TRANSACCION <---");
                registrarTrans("AumentoSaldo", monto, "ERROR");
                return false;
            }
        }
        // Si la contraseña no es correcta Sale error
        else {
            System.out.println(" ---> ERROR EN LA TRANSACCION  Disminucion<---");
            registrarTrans("AumentoSaldo", monto, "ERROR");
            return false;
        }

    }


    public int consultarSaldo() {
        return DineroDis;
    }

    public void setClave(String nuevaClave) {
        clave = nuevaClave;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public int getSaldo(String pass) {
        if (pass.equals(clave)) {
            registrarTrans("ConsultaSaldo", 0, "OK");
            return DineroDis;
        } else {
            registrarTrans("ConsultaSaldo", 0, "Error");
        }
        return DineroDis;
    }

    public String obtenerFechaActual() {
        // Aquí puedes implementar la lógica para obtener la fecha actual.
        // Por ejemplo, puedes utilizar la clase java.util.Date o java.time.LocalDate.
        // En este ejemplo, simplemente se devuelve una cadena con la fecha actual
        // ficticia.
        return "2023-09-01"; // Fecha ficticia
    }

    public boolean validarClave(String pass) {
        if (pass.equals(clave)) {
            registrarTrans("ValidarClave", 0, "OK");
            return true;
        } else {
            registrarTrans("ValidarClave", 0, "Error");
            return false;
        }
    }

    public boolean validarActica() {
        if (estado.equals("ACTIVA")) {
            return true;
        } else {
            return false;
        }
    }

    public String getnumero() {
        return numeroTarjeta;
    }

}
