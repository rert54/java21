package exam18_예외처리;

class Test {
	public void a() throws NullPointerException{
		b();
	}
	public void b() throws NullPointerException{
		
		String s = null;
		System.out.println(s.length());
	}
}

public class ExciptionTest5 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		Test t = new Test();
		t.a();
		
		try {
			t.a();
		}catch(NullPointerException e) {
 			System.out.println(e.getMessage());
//			e.printStackTrace(); //이유를 알고싶을때 사용
		}
		System.out.println("프로그램 정상종료");
	}//end main

}
