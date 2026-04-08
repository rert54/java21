package exam14_인터페이스2_추상클래스적용전;

public class Dog extends Pet{

	String gender;

	public Dog() {
		super();
	}
	public void dogEat() {} //부모안따르고 따로지정 즉 하위 클래스에서 부모클래스를 안따르고 따로 만들어도 무방하
	public void dogsleep() {}//부모 안따르고 따로 지정 

	public Dog(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Dog [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}


	
}
