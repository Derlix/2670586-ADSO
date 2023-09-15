public class Ejercicio05 {
    public static void main(String[] args) {
        potencia(5, 3);
    }

    public static void potencia(int num1, int num2) {
        int resultado = 1;
        for (int i = 0; i < num2; i++) {
            resultado = resultado * num1;
        }
        System.out.println("La potencia de 5^3 es: "+resultado);

    }
}
