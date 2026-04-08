package exam14_인터페이스5_loose_couping;

public class DBService {
	//MySQLDAO dao;
	OracleDAO dao;	//set메서드로 초기화
	
	//public void setDao(MySQLDAO dao) {
	public void setDao(OracleDAO dao) {
		this.dao = dao;
	}
	
	public void connet() {
		//dao.connectMySQL();
		dao.connectOracle();
	
	}
	
}
