package principal;

import util.ConsumoAPI;
import ventanas.Pokedex;

public class Principal {

    public static void main(String[] args) {
        Pokedex ventana = new Pokedex();
        ConsumoAPI consumo = new ConsumoAPI();
        
        //Endpoint obtener
        String respuesta01 = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon");
        System.out.println("Respuesta Obtener: "+ respuesta01 );
        

    }
    
}
