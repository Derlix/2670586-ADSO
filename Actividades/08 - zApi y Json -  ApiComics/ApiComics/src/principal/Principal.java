package principal;

import java.util.HashMap;
import java.util.Map;
import utils.ConsumoAPI;
import ventanas.VentanaPrincipal;

public class Principal {

    public static void main(String[] args) {
          ConsumoAPI consumo = new ConsumoAPI();
//        VentanaPrincipal ventana = new VentanaPrincipal();
//        String respuesta01 = consumo.consumoGET("https://localhost/ApiComics/API/ObtenerComics.php");
//        System.out.println("Respuesta Obtener: " + respuesta01);
//        
        //Insertar
        Map<String,String> datosInsertar = new HashMap<>();
        datosInsertar.put("titulo","snoopy");
        datosInsertar.put("autor", "Charles M. Schulz");
        datosInsertar.put("total_paginas",String.valueOf(100));
        datosInsertar.put("fecha_lanzamiento", "1950-05-04");
        
        String respuesta2 = consumo.consumoPOST("https://localhost/ApiComics/API/InsertarComic.php",datosInsertar);
        System.out.println("Respuesta insertar"+respuesta2);
    
        //Actualizar
        Map<String,String> datosActualizar = new HashMap<>();
        datosActualizar.put("titulo","snoopy");
        datosActualizar.put("autor","Christian");
        datosActualizar.put("total_paginas", String.valueOf(120));
        datosActualizar.put("fecha_lanzamiento", "1950-05-04");
        
        String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/ActualizarComic.php",datosActualizar);
        System.out.println("Respuesta actualizar" + respuesta03);
    }
    
    
}
