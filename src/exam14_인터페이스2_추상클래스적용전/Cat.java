package exam14_인터페이스2_추상클래스적용전;

public class Cat extends Pet {

	String color; // 색상 cat에만 가지고있는 속성

	public Cat() {//기본생성자
		super();
		// TODO Auto-generated constructor stub
	}
	public void catEat() {} //부모안따르고 따로지정 즉 하위 클래스에서 부모클래스를 안따르고 따로 만들어도 무방하
	public void catsleep() {}//부모 안따르고 따로 지정 
	
	
	public Cat(String name, int age, String color) {//파라미터를 가진생성자 using 필드에서 상단에서 변경해서만듬
		super(name, age);
		this.color = color;
	}

	@Override
	public String toString() {//소스로 만들었고, name age도 가져와서 출력해야되기에 추가 설정했음
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + "]";
	}


	
}
