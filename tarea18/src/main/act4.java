package main;

import DAO.TransferData;

public class act4 {
	public void loadData() throws Exception {
		String sql;
		TransferData td = new TransferData();
		sql="create table peliculas(codigo int auto_increment not null,nombre VARCHAR(20),edad int,key(codigo));";
		td.sendSql(sql);
		sql="CREATE TABLE salas(codigo int auto_increment not null,nombre varchar(100),pelicula int,key(codigo),foreign key(pelicula) references peliculas(codigo));";
		td.sendSql(sql);
		sql = "INSERT INTO peliculas(nombre,edad) VALUES('Batman',16),('KIDS',5),('Pokemon',12),('ENDGAME',18),('Blade Runner',16);";
		td.sendSql(sql);
		sql = "INSERT INTO salas(nombre,pelicula) VALUES('SALA A1',1),('SALA A2',2),('SALA B1',3),('SALA B2',4),('SALA A3',5);";
		td.sendSql(sql);
		System.out.println("act4");
	}
}
