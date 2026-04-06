package exam12_상속4_오버라이딩;

//관리자
//Manager is a Employee (상속관계)
public class Manager extends Employee {


	String depart;
	
	public Manager() {
		super();//기본 생성자를 호출하는 super가 자동으로 추가 된다 why부모가에서 생성된건 부모에서 초기화하는게 맞기 떄문에
	}
	public Manager(String name, int salary) {
		super(name, salary);
	
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

	/*public String getManager() {
		return name+"\t"+salary+"\t"+depart;
	}
	*/ // 오버라이딩 실습을 위해서 주석처리함
	//오버라이딩 - generate 방법이용 우측-소스-override-불러올 메소드 고른후 
	@Override
	public String getEmployee() {
		return super.getEmployee()+"\t"+depart;
		// return name+"\t+salary+"\t"depart; 중 택일
	}

	

}
