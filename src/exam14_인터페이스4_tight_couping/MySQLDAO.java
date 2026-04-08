package exam14_인터페이스4_tight_couping;

public class MySQLDAO implements DBDAO {
	//MySQL DB 연동
	@Override
	public void connectDB() {
		System.out.println("MySQLDAO.connectMySQL()");
	}
}