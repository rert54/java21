package exam12_상속2_상속후;

public class Manager extends Employee {
//관리자
//Manager is a Employee(상속관계)
	String name;
	int salary;
	String depart;
	
	public Manager() {}
	
	public Manager(String name, int salary, String depart) {
		System.out.println("Manager 생성자");
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}

	//getter
	//setter

	public String getManager() {
		return name+"\t"+salary+"\t"+depart;
	}

}
