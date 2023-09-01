public class Principal {

    public static void main(String[] args) {
        // Crear un CajeroElectronico Cajero1 con todos los detalles
        CajeroElectronico Cajero1 = new CajeroElectronico(100000000, 2000000, 100, 500, 200, 300, "BBVA", "Compras", "Pepe", "123456");
    

        // Crear un CajeroElectronico Cajero2 con detalles mínimos
        CajeroElectronico Cajero2 = new CajeroElectronico(100000000, "BBVA", "Pepe", "123456");
        Cajero2.imprimirdetalle();

        // Abastecer el Cajero2
        Cajero2.abastecerCajero(1000, 1000, 500, 500);
        Cajero2.imprimirdetalle();
    }
}