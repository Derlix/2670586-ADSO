public class Perro {

    // Atributos
    String nombre;
    String propietario;
    int edad;
    String raza;
    double peso;
    int energia;

    // Metodos

    // Metodo constructor. Es usado para crear objetos de esa clase (Instanciacion)
    // La funcion del constructor es dar valor inicial a los atributos
    public Perro(String name, String owner, int year, String raze, Double size, int energy) {

        nombre = name;
        propietario = owner;
        edad = year;
        raza = raze;
        peso = size;
        energia = energy;

    }

    public void imprimir_detalle() {
        System.out.println("+---------------------------+");
        System.out.println("   Nombre:" + nombre);
        System.out.println("   Propietario: " + propietario);
        System.out.println("   Edad (En meses): " + edad + " ( " + ((double) edad / 12) + " Anios) ");
        System.out.println("   Raza: " + raza);
        System.out.println("   Peso: " + peso);
        System.out.println("   Energia: " + energia);
        System.out.println("+---------------------------+");
    }

    public String getNombre() {
        return nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public double getPeso() {
        return peso;
    }

    public int getEnergia() {
        return energia;
    }

    public void setNombre(String dato) {
        nombre = dato;
    }

    public void setPropietario(String dato) {
        propietario = dato;
    }

    public void setEdad(int dato) {
        edad = dato;
    }

    public void setRaza(String dato) {
        raza = dato;
    }

    public void setPeso(double dato) {
        peso = dato;
    }

    public void setEnergia(int dato) {
        energia = dato;
    }

    public void comer(int gramos) {
        // Peso
        peso = peso + ((double) gramos / 1000);

        energia = energia + (gramos / 100);

        if (energia > 100) {

        }
    }

    // caminada en metros cada 1000 metros un K
    // Afecta a peso y energia
    public void caminar(double metro) {
        double kl = metro / 1000;

        peso = peso - kl;

        energia = energia - (int) kl;

    }

    public void ladrar(double ladridos) {
        // Calcula la reduccion de peso y energia basada en la cantidad de ladridos
        double reduccionPeso = 0;
        int reduccionEnergia = 0;
        
        if (ladridos >= 5) {
            reduccionPeso = ladridos / 1000.0;
            reduccionEnergia = (int) (ladridos / 1.0);
        }
    
        if (ladridos >= 15) {
            reduccionPeso = ladridos / 20.0;
            reduccionEnergia = (int) (ladridos / 4.0);
        }
    
        if (ladridos >= 30) {
            reduccionPeso = ladridos / 10.0;
            reduccionEnergia = (int) (ladridos / 6.0);
        }
    
        if (ladridos >= 60) {
            reduccionPeso = ladridos / 5.0;
            reduccionEnergia = (int) (ladridos / 5.0);
        }
    
        // Aplica la reduccion solo si la energia disponible es suficiente
        if (energia >= reduccionEnergia) {
            peso = peso - reduccionPeso;
            energia = energia - reduccionEnergia;
        } else {
            // Si la energia no es suficiente establece la energia en 0
            peso = peso - reduccionPeso;
            energia = 0;
        }
    }
    

    public void morder(int cantidad) {

        // reducir la energía
        energia = energia - cantidad / 2;

    }

    public void dormir(int horas) {
        // aumentar la energía
        energia = energia + horas;

        if (energia > 100) {
            System.out.println(" PERRO SOBRECARGADO DE ENERGIA ");
            energia = 100;
        }
    }

    public void hacerPopis(double gramos) {
        // reducir el peso del perro
        peso = peso - (gramos / 1000);

    }

    public void jugar(int tiempo) {
        // reducir la energía
        energia = energia - (tiempo / 60) * 2;

        if (energia < 0) {
            energia = 0;
        }
    }

}
