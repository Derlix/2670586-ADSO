public class Jugador {
    String cedula;
    String nombre;
    int edad;
    String posicion;
    
    
    public Jugador (String ced, String name, int years, String pos){
        cedula = ced;
        nombre = name;
        edad = years;
        posicion = pos;
    }

    public void imprimirjugador(){
        System.out.println("Nombre: "+nombre+" Cedula: "+cedula+" Edad:"+edad +" Posicion: "+posicion);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

}
