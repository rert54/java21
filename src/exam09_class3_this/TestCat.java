package exam09_class3_this;
//수업에서 핸들링 클래스라 부를것
public class TestCat {
	public static void main(String[] args) {
		//Cat 클래스를 메모리에 올림(객체생성)
		//클래스명 변수명 = new 클래스명();
		Cat c1 = new Cat("야옹이",100,"rt"); 
	
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.gender);
		
		Cat c2 = new Cat("야옹이2",10,"); 
		
		System.out.println(c1.name);
		System.out.println(c1.age);
	
		/*
		//실제값 저장
		c1.name = "야옹이";
		c1.age = 100; // 문법적으로 문제 없음. 논리적으로 문제 있음
		c1.gender = "암";
		*/
	}
}