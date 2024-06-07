-- Creación de la tabla Comics
CREATE TABLE Comics (
    id_comic INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    total_paginas INT NOT NULL,
    fecha_lanzamiento DATE NOT NULL
);

-- Creación de la tabla Categoría
CREATE TABLE Categoria (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre_categoria VARCHAR(255) NOT NULL
);

-- Creación de la tabla intermedia Comic-Categoría
CREATE TABLE Comic_Categoria (
    id_comic INT,
    id_categoria INT,
    PRIMARY KEY (id_comic, id_categoria),
    FOREIGN KEY (id_comic) REFERENCES Comics(id_comic),
    FOREIGN KEY (id_categoria) REFERENCES Categoria(id_categoria)
);