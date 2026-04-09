package exam18_예외처리;

public class ExciptionTest4 {

	public static void main(String[] args) {

			System.out.println("프로그램 시작");
			try { //예외발생할 문장이 있는곳을 할당
			
			int n=0; //n=0으로 하여 강제로 에러발생 시킴
			int result = 10/n; 
			System.out.println("결과:"+result);
			}catch(ArithmeticException e) { //catch를 통해서 에러발생시 중단 상황을 스킵시킴
//			}catch(RuntimeException e) {	다형성 사용 가능하나 정확한 예외클래스 사용을 권장함
//			}catch(Exception e) {	다형성 사용 가능하나 정확한 예외클래스 사용을 권장함
			//예외처리 코드
				System.out.println("0으로 나누어서 예외발생"); //에러 코멘트
			}
			finally {
				System.out.println("반드시 실행되는문장임"); //무조건 실행되는 문장
			}
			
			System.out.println("프로그램 정상 종료");
	}//end main

}
