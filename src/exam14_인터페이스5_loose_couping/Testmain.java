package exam14_인터페이스5_loose_couping;

public class Testmain {

	public static void main(String[] args) {

		DBService service = new DBService();
		//service.setDao(new MySQLDAO());
		service.setDao(new OracleDAO());
		service.connet();
		
	}

}
