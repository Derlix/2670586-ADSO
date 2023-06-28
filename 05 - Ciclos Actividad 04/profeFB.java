import java.util.Scanner;

public class profeFB {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int N;
        int fb1 = 0;
        int fb2 = 1;
        int contador =1;
        int fbACT;

        System.out.print(" Ingresa un valor: ");
        N = leer.nextInt();

        while(contador<=N){
            if(contador ==1){
                System.out.print(fb1);
            }if(contador==2){
                System.out.print(", "+fb2);
            }if(contador>2){
                fbACT=fb1+fb2;
                System.out.print(", "+fbACT);
                fb1= fb2;
                fb2=fbACT;
            }
            contador = contador +1;
        }
        
    }
}
