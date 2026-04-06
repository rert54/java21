package exam12_상속5_Object_toString;


public class Employee {
	String name;
	int salary;
	public Employee() { //생성자
		System.out.println("Employee 생성자");
	}
	public Employee(String name, int salary) {
		System.out.println("Employee (String name, int salary)생성자");
		this.name = name;
		this.salary = salary;
	}
	
	//getter
	//setter 편의상 표현 x
	public String getEmployee() { //name salary를 리턴하는 생성자
		return name+"\t"+salary;
				
	}	
}
