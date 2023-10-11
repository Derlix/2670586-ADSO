public class Ejercicio09 {
    public static void main(String[] args) {
        int arreglo[] = new int[3];
        arreglo[0] = 1;
        arreglo[1] = 2;
        arreglo[2] = 3;

        valormin(arreglo);
    }

    public static void valormin(int pepe[]) {
        int menor=0;
        if (pepe[0] < pepe[1] && pepe[0] < pepe[2]) {
            menor = pepe[0];
        }
        if (pepe[1] < pepe[0] && pepe[1] < pepe[2]) {
            menor = pepe[1];
        }
        if (pepe[2] < pepe[0] && pepe[2] < pepe[1]) {
            menor = pepe[2];
        }

        System.out.println(" El arreglo menor es:" + menor);

    }
}
