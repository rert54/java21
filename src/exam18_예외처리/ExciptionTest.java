package exam18_예외처리;

public class ExciptionTest {

	public static void main(String[] args) {

			System.out.println("프로그램 시작");
			
			int n=2;
			int result =10/n; //java.langArithmeticException 예외클래스 이용 예외처리 가능
			System.out.println("결과:"+result);
			
			System.out.println("프로그램 정상 종료");
	}//end main

}
