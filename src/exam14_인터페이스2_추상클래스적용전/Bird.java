package exam14_인터페이스2_추상클래스적용전;

public class Bird extends Pet {

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public void birdEat() {} //부모안따르고 따로지정 즉 하위 클래스에서 부모클래스를 안따르고 따로 만들어도 무방하
	public void birdsleep() {}//부모 안따르고 따로 지정 
	
	@Override
	public String toString() {
		return "Bird [name=" + name + ", age=" + age + "]";
	}


	

}
