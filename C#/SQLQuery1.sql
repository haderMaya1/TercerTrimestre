CREATE DATABASE pi�as

USE pi�as

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

CREATE TABLE Pi�a (
	IdPi�a VARCHAR (15) not null,
	IdNac VARCHAR (20) not null,
	IdUs VARCHAR (15) not null,
	Nombre VARCHAR (50) not null
)

--CREACION DE LAS RELACIONES

--CLAVES COMPUESTAS

ALTER TABLE Pi�a 
ADD CONSTRAINT PK_Pi�a PRIMARY KEY (IdPi�a, IdNac, IdUs)

--CLAVES FORANEAS

ALTER TABLE Pi�a
ADD CONSTRAINT FK_Pi�a FOREIGN KEY (IdUs)
REFERENCES Usuario

ALTER TABLE Pi�a
ADD CONSTRAINT FK_Pi�a1 FOREIGN KEY (IdNac)
REFERENCES Nac
