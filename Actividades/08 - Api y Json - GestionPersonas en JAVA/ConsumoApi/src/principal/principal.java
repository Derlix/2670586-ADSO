package principal;

import java.util.HashMap;
import java.util.Map;
import util.ConsumoAPI;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class principal {

    public static void main(String[] args) {
        //Instancia consumo
        ConsumoAPI consumo = new ConsumoAPI();
        Menu_de_Personas ventana = new Menu_de_Personas();
        
        //Endpoint obtener
//        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
//        System.out.println("Respuesta Obtener: "+ respuesta01 );
//        
//        //End point isertar
//        Map<String,String> datosInsertar = new HashMap<>();
//        datosInsertar.put("cedula","898222");
//        datosInsertar.put("nombres","Chris");
//        datosInsertar.put("apellidos", "Pom");
//        datosInsertar.put("telefono", "321282");
//        datosInsertar.put("direccion", "calle 203");
//        datosInsertar.put("email", "pom@gmail.com");
//        String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php",datosInsertar);
//        System.out.println("Respuesta insertar" + respuesta02);
//        
//        //Endpoint actualizar
//        
//        Map<String,String> datosActualizar = new HashMap<>();
//        datosActualizar.put("cedula","898222");
//        datosActualizar.put("nombres","Christian");
//        datosActualizar.put("apellidos", "Pompompurin");
//        datosActualizar.put("telefono", "no tengo");
//        datosActualizar.put("direccion", "calle 207mil b 2");
//        datosActualizar.put("email", "pompurin@gmail.com");
//        String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php",datosActualizar);
//        System.out.println("Respuesta actualizar" + respuesta03);
//        
//        //Endpoint eliminar
//        
////        Map<String,String> datosEliminar = new HashMap<>();
////        datosEliminar.put("cedula","898222");    //Aqui mandamos el endpoint segun la funcion que queramos hacer ↓
////        String respuesta04 = consumo.consumoPOST("https://codetesthub.com/API/Eliminar.php",datosEliminar);
////        System.out.println("Respuesta actualizar" + respuesta04);
//        
//        JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
//        
//        for (int i = 0; i < registros.size(); i++) {
//            JsonObject temp = registros.get(i).getAsJsonObject();
//            String nombre = temp.get("nombres").getAsString();
//            String apellidos = temp.get("apellidos").getAsString();
//            System.out.println(nombre + apellidos);
//        }
//        
//          

        
    }
    
}
