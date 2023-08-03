import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int producto;
        double porcentaje;
        double descuento;
        double precio_final;

        System.out.println("Ingresa el precio de un producto");
        producto = entrada.nextInt();

        System.out.println("Ingresa un porcentaje del descuento");
        porcentaje = entrada.nextInt();

        descuento = producto * porcentaje / 100;

        precio_final = producto - descuento;

        System.out.println("El precio final con descuento es: "+ precio_final);
        
    }
    
}
