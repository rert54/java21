package exam16_람다표현식;

//인터페이스
@FunctionalInterface
interface Flyer2{
	public abstract void fly(int n);
}
public class TestMain2 {

	public static void main(String[] args) {
		
		//익명클래스
		Flyer2 f = new Flyer2() {
			@Override
			public void fly(int n) {
			System.out.println("fly()"+n);
			}
		};
		f.fly(10);
		
		//람다표현식 ( =>(자바스크립트) ,-> (자바)
		Flyer2 f2 = (int n) ->{System.out.println("람다.fly()"+n);};
		f2.fly(10);
		
		Flyer2 f3 = (n) ->{System.out.println("람다.fly()"+n);};
		f3.fly(10); //파라미터 데이터 타입 생략
	
		Flyer2 f4 = n ->{System.out.println("람다.fly()"+n);};
		f4.fly(10); //파라미터 하나면 괄화 생략 가능
		
		Flyer2 f5 = n ->System.out.println("람다.fly()"+n);
		f5.fly(10); //실행문장 하나면 중괄호 생략가능
		
		//리턴타입O 파라미터x
		
		
	}

}
