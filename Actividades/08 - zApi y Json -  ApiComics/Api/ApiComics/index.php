<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="icon" type="image/x-icon" href="WEB/img/icono_api.png">
    <link rel="stylesheet" href="WEB/CSS/styles.css">
    <title>Api Comics</title>
</head>

<body>
    <div class="container">
        <h1 class="text-center my-4">API de Comics</h1>
    </div>

    <div class="container ">
        <div id="carouselExampleDark" class="carousel carousel-dark slide">

            <div class="carousel-inner">
                <div class="carousel-item active" data-bs-interval="10000">
                    <div class="d-block w-100 text-center">
                        <h4>EndPoint: <span class="endpoint-name"><a href="./API/ObtenerComics.php">API/ObtenerComics.php</a></span></h4>
                        <h5>Método: GET</h5>
                        <h5>Parámetros:</h5>
                        <ul class="input-list list-unstyled">
                            <li>N/A</li>
                        </ul>
                        <h5>Salida: JSON</h5>
                        <div class="text-start d-inline-block">
                            <h5>Lista de Comics:</h5>
                            <pre class="endpoint-name">&nbsp;&nbsp;[
    &nbsp;&nbsp;&nbsp;&nbsp;{
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_comic": "1",
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"titulo": "Spider-Man",
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"total_paginas": "120",
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fecha_lanzamiento": "1962-08-01",
    &nbsp;&nbsp;&nbsp;&nbsp;},
    &nbsp;&nbsp;&nbsp;&nbsp;{
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_comic": "2",
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"titulo": "Batman",
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"total_paginas": "150",
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fecha_lanzamiento": "1939-05-01",
    &nbsp;&nbsp;&nbsp;&nbsp;}
    &nbsp;&nbsp;]</pre>
                        </div>
                    </div>
                </div>
                <div class="carousel-item" data-bs-interval="2000">
                    <div class="d-block w-100 text-center">
                        <h4>EndPoint: <span class="endpoint-name"><a href="./API/InsertarComic.php">API/InsertarComic.php</a></span></h4>
                        <h5>Método: POST</h5>
                        <h5>Parámetros:</h5>
                        <ul class="input-list list-unstyled ">
                            <li><i><b>String</b></i> titulo</li>
                            <li><i><b>String</b></i> autor</li>
                            <li><i><b>int</b></i> total_paginas</li>
                            <li><i><b>DATE</b></i> fecha_lanzamiento</li>
                        </ul>
                        <h5>Salida: JSON</h5>
                        <div class="text-start d-inline-block">
                            <h5>Comic insertado:</h5>
                            <pre class="endpoint-name">&nbsp;&nbsp;{
    &nbsp;&nbsp;&nbsp;&nbsp;"status": true,
    &nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##COMIC##INSERT"
    &nbsp;&nbsp;}</pre>

                            <h5>Error en parámetros:</h5>
                            <pre class="endpoint-name">&nbsp;&nbsp;{
    &nbsp;&nbsp;&nbsp;&nbsp;"status": false,
    &nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"
    &nbsp;&nbsp;}</pre>

                            <h5>Error en inserción:</h5>
                            <pre class="endpoint-name">&nbsp;&nbsp;{
    &nbsp;&nbsp;&nbsp;&nbsp;"status": false,
    &nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##COMIC##INSERT"
    &nbsp;&nbsp;}</pre>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="d-block w-100 text-center">
                        <h4>EndPoint: <span class="endpoint-name"><a href="./API/ActualizarComic.php">API/ActualizarComic.php</a></span></h4>
                        <h5>Método: POST</h5>
                        <h5>Parámetros:</h5>
                        <ul class="input-list list-unstyled">
                            <li><i><b>String</b></i> titulo</li>
                            <li><i><b>String</b></i> autor</li>
                            <li><i><b>int</b></i> total_paginas</li>
                            <li><i><b>DATE</b></i> fecha_lanzamiento</li>
                        </ul>
                        <h5>Salida: JSON</h5>
                        <div class="text-start d-inline-block">
                            <h5>Comic actualizada:</h5>
                            <pre class="endpoint-name">&nbsp;&nbsp;{
    &nbsp;&nbsp;&nbsp;&nbsp;"status": true,
    &nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##COMIC##UPDATE"
    &nbsp;&nbsp;}</pre>

                            <h5>Error en parámetros:</h5>
                            <pre class="endpoint-name">&nbsp;&nbsp;{
    &nbsp;&nbsp;&nbsp;&nbsp;"status": false,
    &nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"
    &nbsp;&nbsp;}</pre>

                            <h5>Error en actualización:</h5>
                            <pre class="endpoint-name">&nbsp;&nbsp;{
    &nbsp;&nbsp;&nbsp;&nbsp;"status": false,
    &nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##COMIC##UPDATE"
    &nbsp;&nbsp;}</pre>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="d-block w-100 text-center">
                        <h4>EndPoint: <span class="endpoint-name"><a href="./API/EliminarComic.php">API/EliminarComic.php</a></span></h4>
                        <h5>Método: POST</h5>
                        <h5>Parámetros:</h5>
                        <ul class="input-list list-unstyled">
                            <li><i><b>String</b></i> titulo</li>
                        </ul>
                        <h5>Salida: JSON</h5>
                        <div class="text-start d-inline-block">
                            <h5>Comic eliminada:</h5>
                            <pre class="endpoint-name">&nbsp;&nbsp;{
    &nbsp;&nbsp;&nbsp;&nbsp;"status": true,
    &nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##DELETE"
    &nbsp;&nbsp;}</pre>

                            <h5>Error en parámetros:</h5>
                            <pre class="endpoint-name">&nbsp;&nbsp;{
    &nbsp;&nbsp;&nbsp;&nbsp;"status": false,
    &nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"
    &nbsp;&nbsp;}</pre>

                            <h5>Error en eliminación:</h5>
                            <pre class="endpoint-name">&nbsp;&nbsp;{
    &nbsp;&nbsp;&nbsp;&nbsp;"status": false,
    &nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DELETE"
    &nbsp;&nbsp;}</pre>
                        </div>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>

        </div>

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>

</html>