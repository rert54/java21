package exam18_예외처리;

public class ExciptionTest3 {

	public static void main(String[] args) {

			System.out.println("프로그램 시작");
			try { //예외발생할 문장이 있는곳을 할당
				 // ArithmeticException 발생 가능성
				 int n=1;
				 int result = 10/n;  
				 System.out.println("결과:"+result);
			// NullPointerException 발생 가능성
			 String s = null;
			 System.out.println(s.length());
			
			
			System.out.println("결과:"+result);
			}catch(ArithmeticException e) {  
		    	System.out.println("0으로 나누어서 예외발생" + e.getMessage());	//     / by zero 	
		    }catch(NullPointerException e) {
		    	System.out.println("객체 생성없이 메서드 호출해서 예외발생" + e.getMessage()); // Cannot invoke "String.length()" because "s" is null
		    }catch(Exception e) {
		    	System.out.println("포괄적인 예외처리용-예외발생" + e.getMessage());
		    }
			
			System.out.println("프로그램 정상 종료");
	}//end main

}
