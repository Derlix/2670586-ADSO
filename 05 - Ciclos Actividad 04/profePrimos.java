import java.util.Scanner;

public class profePrimos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N=0;
        int div=0;
        int i;

        System.out.print(" Ingresa un numero para determinar si es primo ");
        N = leer.nextInt();

        for(i=1;i<=N;i++){
            if(N % i == 0){
                div = div +1;
            }
        }
        if(div==2 ){
            System.out.println(" Es primo ");
        }else{
            System.out.print("No es primo");
        }
    }
}
