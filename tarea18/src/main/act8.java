package main;

import DAO.TransferData;

public class act8 {
	public void loadData() throws Exception {
		String sql;
		TransferData td = new TransferData();
		sql="CREATE TABLE Cajeros(codigo INT NOT NULL AUTO_INCREMENT,nombre_apellidos VARCHAR(255),KEY(codigo));";
		td.sendSql(sql);
		sql="CREATE TABLE Productos(codigo INT NOT NULL AUTO_INCREMENT,nombre VARCHAR(100),precio INT,KEY (codigo));";
		td.sendSql(sql);
		sql="CREATE TABLE Maquinas_registradoras(codigo INT NOT NULL AUTO_INCREMENT,piso INT,KEY (codigo));";
		td.sendSql(sql);
		sql="CREATE TABLE Venta(cajero INT NOT NULL,maquina INT NOT NULL,producto INT NOT NULL,FOREIGN KEY (cajero) REFERENCES Cajeros(codigo),FOREIGN KEY (maquina) REFERENCES Maquinas_registradoras(codigo),FOREIGN KEY (producto) REFERENCES Productos(codigo));";
		td.sendSql(sql);
		sql = "INSERT INTO Cajeros(nombre_apellidos) VALUE('Alvaro Bernabey'),('Nicolas Bernabey'),('Jaume robledo'),('Victoria Lopez'),('Jose Ramirez'),('Roberto Alabe'),('Albert Sudoku'),('Cristiano Jamaldo'),('Lionel Mesa'),('Roberto Tevez');";
		td.sendSql(sql);
		sql = "INSERT INTO Productos(nombre,precio) VALUE('Tomate',3),('CocaCola',4),('Agua',1),('Salsa',2),('Cerveza',1),('Papas',5),('Jugo',5),('Pollo',10),('Lechuga',1),('Arroz',1);";
		td.sendSql(sql);
		sql = "INSERT INTO Maquinas_registradoras(piso) VALUE(1),(6),(4),(5),(2),(3),(1),(2),(4),(2),(3);";
		td.sendSql(sql);
		sql = "INSERT INTO Venta(cajero,maquina,producto) VALUE(1,1,1),(2,2,2),(3,3,3),(4,4,4),(5,5,5),(6,6,6),(7,7,7),(8,8,8),(9,9,9),(10,10,10);";
		td.sendSql(sql);
		System.out.println("act8");
	}
}
