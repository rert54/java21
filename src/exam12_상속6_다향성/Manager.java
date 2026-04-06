package exam12_상속6_다향성;

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
		this.depart = depart;
	}



	//Object의 toString 재정의
	@Override
	public String toString() {
		return name+"\t"+salary+"\t"+depart;
		//return super.toString(); 현재는 필요 없음
	}
}
