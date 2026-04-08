package exam13_추상클래스2_추상클래스사용전;

public class Manager extends Emplopyee{
	String depart;

	public Manager(String depart,int salary,String depart) {
		super(name,salary);
		this.depart = depart;
	}
	
	//name과 depart를 리턴하느 메서드가 필요하다고 order가 옴
	public String getNameSalraryDepart() {
		return depart+"\t"+name"\t"+salary;
	}
}
