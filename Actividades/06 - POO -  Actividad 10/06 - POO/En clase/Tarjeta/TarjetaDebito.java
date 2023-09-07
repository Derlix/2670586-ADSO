import java.util.ArrayList;
import java.util.List;

class TarjetaDebito {
    private String nombrePropietario;
    private String numeroTarjeta;
    private String nombreBanco;
    private int cantidadDinero;
    private int cantidadPermitidaRetirar;
    private List<String> ultimasTransacciones;
    private String clave;
    private String estado;

    public TarjetaDebito(String nombrePropietario, String numeroTarjeta, String nombreBanco, int cantidadDinero, String clave) {
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreBanco = nombreBanco;
        this.cantidadDinero = cantidadDinero;
        this.cantidadPermitidaRetirar = cantidadDinero;
        this.ultimasTransacciones = new ArrayList<>();
        this.clave = clave;
        this.estado = "ACTIVA";
    }

    public void disminuirSaldo(int monto) {
        if (monto <= cantidadDinero) {
            cantidadDinero -= monto;
            String fecha = obtenerFechaActual();
            String tipoTransaccion = "Retiro";
            String estadoTransaccion = "Exitoso";
            agregarTransaccion(fecha, tipoTransaccion, monto, estadoTransaccion);
        } else {
            System.out.println("Saldo insuficiente en la tarjeta.");
        }
    }

    public void aumentarSaldo(int monto) {
        cantidadDinero += monto;
        String fecha = obtenerFechaActual();
        String tipoTransaccion = "Consignación";
        String estadoTransaccion = "Exitosa";
        agregarTransaccion(fecha, tipoTransaccion, monto, estadoTransaccion);
    }

    private void agregarTransaccion(String fecha, String tipo, int monto, String estadoTransaccion) {
        String transaccion = fecha + "-" + tipo + "-" + monto + "-" + estadoTransaccion;
        ultimasTransacciones.add(transaccion);
    }

    public int consultarSaldo() {
        return cantidadDinero;
    }

    public void setClave(String nuevaClave) {
        clave = nuevaClave;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String obtenerFechaActual() {
        // Aquí puedes implementar la lógica para obtener la fecha actual.
        // Por ejemplo, puedes utilizar la clase java.util.Date o java.time.LocalDate.
        // En este ejemplo, simplemente se devuelve una cadena con la fecha actual ficticia.
        return "2023-09-01"; // Fecha ficticia
    }
}
