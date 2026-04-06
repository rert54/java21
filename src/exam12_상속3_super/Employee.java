package exam12_상속3_super;


public class Employee {
	String name;
	int salary;
	public Employee() { //생성자
		System.out.println("Employee 생성자");
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	//getter
	//setter 편의상 표현 x
	public String getEmString() { //name salary를 리턴하는 생성자
		return name+"\t"+salary;
				
	}

	
}
