create database ej263;
use ej263;


CREATE TABLE cajeros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(250),
);
CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(250),
    precio INT,
);
CREATE TABLE maquinas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    piso INT,
);

INSERT INTO maquinas (piso) VALUES
    (1),
    (2),
    (3),
    (4);

INSERT INTO cajeros (nombre) VALUES
    ('Luis ortigues'),
    ('Fernando Bosé'),
    ('Bernabeth Andreu'),
    ('Andres bolivar');
   
INSERT INTO productos (nombre,precio) VALUES
    ('Radiocasette',35),
    ('Calendario Gatos 2024',8),
   ('Camiseta azul',17),
    ('Pantalones vaqueros',25),
     ('Pinturas oleo',18);
