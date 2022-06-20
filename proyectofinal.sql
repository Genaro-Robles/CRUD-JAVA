create database TFinal
use TFinal

create table Asociado(
codigo int primary key identity,
nombre varchar(30),
apellidos varchar(30),
estado varchar(15),
eps varchar(30),
dni varchar(8),
aportes int,
nivel_estudio int,
salario money,
numero_hijos int,
telefono varchar(9),
direccion varchar(40)
)

create table Solicitud(
id int primary key identity,
cod int,
cuotas int,
monto money,
fecha date,
motivo varchar(40),
taza real,
estado varchar(20)
)

ALTER TABLE Solicitud
ADD CONSTRAINT FK_cod
FOREIGN KEY (cod) REFERENCES Asociado (codigo)

create table Cuota(
numero int,
saldo money,
capital money,
interes money,
prestamos int
)
ALTER TABLE Cuota
ADD CONSTRAINT FK_prestamos
FOREIGN KEY (prestamos) REFERENCES Solicitud (id)

create table Soportes(
codigo int primary key identity,
nombre varchar(30),
contenido varchar(300),
solicitud int
)


ALTER TABLE Soportes
ADD CONSTRAINT FK_soli
FOREIGN KEY (solicitud) REFERENCES Solicitud (id)

-- INGRESO DE DATOS (NO ES NECESARIO AGREGARLOS Y SON MERAS PRUEBAS)
insert into Solicitud (cod,cuotas,monto,fecha,motivo,taza,estado) values ('1','2','500','2021-02-17','Prestamo','3','Pendiente')
insert into Soportes (nombre,contenido,solicitud) values ('Probelma con el pago','Buenas tardes tengo un problema con el pago','6')
insert into Cuota (numero, saldo, capital, interes, prestamos) values ('1','500','300','200','29')
insert into Cuota (numero, saldo, capital, interes, prestamos) values ('2','500','300','200','29')
insert into Cuota (numero, saldo, capital, interes, prestamos) values ('3','500','300','200','29')
insert into Cuota (numero, saldo, capital, interes, prestamos) values ('1','800','600','200','6')
insert into Cuota (numero, saldo, capital, interes, prestamos) values ('2','800','600','200','6')

--- PRUEBAS ----

select * from Solicitud
select * from Asociado
select * from Soportes
select * from Cuota

select top 1 * from Solicitud
order by id desc

select count(id) as cantidad,YEAR(fecha) as fecha from Solicitud group by year(fecha)