/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Katsuo
 * Created: 26-nov-2020
 */

DROP DATABASE IF EXISTS cfp27; /* si existe la base de datos cfp27 lo elimina */

CREATE DATABASE cfp27;

USE cfp27;

CREATE TABLE estudiantes(
  id_estudiante INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(30) NOT NULL,
  contrasenia VARCHAR(30) NOT NULL,
  email VARCHAR (30) NOT NULL,
  comentario VARCHAR(500),
  nota_mod_uno INT NOT NULL,
  nota_mod_dos INT NOT NULL,
  nota_mod_tres INT NOT NULL,
  PRIMARY KEY (id_estudiante)
);

INSERT INTO estudiantes(nombre, contrasenia, email, comentario, nota_mod_uno, nota_mod_dos, nota_mod_tres) VALUES
("Usuario", "def contraseña", "def email", "def comentario", 10,10,10),
("Alan", "123", "alanemail@algo.com", "def coment", 10,10,10),
("Rocio", "123", "rocioemail@algo.com", "def", 10,10,10),
("Christian", "123", "christianemail@algo.com", "def", 10,10,10),
("Gabriela", "123", "gabrielaemail@algo.com", "def", 10,10,10),
("Lucio", "123", "lucioemail@algo.com", "def", 10,10,10);


/*SELECT * FROM estudiantes;*/