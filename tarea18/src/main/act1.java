package main;
import DAO.TransferData;

public class act1 {
	public void loadData() throws Exception {
		String sql;
		TransferData td = new TransferData();
		sql="CREATE TABLE fabricantes(codigo INT AUTO_INCREMENT NOT NULL,nombre VARCHAR(100),KEY(codigo));";
		td.sendSql(sql);
		sql="CREATE TABLE Articulos(codigo INT auto_increment not null,nombre VARCHAR(100),precio int,fabricante int,KEY(codigo),FOREIGN KEY(fabricante) REFERENCES fabricantes(codigo));";
		td.sendSql(sql);
		sql ="INSERT INTO fabricantes(nombre) Values('Herreria Fer'),('Metales ml'),('Plasticos ldq'),('Sony'),('Electronicos S.A.');";
		td.sendSql(sql);
		sql = "INSERT INTO articulos(nombre,precio,fabricante) VALUES('Tornillo',1,1),('Tuerca',1,2),('Precinto',2,3),('Mouse',10,4),('Zapatilla',3,5);";
		td.sendSql(sql);
		System.out.println("act1");
	}
}
