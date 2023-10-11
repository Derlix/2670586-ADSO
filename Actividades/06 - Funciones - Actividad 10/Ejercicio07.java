public class Ejercicio07 {
    public static void main(String[] args) {
        int arreglo[] = new int[99];

        aleatorios(arreglo);
    }

    public static void aleatorios(int[] pepe) {

        for (int i = 0; i < pepe.length; i++) {
            int aleatorio = (int) (Math.random() * 99) + 1;
            pepe[i] = aleatorio;
            System.out.print("[" + pepe[i] + "]");
        }

    }
}