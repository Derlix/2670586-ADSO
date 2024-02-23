package utils;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class BaseDatos {
    
    Connection conexion;
    Statement manipularDB;
    
    public BaseDatos(){
        String hostname = "localHost";
        String puerto = "3306";
        String databasename = "app_java";
        String user = "root";
        String passwor = "";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;
        
        try {
            conexion = DriverManager.getConnection(url, user, passwor);
            manipularDB = conexion.createStatement();
            System.out.println("CONEXION EXISTOSA A: "+ databasename);
        } catch (SQLException ex) {
            System.out.println("Error en conexion a Base de Datos");
            System.out.print(ex.getMessage());
        }
        
       
    }
    
   
    public void imprimirPersonas(){
        ResultSet registros = null;
        
        try {
	    String consulta = "SELECT * FROM personas";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
	        do{
	            System.out.println(registros.getRow()+" => "+registros.getString("nombres"));
	        }while(registros.next());
	    }else{
	        System.out.println("No se encuentran clientes registrados.");
	    }
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
    }
    
    public Persona[] extraerPersonas(){
      
        try {
            Persona arreglo [] = new Persona[100];
            String consulta = "SELECT * FROM personas";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if(registros.getRow()==1){
                int i = 0;
                do{
                    String documento = registros.getString("cedula");
                    String nombres = registros.getString("nombres");
                    String apellidos = registros.getString("apellidos");
                    String telefono = registros.getString("telefono");
                    String correo = registros.getString("email");
                    String direccion = registros.getString("direccion");
                    arreglo[i] = new Persona(documento, nombres, apellidos, telefono,direccion, correo);
                    i++;
                    System.out.println(i);
                }while(registros.next());
                return arreglo;  
            }else{
                System.out.println("SIN CLIENTES");
                return arreglo;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el select ");
            System.out.println(ex.getNextException());
        }
       
        return null;
    }
    
    public void mostrarPersona(JTable table){
        try{
            Persona[] personas = extraerPersonas();
            
            String[] columnas = {"Documento","Nombres","Apellidos","Telefono","Direccion","Email"};
        
            DefaultTableModel model = new DefaultTableModel(columnas,0);
            table.setModel(model);
            for(Persona persona : personas){
                if(persona != null){
                    Object[] fila = {persona.getDocumento(),persona.getNombres(),persona.getApellidos(),persona.getTelefono(),persona.getDireccion(),persona.getCorreo()};
                    model.addRow(fila);
                }
            }
        
        }catch ( Exception ex){
            ex.printStackTrace();
        }
    }
    
    public boolean insertarPersona(String cedula,String nombres,String apellidos,String telefono,String direccion,String email){
        
        
        boolean respuesta = false;
        try {
            
        
            String consulta = "INSERT INTO personas (cedula, nombres, apellidos, direccion, telefono, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+direccion+"','"+telefono+"','"+email+"')";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
            respuesta = true;
        }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
            respuesta = false;
        }
        if (respuesta == true){
            System.out.println("Insertado con exito");
        }else{
            System.out.println("No se pudo insertar");
        }
       return respuesta; 
    }
    
    public boolean actualizarPersona(String cedula, String nuevoDocumento, String nombres, String apellidos, String telefono, String direccion, String email) {
    boolean respuesta = false;
    try {
        String consulta = "UPDATE personas SET cedula='"+nuevoDocumento+"', nombres='"+nombres+"', apellidos='"+apellidos+"', direccion='"+direccion+"', telefono='"+telefono+"', email='"+email+"' WHERE cedula='"+cedula+"' ";
        int resp_consulta = manipularDB.executeUpdate(consulta);
        if (resp_consulta == 1) {
            respuesta = true;
        }
    } catch (SQLException ex) {
        System.out.println("--> Error Update: " + ex.getMessage());
    }
    if (!respuesta) {
        System.out.println("No se pudo Editar");
    } else {
        System.out.println("Editado con exito");
    }
    return respuesta;
}


    
    public Persona buscarPorcedula(String cedula){
        try {
        String consulta = "SELECT * FROM personas WHERE cedula='" + cedula + "'";
        ResultSet resultados = manipularDB.executeQuery(consulta);
        
        if (resultados.next()) {
            String documento = resultados.getString("cedula");
            String nombres = resultados.getString("nombres");
            String apellidos = resultados.getString("apellidos");
            String telefono = resultados.getString("telefono");
            String direccion = resultados.getString("direccion");
            String correo = resultados.getString("email");
            
            return new Persona(documento, nombres, apellidos, telefono, direccion, correo);
        }
    } catch (SQLException ex) {
        System.out.println("Error al buscar la persona: " + ex.getMessage());
    }
        return null;
    }
    
   

    
    public boolean eliminarPersona(String cedula){
        boolean respuesta = false;
    try {
        String consulta = "DELETE FROM personas WHERE cedula='"+cedula+"' ";
        int resp_consulta = manipularDB.executeUpdate(consulta);
        if (resp_consulta==1) {
            respuesta = true;
        }
    } catch (SQLException ex) {
        System.out.println("--> Error Delete: " + ex.getMessage());
    }
    if (respuesta){
        System.out.println("Eliminado con exito");
    }else{
        System.out.println("No se pudo Eliminar");
    }
    return respuesta;
    }
    


}
