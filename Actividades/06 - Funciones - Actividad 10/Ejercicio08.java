public class Ejercicio08 {
    public static void main(String[] args) {
        int arreglo[] = new int[99];
        for (int i = 0; i < arreglo.length; i++) {
            int aleatorio = (int) (Math.random() * 99) + 1;
            arreglo[i] = aleatorio;
        }

        imprimirarreglo(arreglo); // Llama a la funcion para imprimir el arreglo
    }

    public static void imprimirarreglo(int pepe[]) {
        for (int i = 0; i < pepe.length; i++) {
            System.out.print("[" + pepe[i] + "]"); // Imprimir cada elemento del arreglo original
        }
    }
}
