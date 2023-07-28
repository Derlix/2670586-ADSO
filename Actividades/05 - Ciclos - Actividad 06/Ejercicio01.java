import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion=0;
        double PagosIvalor;
        double SueldoT;
        double cantidadP;
        int i=1;

        System.out.print(" Ingresa un sueldo total: ");
        SueldoT = leer.nextDouble();

        System.out.print(" Ingresa la cantidad de pagos: ");
        cantidadP = leer.nextDouble();
        
            

        while(opcion != 5){
            System.out.println("|-----------FORMAS DE PAGO-------------|");
            System.out.println("|  1. Pagos de igual valor             |");
            System.out.println("|  2. Primer pago diferente            |");
            System.out.println("|  3. Ultimo pago diferente            |");
            System.out.println("|  4. Primer y ultimo pago diferente   |");
            System.out.println("|  5. Salir                            |");
            System.out.println("| -> Ingrese forma de pago:            |");
            System.out.println("|--------------------------------------|");
            opcion = leer.nextInt();
            
            if(opcion==1){
                System.out.println(" Los pagos iguales son:");
                PagosIvalor = SueldoT / cantidadP;
                
                for(i=1;i<= 5; i++){
                    System.out.println("MES "+i+" :" +PagosIvalor);
                }
            }
            if(opcion==2){
                
            }
        }

        
    }    
}
