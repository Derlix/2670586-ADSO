let imagencarga;

window.onload = function() {
    cargarPersonas();
    imagencarga = document.getElementById('imagenCarga');
}

function cargarPersonas() {
    fetch("https://codetesthub.com/API/Obtener.php")
        .then(res => res.json())
        .then(data => {
            console.log('Respuesta Json del servidor');
            console.log(data);
            imagencarga.style.display = 'block';
            let htmlContent = '';
            data.forEach((persona, index) => {
                imagencarga.style.display = 'none';
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
                                                <button class="btn btn-secondary" onclick="abrirModalActualizar(${persona.cedula}, '${persona.nombres}', '${persona.apellidos}', '${persona.telefono}', '${persona.direccion}', '${persona.email}')">Actualizar</button>
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

function insertarPersona() {
    let datos = new FormData(document.getElementById('formInsertar'));

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos,
    };

    fetch("https://codetesthub.com/API/Insertar.php", configuracion)
        .then(res => res.json())
        .then(data => {
            console.log('Respuesta Json del servidor');
            console.log(data);
            cargarPersonas();
            document.getElementById('formInsertar').reset();
            let modalInsertar = bootstrap.Modal.getInstance(document.getElementById('modalInsertar'));
            modalInsertar.hide();
        })
        .catch(error => console.error('Error al insertar:', error));
}

function abrirModalActualizar(cedula, nombres, apellidos, telefono, direccion, email) {
    document.getElementById('actualizarCedula').value = cedula;
    document.getElementById('actualizarNombres').value = nombres;
    document.getElementById('actualizarApellidos').value = apellidos;
    document.getElementById('actualizarTelefono').value = telefono;
    document.getElementById('actualizarDireccion').value = direccion;
    document.getElementById('actualizarEmail').value = email;

    let modalActualizar = new bootstrap.Modal(document.getElementById('modalActualizar'));
    modalActualizar.show();
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
            document.getElementById('formActualizar').reset();
            let modalActualizar = bootstrap.Modal.getInstance(document.getElementById('modalActualizar'));
            modalActualizar.hide();
        })
        .catch(error => console.error('Error al actualizar:', error));
}

function eliminarPersona(cedula) {
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
        .then(data => {
            console.log('Respuesta Json del servidor');
            console.log(data);
            cargarPersonas();
        })
        .catch(error => console.error('Error al eliminar:', error));
}
