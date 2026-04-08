package exam14_인터페이스2_추상클래스적용후;

public class Dog extends Pet{

	String gender;

	public Dog() {
		super();
	}
	@Override
	public void eat() {} //공통기능,부모에서 강제화를 위해 추상메소드로 만들것을 따름 
	@Override
	public void sleep() {}

	public Dog(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Dog [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}


	
}
