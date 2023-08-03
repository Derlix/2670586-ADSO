public class Ejercicio02 {
    public static void main(String[] args) {
        

        int dias;
        int meses;
        int anios;
        
        
        dias = (int) Math.floor(Math.random() * 31);
        meses = (int) Math.floor(Math.random() * 12) + 1;
        anios = (int) Math.floor(Math.random() * 24) + 2000;

        System.out.print(dias + "/");
        System.out.print(meses + "/");
        System.out.print(anios);
        

    }

    
}
