package exam09_class2;
//수업에서 핸들링 클래스라 부를것
public class TestCat {
	public static void main(String[] args) {
		//Cat 클래스를 메모리에 올림(객체생성)
		//클래스명 변수명 = new 클래스명();
		Cat c1 = new Cat(10,"rt"); //new Cat() 괄호안에는 불러오는 클래스의 파라미터와 인자를 맞추어야한다
//여기가인자 불러오는곳의 생성자가 파라미터		
		/*
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.gender);
		
		//실제값 저장
		c1.name = "야옹이";
		c1.age = 200; // 문법저긍로 문제 없음. 논리적으로 문제 있음
		c1.gender = "암";
		*/
	}
}