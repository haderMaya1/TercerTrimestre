CREATE DATABASE MercadoLaEstacion;

USE MercadoLaEstacion;

CREATE TABLE `productoperecedero` (
	`nombre` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'latin1_swedish_ci',
	`cantidad` INT(11) NOT NULL DEFAULT '0',
	`precio` INT(11) NOT NULL DEFAULT '0',
	`fechaCreacion` DATE NULL DEFAULT NULL,
	`fechaVencimiento` DATE NULL DEFAULT NULL,
	PRIMARY KEY (`nombre`) USING BTREE
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;