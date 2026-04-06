package exam12_상속2_상속후;

//관리자
//Manager is a Employee (상속관계)
public class Manager extends Employee {


	String depart;
	
	//생정사 작서응ㄹ generate으로
	
	

	//getter
	//setter

	public String getManager() {
		return name+"\t"+salary+"\t"+depart;
	}

	public Manager() {
		super();
		
	}

	public Manager(String name, int salary) {
		super(name, salary);

	}
//소스에서 field. 상단에서 연결된 부모의 생성자를 변경 그럼 name salary, 그리고 필드의 depart를 가진걸로
	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

}
