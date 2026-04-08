package exam14_인터페이스3_인터페이스적용전.copy;
//Cat,Dog,Bird의 공통적인 속성과 동작을 정의하는 메소드
public abstract class Pet {
	
	//공통적인 속석
	String name;
	int age;
	
	//공통적인 기능
	//강제하기 위해서 추상 클래스로 만들다 이건 다음 패키지에서실습한다
	public abstract void eat();
	public abstract void sleep();
	//public abstract void fly() {} 나는건 부분만 사용해서 만들기 곤란하다 개고양이는 날지 못함
	
	public Pet() {

	}
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}
	
	//getter,setter 메서드 추가 생략
	
}
