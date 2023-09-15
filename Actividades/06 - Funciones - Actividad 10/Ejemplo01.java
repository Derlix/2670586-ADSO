public class Ejemplo01 {

    public static void main(String[] args) {

        

        int[] arr = new int[100];

        imprimirArr(arr);
        llenararreglo(arr);
        imprimirArr(arr);
        // System.out.print(" PROBANDO FUNCIONES ");

        // System.out.println(suma(4, 2));
        // System.out.println(suma(3, 2));
        // System.out.println(suma(-3, 20));
        // System.out.println(suma(100, -50));

        // System.out.print(" PROBANDO FUNCIONES ");

        // System.out.println("Dividir"+dividir(4, 2));
        // System.out.println("Dividir"+dividir(3, 2));
        // System.out.println("Dividir"+dividir(-3, 20));
        // System.out.println("Dividir"+dividir(100, -50));

        // // int juani = suma(3,4);
        // // System.out.println(juani);
        // // if (suma(-5,12)>=0){
        // // System.out.print(" PEPE");

        // // }else{
        // // System.out.print(" NO SOY PEPE ");
        // // }
        // saludar();
        // saludarB(5);
        // imprimirTablas(5);
    }

    public static int suma(int num1, int num2) {
        int resultado = (num1 + num2);

        return resultado;

    }

    public static float dividir(float num1, float num2) {

        float resultado = (num1 / num2);

        return resultado;

    }

    public static void saludar() {
        System.out.println("+------------------+");
        System.out.println("|    HOLA MUND     |");
        System.out.println("+------------------+");
    }

    public static void saludarB(int contidad) {
        for (int i = 0; i < contidad; i++) {

            System.out.println("+------------------+");
            System.out.println("|    HOLA MUND     |");
            System.out.println("+------------------+");
        }
    }

    // public static void imprimirTablas(int table,int mul){
    // for (int i = 0; i <=mul ;i++) {
    // int resultado = table * i;
    //

    // }
    // }

    public static void imprimirArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println(); // Agregar una nueva línea al final.
    }

    public static void llenararreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int aleatorio = (int) (Math.random() * 100);
            arr[i] = aleatorio; // Asignar el valor aleatorio al elemento del arreglo.
        }
    }

}
