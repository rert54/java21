package exam12_상속3_super;

//관리자
//Manager is a Employee (상속관계)
public class Manager extends Employee {


	String depart;
	
	public Manager() {
		super();//기본 생성자를 호출하는 super가 자동으로 추가 된다 why부모가에서 생성된건 부모에서 초기화하는게 맞기 떄문에
	}
	
	
	public Manager(String name, int salary, String depart) {
		super(name,salary);
		System.out.println("Manager 생성자");
//		this.name = name;
//		this.salary = salary;
		this.depart = depart;
	}

	//getter
	//setter

	public String getManager() {
		return name+"\t"+salary+"\t"+depart;
	}

}
