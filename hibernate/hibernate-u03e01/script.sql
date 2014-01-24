drop table if exists Direccion;

drop table if exists Profesor;

drop table if exists correoelectronico;

create table Direccion (
    Id integer not null,
    calle varchar(255),
    numero integer,
    poblacion varchar(255),
    provincia varchar(255),
    primary key (Id)
);

create table Profesor (
    Id integer not null,
    nombre varchar(255),
    ape1 varchar(255),
    ape2 varchar(255),
    primary key (Id)
);

CREATE TABLE `correoelectronico` (
  `idCorreoElectronico` int(11) NOT NULL,
  `direccionCorreo` varchar(45) DEFAULT NULL,
  `idProfesor` int(11) DEFAULT NULL,
  `idx` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCorreoElectronico`)
)

