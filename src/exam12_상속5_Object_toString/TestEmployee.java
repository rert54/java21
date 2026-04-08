package exam12_상속5_Object_toString;

public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m = new Manager("홍길동", 2000,"인사");
		Engineer eng = new Engineer("유관순",1800,"자바");
		
		System.out.println(m.getEmployee()); //홍길동	2000	인사
	
		
		//참조변수 출력 m과 eng
		System.out.println(m);//홍길동	2000	인사  tostring을 재정의하면 참조변수로 호출이 가능하다
		System.out.println(m.toString()); //홍길동	2000	인사
		//m=m.toString
		//Object의 toString() 이건 부모인 employee에도 없음
		//exam12_상속5_Object_toString.Manager@404b9385 toString의 실제구현값
		System.out.println(eng.getEmployee());
	
	String n = "hello";
	System.out.println(n);
	}

}
