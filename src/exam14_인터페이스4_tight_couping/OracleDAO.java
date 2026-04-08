package exam14_인터페이스4_tight_couping;

public class OracleDAO implements DBDAO {
	//Oracle DB 연동
	@Override
	public void connectDB() {
		System.out.println("OracleDAO.connectOracle()");
	}
}
