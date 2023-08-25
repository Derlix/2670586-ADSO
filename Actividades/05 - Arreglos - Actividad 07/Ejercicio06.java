import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamano;

        System.out.print("Ingresa el tamano del arreglo: ");
        tamano = leer.nextInt();
        
        int arregloOriginal[]= new int [tamano];
        System.out.println(" Ingresa los elementos del arreglo: ");
        for(int i = 0; i < tamano;i++){
            arregloOriginal[i]= leer.nextInt();
        }

        int arregloPrimos []= new int [tamano];
        int arregloNprimos[]= new int [tamano];
        int contadorPrimos = 0;
        int contadorNprimos = 0;

        for(int i = 0; i< tamano;i++){
            int N = arregloOriginal[i];
            boolean Primo = true;

            if(N <=1){
                Primo = false;
            }else{
                for(int j = 2; j<= Math.sqrt(N);j++){
                    if(N % j ==0){
                        Primo = false;
                        break;
                    }
                }
            }
            if(Primo){
                arregloPrimos[contadorPrimos]= N;
                contadorPrimos++;
            }else{
                arregloNprimos[contadorNprimos] = N;
                contadorNprimos++;
            }
        }
        
        
        System.out.println(" Arreglo orginial: ");
        
        for(int i = 0; i<tamano;i++){
            System.out.print(arregloOriginal[i]+"");
        }
        
        System.out.println(" Longitud del Arreglo: "+tamano);
        
        System.err.println("");
        
        System.out.println(" Arreglo de numeros primos: ");
        
        for(int i = 0;i<contadorPrimos;i++){
            System.out.print(arregloPrimos[i]+"");
        }
        
        System.out.println(" Longitud del arreglo de numeros primos: "+contadorPrimos);
        
        System.err.println("");

        System.out.println(" Arreglo de numeros No Primos: ");
        for(int i = 0; i<contadorNprimos;i++){
           System.out.print(arregloNprimos[i]+"");
        }
        System.out.println(" Longitud del arreglo de numeros no primos: "+contadorNprimos);
    }
}
