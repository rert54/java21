package exam14_인터페이스2_추상클래스적용후;

public class Bird extends Pet {

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void eat() {} //공통기능,부모에서 강제화를 위해 추상메소드로 만들것을 따름 
	@Override
	public void sleep() {}
	
	@Override
	public String toString() {
		return "Bird [name=" + name + ", age=" + age + "]";
	}


	

}
