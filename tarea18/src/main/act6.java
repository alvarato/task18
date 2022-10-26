package main;

import DAO.TransferData;

public class act6 {
	public void loadData() throws Exception {
		String sql;
		TransferData td = new TransferData();
		sql="CREATE TABLE piezas (codigo int NOT NULL AUTO_INCREMENT,nombre varchar(100) DEFAULT NULL,PRIMARY KEY (codigo));";
		td.sendSql(sql);
		sql="CREATE TABLE proveedores (id int NOT NULL AUTO_INCREMENT,nombre varchar(100) DEFAULT NULL,PRIMARY KEY (id));";
		td.sendSql(sql);
		sql="CREATE TABLE suministra (codigoPieza int NOT NULL,idProveedor int NOT NULL,precio int DEFAULT NULL,PRIMARY KEY (codigoPieza,idProveedor),FOREIGN KEY (codigoPieza) REFERENCES piezas (codigo) ON DELETE CASCADE ON UPDATE CASCADE,FOREIGN KEY (idProveedor) REFERENCES proveedores (id) ON DELETE CASCADE ON UPDATE CASCADE);";
		td.sendSql(sql);
		sql = "insert into piezas (nombre) values('Pieza1'),('Pieza2'),('Pieza3'),('Pieza4'),('Pieza5'),('Pieza6'),('Pieza7'),('Pieza8'),('Pieza9'),('Pieza10');";
		td.sendSql(sql);
		sql = "insert into proveedores (nombre) values('Proveedor1'),('Proveedor2'),('Proveedor3'),('Proveedor4'),('Proveedor5'),('Proveedor6'),('Proveedor7'),('Proveedor8'),('Proveedor9'),('Proveedor10');";
		td.sendSql(sql);
		sql = "insert into suministra (codigoPieza, idProveedor, precio) values(1, 1, 10),(2, 2, 20),(3, 3, 30),(4, 4, 40),(5, 5, 50),(6, 6, 60),(7, 7, 70),(8, 8, 80),(9, 9, 90),(10, 10, 100);";
		td.sendSql(sql);
		System.out.println("act7");
	}
}
