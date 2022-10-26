package main;

import DAO.TransferData;

public class act5 {
	public void loadData() throws Exception {
		String sql;
		TransferData td = new TransferData();
		sql="CREATE TABLE Despachos(numero INT NOT NULL AUTO_INCREMENT,capacidad INT,KEY(numero));";
		td.sendSql(sql);
		sql="CREATE TABLE Directores(dni VARCHAR(8),nombre_apellidos VARCHAR(255),dni_jefe VARCHAR(8),despacho INT,KEY(dni),FOREIGN KEY (dni_jefe) REFERENCES Directores(dni),FOREIGN KEY (despacho) REFERENCES Despachos(numero));";
		td.sendSql(sql);
		sql = "INSERT INTO despachos(capacidad) VALUES(20),(6),(20),(56),(50);";
		td.sendSql(sql);
		sql = "INSERT INTO directores(dni,nombre_apellidos,dni_jefe,despacho) VALUES('23456789','Ramon el del Barco','23456789',1),('45678912','Joaquin Villalba','23456789',3),('56789123','Joqui Juarez','45678912',2),('67891234','Sofia Luna','56789123',4),('78912345','Marta Marita','67891234',5);";
		td.sendSql(sql);
		System.out.println("act5");
	}
}
