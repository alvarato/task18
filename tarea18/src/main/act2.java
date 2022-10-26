package main;

import DAO.TransferData;

public class act2 {
	public void loadData() throws Exception {
		String sql;
		TransferData td = new TransferData();
		sql="CREATE TABLE departamentos(codigo INT NOT NULL auto_increment,nombre VARCHAR(100),presupuesto int,key(codigo));";
		td.sendSql(sql);
		sql="CREATE TABLE empleados(dni VARCHAR(8),nombre VARCHAR(100),apellidos VARCHAR(255),departamento INT,KEY(dni),FOREIGN KEY(departamento) REFERENCES departamentos(codigo));";
		td.sendSql(sql);
		sql = "INSERT INTO departamentos(nombre,presupuesto) VALUES('Informatica',40000),('Marketing',15000),('Tranversal',10000),('Ventas',35000),('Almacen',3000);";
		td.sendSql(sql);
		sql = "INSERT INTO empleados(dni,nombre,apellidos,departamento) VALUES('43597789','Alvaro','Bernabey Izquierdo',1),('42569879','Ramiro','Bercerra',2),('39845623','Martina','Herrera Moro',3),('45963210','Julieta','Alcaraz',4),('43597788','Fabricio','Juarez',5);";
		td.sendSql(sql);
		System.out.println("act2");
	}
}
