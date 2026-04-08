package exam13_추상클래스2_추상클래스사용전;

public abstract class Emloyee {
	
	String name;
	int salary;
	
	public Emloyee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		
		//name과 salary를 리턴하느 메서드가 필요하다고 order가 옴
		public abstract String getEmployee() {
			return name+"\t"+salary;
		}
	}
}
