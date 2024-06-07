<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['titulo']) and !empty($_POST['autor']) ) {

        $titulo = $_POST['titulo'];
        $autor = $_POST['autor'];
        $total_paginas = $_POST['total_paginas'];


        try {
            $consulta = $base_de_datos->prepare("UPDATE personas SET autor=:aut, total_paginas=:tot, fecha_lanzamiento=:fec WHERE titulo = :tit ");

            $consulta->bindParam(':tit', $titulo);
            $consulta->bindParam(':aut', $autor);
            $consulta->bindParam(':tot', $total_paginas);

            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##PERSON##UPDATE"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##PERSON##UPDATE"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>
