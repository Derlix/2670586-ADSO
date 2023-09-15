public class Ejercicio03 {
    public static void main(String[] args) {
        
        multiplicacion(5, 11);
    
    }
    public static void multiplicacion ( int num1, int num2){
        for ( int i = 1;i <= num2;i++){
            int resultado = num1 * i;
            System.out.println(num1+" X "+i+" = "+resultado);
        }
    }
}
