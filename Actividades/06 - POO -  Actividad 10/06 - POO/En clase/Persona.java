public class Persona {
    
    // Atributos -> Caracteristicas

    int cedula; 
    String nombres;
    String apellidos;
    int edad;
    int altura;    
    double peso;



    //   Metodos -> Acciones
    //     - Constructores
    //     - Getters
    //     - Setters

    public Persona(int dato1,String dato2,String dato3,int dato4,int dato5, double dato6){
        cedula = dato1;
        nombres = dato2;
        apellidos = dato3;
        edad = dato4;
        altura = dato5;
        peso = dato6;
    }

    //Getter

    public int getCedula(){
        return cedula;
    }

    public String getNombres(){
        return nombres;
    }

    

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }

    public int getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }
    //Setters

    public void setCedula(int dato){
        cedula = dato;
    }

    public void setNombres(String dato){
        nombres = dato;

    }
    public void setaApellidos(String dato){
        apellidos = dato;

    }
    public void setEdad(int dato){
        edad = dato;

    }
    public void setAltura(int dato){
        altura = dato;

    }
    public void setPeso(double dato){
        peso = dato;

    }

    public void imprimirEstado(){
        System.out.println("");
        System.out.println("|-------------------------------------------|");
        System.out.println("|-Cedula: "+    cedula+"                          |");
        System.out.println("|-Nombres: "+   nombres+"                        |");
        System.out.println("|-Apellidos: "+ apellidos+"                    |");
        System.out.println("|-Edad: "  +    edad+"                              |");
        System.out.println("|-Altura: "+    altura+"                          |");
        System.out.println("|-Peso: "  +    peso+"                              |");
        System.out.println("|-------------------------------------------|");
    }

    public String getInfo(){
        String info = cedula +" - " + nombres + " - " + apellidos + " - " + edad + " Anios " +altura +" cm " + peso +"kg";
        return info;
    }
}
