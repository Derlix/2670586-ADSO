document.addEventListener('DOMContentLoaded', function() {
    fetchUsers();
});

function fetchUsers() {
    fetch('https://jsonplaceholder.typicode.com/users')
    .then(response => response.json())
    .then(data => {
        renderUsers(data);
    })
    .catch(error => console.error('Error al cargar la API:', error));
}

function renderUsers(users) {
    const usersContainer = document.getElementById('users');
    let htmlContent = '';

    users.forEach(user => {
        htmlContent += `
            <div class="col-md-4">
                <div class="card mb-4">
                    <div class="card-body">
                        <h5 class="card-title">${user.name}</h5>
                        <p class="card-text">
                            Username: ${user.username}<br>
                            Email: ${user.email}<br>
                            Address: ${user.address.street}, ${user.address.city}<br>
                            Phone: ${user.phone}
                        </p>
                    </div>
                </div>
            </div>`;
    });

    usersContainer.innerHTML = htmlContent;
}
