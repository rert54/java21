package exam18_예외처리;

class Test2 {
	public void a() throws NullPointerException,ArithmeticException{
		b();
	}
	public void b() throws NullPointerException,ArithmeticException{
		//NullPointException 발생 가능
		String s = null;
		System.out.println(s.length());
		
		//ArithmeticException 발생 가능
		int n = 0;
		int result = 10/n;
		System.out.println("결과:"+result);
	}
}

public class ExciptionTest6 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		Test t = new Test(); //Test2의 메소드 호출을 위해 객체 생성
		t.a(); // 그중 a메소드 사용을 위해 호출
		
		try {
			t.a();
		}catch(NullPointerException e) {
 			System.out.println(e.getMessage());
//			e.printStackTrace(); //이유를 알고싶을때 사용
		}catch(ArithmeticException e) {
 			System.out.println(e.getMessage());
//			e.printStackTrace(); //이유를 알고싶을때 사용
		}
		catch(Exception e) {
 			System.out.println(e.getMessage());
//			e.printStackTrace(); //관례적으로 마지막은 최상위 Exception 사용
		}
		System.out.println("프로그램 정상종료");
	}//end main

}
