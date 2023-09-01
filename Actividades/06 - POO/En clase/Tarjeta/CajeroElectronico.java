import java.util.Date;

public class CajeroElectronico {

    int capacidadTotal;
    int dineroDisponible;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String nombreBanco;
    String[] listaTransacciones;
    String usuarioAdmin;
    String claveAdmin;

    public CajeroElectronico(int capacidadTotal, int dineroDisponible, int cant_10, int cant_20, int cant_50,
        int cant_100, String nombreBanco, String listaTransacciones, String UsuarioAdmin, String claveAdmin) {
        this.capacidadTotal = capacidadTotal;
        this.dineroDisponible = dineroDisponible;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.nombreBanco = nombreBanco;
        this.listaTransacciones = new String[100];
        this.usuarioAdmin = UsuarioAdmin;
        this.claveAdmin = claveAdmin;
    }

    public CajeroElectronico(int capacidadTotal, String nombreBanco, String UsuarioAdmin, String claveAdmin) {
        this.capacidadTotal = capacidadTotal;
        this.nombreBanco = nombreBanco;
        this.listaTransacciones = new String[100];
        this.usuarioAdmin = UsuarioAdmin;
        this.claveAdmin = claveAdmin;
        this.dineroDisponible = 0; // Establecer dineroDisponible a 0 por defecto
        this.cant_10 = 0; // Establecer cantidades a 0 por defecto
        this.cant_20 = 0;
        this.cant_50 = 0;
        this.cant_100 = 0;
    }

    public void imprimirdetalle() {
        System.out.println("---------------------------------------------");
        System.out.println("Capacidad total: " + capacidadTotal);
        System.out.println("Dinero disponible: " + dineroDisponible);
        System.out.println("Cant_10: " + cant_10);
        System.out.println("Cant_20: " + cant_20);
        System.out.println("Cant_50: " + cant_50);
        System.out.println("Cant_100: " + cant_100);
        System.out.println("Nombre del Banco: " + nombreBanco);
        System.out.println("Usuario - Admin: " + usuarioAdmin);
        System.out.println("Clave - Admin: " + claveAdmin);
        System.out.println("Historial de Transacciones: ");
        for (int i = 0; i < listaTransacciones.length; i++) {
            if (listaTransacciones[i] != null) {
                System.out.println("    -> " + listaTransacciones[i]);
            }
        }
        System.out.println("Total en efectivo disponible: " + dineroDisponible); // Agregar esta línea
    }
    

    public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100) {
        // Calcular el total ingresado
        int total = (cant_10 * 10) + (cant_20 * 20) + (cant_50 * 50) + (cant_100 * 100);
        // Validar que no exceda la capacidad total
        if (total <= capacidadTotal) {
            // Si es válido, almacenar los datos de los atributos
            dineroDisponible = total;
            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;
    
            registrarTransaccion("Abastecer", "0000 0000 0000 0000", total, "OK");
            return true;
        } else {
            // No es válido, imprimir mensaje y retornar False
            System.out.println("Error en Recarga");
            registrarTransaccion("Abastecer", "0000 0000 0000 0000", total, "ERROR");
            return false;
        }
    }
    

    public void registrarTransaccion(String tipo, String NumeroTarjeta,int monto,String estado){
        Date fecha = new Date();
        String texto = fecha.toString()+ tipo + " - "+NumeroTarjeta + " - " +estado;

        //Buscar indice vacio

        int indice = -1;
        for (int i = 0; i<listaTransacciones.length;i++ ) {
            if (listaTransacciones[i]==null){
                indice = i;
                
            }
            break;
        }

        if ( indice !=-1){
            listaTransacciones[indice] = texto;
        }else{
            for (int i = 0; i<listaTransacciones.length-1;i++ ){
                listaTransacciones[ i ] = listaTransacciones [ +1 ];


            }
            listaTransacciones [ listaTransacciones.length-1 ] = texto;
        }
    }
}