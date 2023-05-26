import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        long num;
        long miles;
        long unid;
        long millones;
        long milesMillones;

        String MonedaEnLetra;

        System.out.print(" Ingresa un numero: ");
        num = entrada.nextLong();
    
        if (num < 1000) {
            MonedaEnLetra = "$ " + num;
        } else if (num < 1000000) {
            miles = num / 1000;
            unid = num % 1000;
            MonedaEnLetra = "$ " + miles + ".";

            if (unid < 10) {
                MonedaEnLetra += "00" + unid;
            } else if (unid < 100) {
                MonedaEnLetra += "0" + unid;
            } else {
                MonedaEnLetra += unid;
            }
        } else if (num < 1000000000) {
            millones = num / 1000000;
            miles = (num % 1000000) / 1000;
            unid = num % 1000;
            MonedaEnLetra = "$ " + millones + ".";

            if (miles < 10) {
                MonedaEnLetra += "00" + miles + ".";
            } else if (miles < 100) {
                MonedaEnLetra += "0" + miles + ".";
            } else {
                MonedaEnLetra += miles + ".";
            }

            if (unid < 10) {
                MonedaEnLetra += "00" + unid;
            } else if (unid < 100) {
                MonedaEnLetra += "0" + unid;
            } else {
                MonedaEnLetra += unid;
            }
        } else {
            milesMillones = num / 1000000000;
            millones = (num % 1000000000) / 1000000;
            miles = (num % 1000000) / 1000;
            unid = num % 1000;
            MonedaEnLetra = "$ " + milesMillones + ".";

            if (millones < 10) {
                MonedaEnLetra += "00" + millones + ".";
            } else if (millones < 100) {
                MonedaEnLetra += "0" + millones + ".";
            } else {
                MonedaEnLetra += millones + ".";
            }

            if (miles < 10) {
                MonedaEnLetra += "00" + miles + ".";
            } else if (miles < 100) {
                MonedaEnLetra += "0" + miles + ".";
            } else {
                MonedaEnLetra += miles + ".";
            }

            if (unid < 10) {
                MonedaEnLetra += "00" + unid;
            } else if (unid < 100) {
                MonedaEnLetra += "0" + unid;
            } else {
                MonedaEnLetra += unid;
            }
        }
        System.out.println(" Moneda " + MonedaEnLetra);

    }
}
