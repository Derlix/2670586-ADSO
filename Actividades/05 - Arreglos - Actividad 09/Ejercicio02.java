import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int tamano;
        int posicion = 0;
        String nameAbuscar;
        int posicionEnc = -1;

        System.out.print(" Ingresa hasta que numero quieres ir: ");
        tamano = leer.nextInt();
        
        leer.nextLine();

        String datos []= new String[tamano];

        for(int i = 0;i<datos.length;i++){
            System.out.println(" Ingresa un nombre: ");
            datos[i]= leer.nextLine();
        }

        System.out.println(" Arreglo de nombres: ");
        for(int i = 0;i<tamano;i++){
            System.out.println(" Posicion de "+(1+i)+" :"+datos[i]);
        }

        leer.nextLine();

        System.out.println(" Ingresa el nombre que deseas buscar: ");
        nameAbuscar = leer.nextLine();
        
        for(int i = 0; i< tamano;i++){
            if(datos[i].equals(nameAbuscar)){
                posicionEnc = i;
                break;
            }
        }

        if(posicionEnc != -1){
            System.out.println(" Eln nombre " +nameAbuscar+" se encuentra en la posicion "+posicionEnc);
    
        }else{
            System.out.println(" El nombre "+ nameAbuscar+" no se encuentra en el arreglo ");
        }
    }    
}
