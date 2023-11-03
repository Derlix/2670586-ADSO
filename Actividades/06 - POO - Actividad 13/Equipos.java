public class Equipos {
    String nombre;
    String aniofundacion;
    int partidosganados;
    int partidosempatados;
    int partidosperdidos;
    Jugador[] jugadores;

    public Equipos (String name, String inicio, int wingames, int drawgames,int losegames,Jugador[] teamPlayers){
        nombre = name;
        aniofundacion = inicio;
        partidosganados = wingames;
        partidosempatados = drawgames;
        partidosperdidos = losegames;
        jugadores = teamPlayers; 

    }

    

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getaniofundacion() {
        return aniofundacion;
    }
    public void setaniofundacion(String aniofundacion) {
        this.aniofundacion = aniofundacion;
    }
    public int getPartidosganados() {
        return partidosganados;
    }
    public void setPartidosganados(int partidosganados) {
        this.partidosganados = partidosganados;
    }
    public int getPartidosempatados() {
        return partidosempatados;
    }
    public void setPartidosempatados(int partidosempatados) {
        this.partidosempatados = partidosempatados;
    }
    public int getPartidosperdidos() {
        return partidosperdidos;
    }
    public void setPartidosperdidos(int partidosperdidos) {
        this.partidosperdidos = partidosperdidos;
    }
    public Jugador[] getJugadores() {
        return jugadores;
    }
    public void setJugadores(Jugador jugadores[]) {
        this.jugadores = jugadores;
    }
    

    public void agregarJugador(Jugador jugador) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                jugadores[i] = jugador;
                return;
            }
        }
    }

    public void transferirJugador(Equipos otroEquipo, Jugador jugador) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == jugador) {
                jugadores[i] = null;
                otroEquipo.agregarJugador(jugador);
                return;
            }
        }
    }


    

}
