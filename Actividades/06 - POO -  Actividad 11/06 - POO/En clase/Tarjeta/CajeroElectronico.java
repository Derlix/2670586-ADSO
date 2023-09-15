import java.util.Date;

public class CajeroElectronico {

    int cantidadDineroTotal; 
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
    String user;
    String Userc;

    public CajeroElectronico(int capacidadTotal, int dineroDisponible, int cant_10, int cant_20, int cant_50,
        int cant_100, String nombreBanco, String listaTransacciones,int total, String UsuarioAdmin, String claveAdmin) {
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

     // Método para ver el historial del cajero
    public void verHistorialCajero(String string, String string2) {
        System.out.println("Historial de Transacciones del Cajero:");
        for (String transaccion : listaTransacciones) {
            if (transaccion != null) {
                System.out.println("    -> " + transaccion);
            }
        }
    }

    // Método para consignar dinero a una tarjeta
    public void consignarDineroaTarjeta(TarjetaDebito tarjeta, String clave, int cant_10,int cant_20,int cant_50,int cant_100) {
        // Implementa la lógica para consignar dinero a una tarjeta aquí
        int monto = (cant_10*10000) + (cant_20*20000) + (cant_50*50000) + (cant_100*100000);
        if (tarjeta.validarClave(clave) ) {
            if( tarjeta.validarActica()){
                if (monto > 0 ){
                        if((dineroDisponible+monto)<=capacidadTotal ){
                            tarjeta.aumentarSaldo(monto, clave);
                            dineroDisponible+= monto;
                            this.cant_10+=cant_10;
                            this.cant_20+=cant_20;
                            this.cant_50+= cant_50;
                            this.cant_100+= cant_100;
                            System.out.println("|          Realizado - consignar dinero               |");
                            registrarTransaccion("Consignacion", tarjeta.getnumero(), monto, "ERROR");
                        }else{
                            System.out.println("------------------------------------------");
                            System.out.println("|             Error Estado               |");
                            System.out.println("-----------------------------------------|");
                            registrarTransaccion("Consignacion", tarjeta.getnumero(), monto, "ERROR");
                        }
            
                } else{
                    System.out.println("------------------------------------------");
                    System.out.println("|             Error monto inferior       |");
                    System.out.println("-----------------------------------------|");
                    registrarTransaccion("Consignacion", tarjeta.getnumero(), monto, "ERROR");
                }
        
            }else{
                System.out.println("------------------------------------------");
                System.out.println("|             Error Estado               |");
                System.out.println("-----------------------------------------|");
                registrarTransaccion("Consignacion", tarjeta.getnumero(), monto, "ERROR");
            }
        }else{
            System.out.println("------------------------------------------");
            System.out.println("|             Error pasword              |");
            System.out.println("-----------------------------------------|");
           registrarTransaccion("Consignacion", tarjeta.getnumero(), monto, "ERROR");
        }
    }

    // Método para retirar dinero de una tarjeta
    public void retirarDineroTarjeta(TarjetaDebito tarjeta, int monto) {
        // Implementa la lógica para retirar dinero de una tarjeta aquí
    }

    // Método para ver el historial de una tarjeta
    public void verHistorialTarjeta(TarjetaDebito tarjeta) {
        // Implementa la lógica para ver el historial de una tarjeta aquí
        if (user.equals(usuarioAdmin)&&Userc.equals(claveAdmin)){
            System.out.println("------------------------------------------");
            System.out.println("|             Historial de cajero        |");
            System.out.println("-----------------------------------------|");
            for ( int i=0;i<listaTransacciones.length;i++){
                if ( listaTransacciones[i]!=null){
                    System.out.print(listaTransacciones[i]);
                }
            }
            registrarTransaccion("Historail", "0000 0000 0000 0000", 0, "OK");
        }else {
            System.out.print("---> Acceso Denegado <---");
            registrarTransaccion("Historail", "0000 0000 0000 0000", 0, "OK");
        }
    }

    // Método para consultar el saldo de una tarjeta
    public int consultarSaldoTarjeta(TarjetaDebito tarjeta) {
        // Implementa la lógica para consultar el saldo de una tarjeta aquí
        return 0; // Reemplaza esto con la lógica real
    }

    // Método para cambiar la clave de una tarjeta
    public void cambiarClave(TarjetaDebito tarjeta, String nuevaClave) {
        // Implementa la lógica para cambiar la clave de una tarjeta aquí
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
    }
    

    public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100) {
        // Calcular el total ingresado
        int total = (cant_10 * 10000) + (cant_20 * 20000) + (cant_50 * 50000) + (cant_100 * 100000);
        // Validar que no exceda la capacidad total
        if (total <= capacidadTotal) {
            // Si es válido, almacenar los datos de los atributos
            dineroDisponible = total;
            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;
    
            registrarTransaccion("Abastecer", "0000 0000 0000 0000", dineroDisponible, "OK");
    
            return true;
        } else {
            // No es válido, imprimir mensaje y retornar False
            System.out.println("Error en Recarga");
            registrarTransaccion("Abastecer", "0000 0000 0000 0000",dineroDisponible , "ERROR");
            return false;
        }
    }
    

    public void registrarTransaccion(String tipo, String NumeroTarjeta,int monto,String estado){
        Date fecha = new Date();
        String texto = fecha.toString()+ tipo + " - "+NumeroTarjeta + "-" +monto+ " - " +estado;

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