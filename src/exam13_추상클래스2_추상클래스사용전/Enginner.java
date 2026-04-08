package exam13_추상클래스2_추상클래스사용전;

public class Enginner extends Employee{
	String skill;

	public Enginner(String skill) {
		super(name, salary);
		this.skill = skill;
	}
	//name과 salary를 리턴하느 메서드가 필요하다고 order가 옴
	public String getInfo() {
		return skill+"\t"+name+"t"salary;
	}
	
	
	//public Engineer(){
	//super();
	//} 가 안보이지만 생성되어있다 기본 생성자이다
}
