let contentPrincipal;
let contentPokemon;
let imagen;
let h2;
let nextUrl = null;
let prevUrl = null;
let imagencarga;
window.onload = function() {
    contentPrincipal = document.getElementById("contentPrincipal");
    contentPokemon = document.getElementById("contentPokemon");
    imagen = document.getElementById("imagen");
    imagencarga = document.getElementById("imagencarga")
    h2 = document.getElementById("texto");
}

function consumoApi(url = "https://pokeapi.co/api/v2/pokemon") {
    contentPrincipal.innerHTML = "";
    imagencarga.style.display = 'block';

    // Consumo - AJAX 
    fetch(url)
        .then(res => res.json())
        .then(data => {
            nextUrl = data.next; 
            prevUrl = data.previous;

            
            imagencarga.style.display = 'none';

            data.results.forEach(pokemon => {
                let html_temporal = `<div>
                                       <button class="btn btn-outline-dark m-1 mt-0 col-12" onclick="cargarDetalle('${pokemon.url}')">${pokemon.name}</button>
                                     </div>`;

                contentPrincipal.innerHTML += html_temporal;
            });

            // Agrego botones de paginaci0n
            agregarBotonesPaginacion();
        });
}

function agregarBotonesPaginacion() {
    let paginacionHtml = `<div class="btn-group" role="group" aria-label="Basic example">`;

    if (prevUrl) {
        paginacionHtml += `<button type="button" class="btn btn-secondary" onclick="consumoApi('${prevUrl}')">Anterior</button>`;
    }
    
    if (nextUrl) {
        paginacionHtml += `<button type="button" class="btn btn-secondary" onclick="consumoApi('${nextUrl}')">Siguiente</button>`;
    }
    
    paginacionHtml += `</div>`;
    
    contentPrincipal.innerHTML += paginacionHtml;
}

function cargarDetalle(endpoint) {
    imagencarga.style.display = 'block'; 
    imagen.style.display = 'none';      
    fetch(endpoint)
        .then(res => res.json())
        .then(data => {
            h2.innerText = data.name;
            imagen.src = data.sprites.other.dream_world.front_default;
            imagencarga.style.display = 'none'; 
            imagen.style.display = 'block';     
        });
    console.log(endpoint);
}
