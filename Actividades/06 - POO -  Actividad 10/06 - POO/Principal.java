public class Principal{
    public static void main(String[] args) {
                          //De aqui en adelante es la Instanciacion 
        Persona usuario = new Persona(108800, "Oscar","Loaiza", 85,185,300.5);
        Persona person_02 = new Persona(108801," Daniel"," Garcia",32,44,144.5);

        usuario.imprimirEstado();
        person_02.imprimirEstado();
        

        usuario.actividadFisica(80);
        usuario.actividadFisica(30);
        

        usuario.imprimirEstado();
        person_02.imprimirEstado();
        

    }   
}