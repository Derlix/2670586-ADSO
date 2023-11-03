public class Principal   {
    public static void main(String[] args) {
        Jugador[] jugadoresEquipo1 = new Jugador[6];
        Equipos equipo1 = new Equipos("Equipo A", "2000", 10, 5, 3, jugadoresEquipo1);

        Jugador[] jugadoresEquipo2 = new Jugador[6];
        Equipos equipo2 = new Equipos("Equipo B", "1995", 8, 7, 4, jugadoresEquipo2);

        Jugador player1 = new Jugador ("1089", "Ricardo", 18, "Delantero");
        Jugador player2 = new Jugador("1440", "pepito", 18, "Delantero");
        Jugador player3 = new Jugador("2098", "Luis", 22, "Defensa");
        Jugador player4 = new Jugador("3097", "Maria", 25, "Centrocampista");
        Jugador player5 = new Jugador("4086", "Carlos", 20, "Portero");
        equipo1.agregarJugador(player1);
        equipo1.agregarJugador(player2);
        equipo1.agregarJugador(player3);
        equipo1.agregarJugador(player4);
        equipo1.agregarJugador(player5);
        
        Jugador player6 = new Jugador("5075", "Ana", 19, "Delantero");
        Jugador player7 = new Jugador("6064", "Pedro", 24, "Defensa");
        Jugador player8 = new Jugador("7053", "Laura", 21, "Centrocampista");
        Jugador player9 = new Jugador("8042", "Miguel", 23, "Portero");
        Jugador player10 = new Jugador("9031", "Isabel", 26, "Defensa");

        equipo2.agregarJugador(player6);
        equipo2.agregarJugador(player7);
        equipo2.agregarJugador(player8);
        equipo2.agregarJugador(player9);
        equipo2.agregarJugador(player10);

        equipo1.transferirJugador(equipo2, player4);
        equipo1.transferirJugador(equipo2, player2);

        System.out.println("Jugadores del Equipo 1:");
        for (Jugador jugador : equipo1.getJugadores()) {
            if (jugador != null) {
                System.out.println("Cedula: " + jugador.getCedula());
                System.out.println("Nombre: " + jugador.getNombre());
                System.out.println("Edad: " + jugador.getEdad());
                System.out.println("Posicion: " + jugador.getPosicion());
                System.out.println();
            }
        }

       
        System.out.println("Jugadores del Equipo 2:");
        for (Jugador jugador : equipo2.getJugadores()) {
            if (jugador != null) {
                System.out.println("Cedula: " + jugador.getCedula());
                System.out.println("Nombre: " + jugador.getNombre());
                System.out.println("Edad: " + jugador.getEdad());
                System.out.println("Posicion: " + jugador.getPosicion());
                System.out.println();
            }
        }

    }
}
