public class Perro {

    // Atributos
    private String nombre;
    private String propietario;
    private int edad;
    private String raza;
    private double peso;
    private int energia;

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
        if (ladridos >= 5) {

            peso = peso - ((double) ladridos / 1000);
            energia = energia - ((int) ladridos / 1);
        }
        if (ladridos >= 15) {

            peso = peso - ((double) ladridos / 20);
            energia = energia - ((int) ladridos / 4);
        }
        if (ladridos >= 30) {

            peso = peso - ((double) ladridos / 10);
            energia = energia - ((int) ladridos / 6);

        }
        if (ladridos >= 60) {
            peso = peso - ((double) ladridos / 5);
            energia = energia - ((int) ladridos / 5);
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
        }
    }

    public void hacerPopo(int gramos) {

        // reducir el peso del perro
    }

    public void jugar(int tiempo) {

        // reducir la energía
    }

}
