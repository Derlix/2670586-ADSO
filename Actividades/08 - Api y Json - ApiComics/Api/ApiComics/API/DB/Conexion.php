<?php
	header("Content-Type: application/json");  // recibir y enviar datos json
	header("Access-Control-Allow-Origin: * ");  //origenes permitidos "*" para que cualquiera pueda conectarse
    header("Access-Control-Allow-Methods: GET, POST");  // Metodos de acceso al archivo php le podemos agregar mas metodos como DELETE 
	header("Access-Control-Allow-Headers: Content-Type");  //Encapsular todo el paquete en json
	// Este encabeza debe ir en cualquier archivo de api

	$servidor = 'localhost';
	$usuario = 'root';
	$contrasena = '';
	$nombre_de_base = 'api_comics';

	
	// $servidor = '162.241.61.249';
	// $usuario = 'codetes1_adso';
	// $contrasena = 'Adso2024!';
	// $nombre_de_base = 'codetes1_api_personas';
	

	try{
	   $base_de_datos = new PDO("mysql:host=$servidor;dbname=$nombre_de_base", $usuario, $contrasena); //PDO conexiones a bases de datos mas seguras
	}catch(Exception $e){
	   echo 'Ha surgido un error y no se puede conectar a la base de datos. Detalle: ' . $e->getMessage();// En caso de que falle hace un exit para salir 
	   exit;
	}
?>