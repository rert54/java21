package exam12_상속2_상속후;

//엔지니어
//Engineer is a Employee(상속관계)

public class Engineer extends Employee {
	String name;
	int salary;
	public Employee() { //생성자
	System.out.println("Enployee 생성자");
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
