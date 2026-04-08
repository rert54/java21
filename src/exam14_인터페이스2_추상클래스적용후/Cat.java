package exam14_인터페이스2_추상클래스적용후;

public class Cat extends Pet {

	String color; // 색상 cat에만 가지고있는 속성

	public Cat() {//기본생성자
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void eat() {} //공통기능,부모에서 강제화를 위해 추상메소드로 만들것을 따름 
	@Override
	public void sleep() {}
	
	
	public Cat(String name, int age, String color) {//파라미터를 가진생성자 using 필드에서 상단에서 변경해서만듬
		super(name, age);
		this.color = color;
	}

	@Override
	public String toString() {//소스로 만들었고, name age도 가져와서 출력해야되기에 추가 설정했음
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + "]";
	}


	
}
