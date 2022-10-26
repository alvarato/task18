package main;

import DAO.TransferData;

public class mainApp {
	public static void main(String[] args) throws Exception {
		String sql;
		TransferData td = new TransferData();
		sql = "DROP DATABASE IF EXISTS tarea18;";
		td.sendSql2(sql);
		sql="CREATE SCHEMA tarea18;";
		td.sendSql2(sql);
		act1 a1 = new act1();
		a1.loadData();
		act2 a2 = new act2();
		a2.loadData();
		act3 a3 = new act3();
		a3.loadData();
		act4 a4 = new act4();
		a4.loadData();
		act5 a5 = new act5();
		a5.loadData();
		act6 a6 = new act6();
		a6.loadData();
		act7 a7 = new act7();
		a7.loadData();
		act8 a8 = new act8();
		a8.loadData();
		act9 a9 = new act9();
	}
}
