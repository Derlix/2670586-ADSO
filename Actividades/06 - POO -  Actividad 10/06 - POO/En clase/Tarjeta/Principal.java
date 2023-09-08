public class Principal {

    public static void main(String[] args) {
        // Crear un CajeroElectronico Cajero1 con todos los detalles
        
        // Crear un CajeroElectronico Cajero2 con detalles mínimos
        CajeroElectronico Cajero2 = new CajeroElectronico(1500000000, "BBVA", "Pepe", "123456");
        Cajero2.abastecerCajero(100, 100, 500,550);

        // Abastecer el Cajero2
        Cajero2.abastecerCajero(20000, 20000, 5000,5000 );
        Cajero2.imprimirdetalle();
        TarjetaDebito tarjeta01 = new TarjetaDebito("Pepe Loaiza", "0001 0001 0001 0001", "BVVA", 0, "1");
        
        Cajero2.consignarDineroaTarjeta(tarjeta01, "1231", 0, 0, 0, 0);

        Cajero2.imprimirdetalle();

    }
}