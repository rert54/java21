package exam18_예외처리;

public class ExciptionTest2_2 {

	public static void main(String[] args) {

			System.out.println("프로그램 시작");
			try { //예외발생할 문장이 있는곳을 할당
			int n=0; //n=0으로 하여 강제로 에러발생 시킴
			int result = 10/n; 
			System.out.println("결과:"+result);
			}catch(NullPointerException e) { //catch를 통해서 에러발생시 중단 상황을 스킵시킴
				//ArithmeticException를 넣어줘야한다 (0으로 나뉘어서 발생한에러라서) numllpointerException은 현상황에 적합하지않다 
				//발생된 에러에 적합한 점으로 넣어야 한다
				System.out.println("0으로 나누어서 예외발생"); //에러 코멘트
			}
			
			System.out.println("프로그램 정상 종료");
	}//end main

}
