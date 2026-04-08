package exam14_인터페이스3_인터페이스적용전.copy;

public class Bat extends Pet implements Flyer {

	public Bat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void eat() {} //공통기능,부모에서 강제화를 위해 추상메소드로 만들것을 따름 
	@Override
	public void sleep() {}
	
	//추가적 비행기능  Flyer 인터페이스를 가져왔음. 펫에서는 완전 공통이 아니라 부분공통이라서 인터페이스로가져옴
	public void fly() {}
	
	@Override
	public String toString() {
		return "Bird [name=" + name + ", age=" + age + "]";
	}


	

}
