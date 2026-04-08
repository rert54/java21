package exam16_람다표현식;

//인터페이스
@FunctionalInterface
interface Flyer3{
	public abstract void fly(int n,int n2);
}
public class TestMain3 {

	public static void main(String[] args) {
		
		//익명클래스
		Flyer3 f = new Flyer3() {
			@Override
			public void fly(int n,int n2) {
			System.out.println("fly()"+n+"\t"+n2);
			}
		};
		f.fly(10,20);
		
		//람다표현식 ( =>(자바스크립트) ,-> (자바)
		Flyer3 f2 = (int n,int n2) ->{System.out.println("람다.fly()"+n+"\t"+n2);};
		f2.fly(10,20);
		
		Flyer3 f3 = (n, n2)->{System.out.println("람다.fly()" +n+"\t"+n2);};
		f3.fly(10,20); //파라미터 데이터 타입 생략
	
		Flyer3 f4 = (n,n2) ->{System.out.println("람다.fly()"+n+"\t"+n2);};
		f4.fly(10, 20); //파라미터 두개라 중괄호 필수
		

		
		//리턴타입x 파라미터o
		
		
	}

}
