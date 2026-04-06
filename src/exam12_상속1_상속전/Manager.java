package exam12_상속1_상속전;

public class Manager {
	
	String name;
	int salary;
	String depart;
	
	public Manager() {}
	
	public Manager(String name, int salary, String depart) {
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
