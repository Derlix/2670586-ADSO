window.onload = function() {
    cargarPersonas();

}

function cargarPersonas(){
    fetch("https://codetesthub.com/API/Obtener.php")
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta Json del servidor');
        console.log(data);

        let htmlContent = '';
        data.forEach((persona, index) => {
            
            if (index % 3 === 0) {
                if (index !== 0) {
                    htmlContent += '</div>'; // Cierra la fila anterior, excepto al principio
                }
                htmlContent += '<div class="row">'; // Iniciar una nueva fila
            }

            let html_temporal = `<div class="col-md-4">
                                    <div class="card mb-4" style="width: 100%; ">
                                        <img src="IMG/defaultImg.jpg" class="card-img-top" alt="Imagen de ${persona.nombres}">
                                        <div class="card-body">
                                            <h5 class="card-title">${persona.nombres} ${persona.apellidos}</h5>
                                            <p class="card-text">
                                                Cedula: ${persona.cedula}<br>
                                                Teléfono: ${persona.telefono}<br>
                                                Dirección: ${persona.direccion}<br>
                                                Email: ${persona.email}
                                            </p>
                                            <button class="btn btn-danger" onclick="eliminarPersona(${persona.cedula})">Eliminar</button>
                                        </div>
                                    </div>
                                </div>`;

            htmlContent += html_temporal;
        });

        if (data.length > 0) {
            htmlContent += '</div>'; // Cierra la última fila si hay tarjetas
        }

        document.getElementById('contentPrincipal').innerHTML = htmlContent;
    })
    .catch(error => console.error('Error al cargar la API:', error));
}


function insertarPersona(){
    let datos = new FormData();

    datos.append("cedula", 1089378334);
    datos.append("nombres", "pompompurinChristian");
    datos.append("apellidos", "cinamorrol");
    datos.append("telefono","323335633")
    datos.append("direccion", "calle kitty 23");
    datos.append("email", "pompRinQ@cin.com");

    let configuracion = {
                            method: "POST",
                            headers: {
                                "Accept": "application/json",
                            },
                            body: datos,
                        };

    fetch("https://codetesthub.com/API/Insertar.php", configuracion)
    .then(res => res.json())
    .then(data =>{
        console.log('Respuiesta Json server')
        console.log(data);
        cargarPersonas();
    });
        

}

function actualizarPersona(){
    let datos = new FormData();
    datos.append("cedula",1089378334);
    datos.append("nombres","pompompurin");
    datos.append("apellidos","roll");
    datos.append("telefono","no tengo");
    datos.append("direccion","japan")
    datos.append("email","pompurin@gmail.com");

    let configuracion = {
                            method: "POST",
                            headers: {
                                "Accept": "application/json",
                            },
                            body: datos,
                        };
    fetch("https://codetesthub.com/API/Actualizar.php", configuracion)
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta Json server');
        console.log(data);
        cargarPersonas();
    });
}


function eliminarPersona(cedula){
    let datos = new FormData();

    datos.append("cedula", cedula);

    let configuracion = {
                            method: "POST",
                            headers: {
                                "Accept": "application/json",
                            },
                            body: datos,
    };
    fetch("https://codetesthub.com/API/Eliminar.php", configuracion)
    .then(res => res.json())
    .then(data =>{
        console.log('Respuiesta Json server')
        console.log(data);
        cargarPersonas();
    });

}


function mostrarModal() {
    document.getElementById('modalActualizar').style.display = 'block';
}

function ocultarModal() {
    document.getElementById('modalActualizar').style.display = 'none';
}

function enviarActualizacion() {
    let datos = new FormData(document.getElementById('formActualizar'));

    let configuracion = {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
        },
        body: datos,
    };

    fetch('https://codetesthub.com/API/Actualizar.php', configuracion)
        .then(res => res.json())
        .then(data => {
            console.log('Respuesta Json del servidor', data);
            cargarPersonas();
        })
        .catch(error => console.error('Error al actualizar:', error));
}
