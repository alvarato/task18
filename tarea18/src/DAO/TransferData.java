package DAO;

public class TransferData extends DAO{
		
	public void sendSql(String sql) throws Exception {
		try {
			CUD(sql);
		} catch (Exception e) {
		}
	}
	public void sendSql2(String sql) throws Exception {
		try {
			CUD2(sql);
		} catch (Exception e) {
		}
	}
}
