CREATE DATABASE piñas

USE piñas

CREATE TABLE Usuario(

	IdUs VARCHAR (15) not null PRIMARY KEY,
	Nombre VARCHAR (50) not null,
	Telefono VARCHAR (15) not null,
	Direccion VARCHAR (30) not null,
	Correo VARCHAR (50) not null,
) 

CREATE TABLE Nac(
	IdNac VARCHAR (20) not null PRIMARY KEY,
	Nombre_nac VARCHAR (60) not null

)

CREATE TABLE Piña (
	IdPiña VARCHAR (15) not null,
	IdNac VARCHAR (20) not null,
	IdUs VARCHAR (15) not null,
	Nombre VARCHAR (50) not null
)

--CREACION DE LAS RELACIONES

--CLAVES COMPUESTAS

ALTER TABLE Piña 
ADD CONSTRAINT PK_Piña PRIMARY KEY (IdPiña, IdNac, IdUs)

--CLAVES FORANEAS

ALTER TABLE Piña
ADD CONSTRAINT FK_Piña FOREIGN KEY (IdUs)
REFERENCES Usuario

ALTER TABLE Piña
ADD CONSTRAINT FK_Piña1 FOREIGN KEY (IdNac)
REFERENCES Nac
