package exam12_상속6_다향성;

public class TestEmployee4 {
	
	//기본형 데이터를 저장하는 파라미터 가진 메서드
	public static void method(double d) {}	
	//참조형 데이터를 저장하는 파라미터 가진 메서드
	public static void method2(Employee e) {}
	//참조형 데이터를 저장하는 파라미터 가진 메서드
	public static void method3(Object obj) {}
	
	public static void main(String[] args) {
		
		//다형성이 적용된 방식
		//2.메서드 파라미터 타입
		//기본형
		
		method(10);
		method(3.35F);
		method(3.56D);
		//참조형
		method2(new Employee("홍길동",2000));
		method2(new Engineer("홍길동",2000,"자바"));
		method2(new Manager("홍길동",2000,"관리"));
		//확장하면
		method3(10);
		method3("hello");
		method3(3.14);
		method3(true);
		method3(new Employee("홍길동",200));

	}

}
