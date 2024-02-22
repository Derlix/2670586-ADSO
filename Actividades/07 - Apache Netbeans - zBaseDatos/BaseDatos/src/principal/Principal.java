package principal;

import utils.Persona;
import utils.BaseDatos;


public class Principal {
    public static void main(String[] args){
        BaseDatos basedatos = new BaseDatos();
        
        //basedatos.insertarPersona("1089378334", "Christian David", "Arias Loaiza", "3212898067", "Calle 20 ", "elpepe@gmail.com");

        //basedatos.actualizarPersona("108800", "Juanito", "Perez", "32233", "carrera 1era", "juanito@gmail.com");
       // basedatos.eliminarPersona("1089378334");
        //Persona listado [] = basedatos.extraerPersonas();
        //Recorre y muestra el arreglo 
        //for(int i = 0; i<listado.length && listado[i]!=null;i++){
        //    System.out.println("->"+listado[i].getNombres()+" "+listado[i].getDocumento());
        //}
        Menu menu = new Menu();
    }
     
}