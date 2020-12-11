create database Harmony222;

use Harmony222;

create table CADASTRO_USUARIO (
IdUsuario int primary key auto_increment,
Nome varchar(40),
Nasc date,
Email varchar(40),
Senha varchar(20),
Instrumento varchar(20)
)auto_increment=100;

select * from 	CADASTRO_USUARIO;

insert into CADASTRO_USUARIO values
(null,'Joel Pereira da silva','2000-11-17','joel@bandtec.com','bandtec','Violão'),
(null,'Daniel Juncks','1996-01-02','daniel@bandtec.com','bandtec','Bateria'),
(null,'Raphael Bachega','1997-07-01','Bachega@bandtec.com','bandtec','Baixo'),
(null,'Kaique Beserra','2001-11-13','Kaique@bandtec.com','bandtec','Guitarra');

create table Instrumentos (
IdInstrumento int primary key auto_increment,
Nome_instrumento varchar (20),
Temperatura_ideal int,
Umidade_ideal varchar (7)
)auto_increment=100;

insert into Instrumentos values
(null, 'Violão', '23', '50%'),
(null, 'Violino', '23', '50%'),
(null, 'Guitarra', '24', '30%-50%'),
(null, 'Baixo', '24', '30%-50%'),
(null, 'Bateria', '24', '30%-50%');

