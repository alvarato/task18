package main;

import DAO.TransferData;

public class act3 {
	public void loadData() throws Exception {
		String sql;
		TransferData td = new TransferData();
		sql="CREATE TABLE almacenes(codigo INT NOT NULL auto_increment,lugar varchar(100),capacidad int,key(codigo));";
		td.sendSql(sql);
		sql="CREATE TABLE cajas(numReferencia CHAR(5),contenido VARCHAR(100),valor INT,almacen int,FOREIGN KEY(almacen) REFERENCES almacenes(codigo));";
		td.sendSql(sql);
		sql = "INSERT INTO almacenes(lugar,capacidad) VALUES('Ribes 27',5),('Montaner 56',30),('Raval 21',18),('Diagonal 596',120),('Cerdanyola 22',12);";
		td.sendSql(sql);
		sql = "INSERT INTO cajas(numReferencia,contenido,valor,almacen) VALUES('12345','Tornillos',100,1),('12346','Mouse',500,2),('12347','Teclado',300,3),('12348','Auriculares',150,4),('12349','Pantalla',600,5);";
		td.sendSql(sql);
		System.out.println("act3");
	}
}
