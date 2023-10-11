import java.util.Scanner;

public class Ejecicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite;

        System.out.println(" Hasta donde quieres llenar el arreglo ");
        limite = leer.nextInt();

        int arreglo [] = new int[limite];
        System.out.println(llenar(arreglo[limite]));
    
    }
    public static int [] llenar (int arr[]){

        


        for(int i = 0;i<arr.length;i++){

        }
        return arr;
    }
}