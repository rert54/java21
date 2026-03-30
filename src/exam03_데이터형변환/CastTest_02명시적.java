package exam03_데이터형변환;

public class CastTest_02명시적 {

	public static void main(String[] args) {
		// 1. 수치형
		//byte → short → int → long → float → double
			byte b= 10;
			short b2 = b; // byte 타입의 b갸 short 타입으로 변경됨
			int b3 = b2;
			long b4 = b3;
			
			float f = b4;
			double f2 = f;
			
			//byte x = f2; // 역은 불가능하다
					
			char c = 'A';
			int n = c;
			System.out.println(n); //65
			System.out.println(c+1); //문자도 연산이 가능하다

			int x = 'A'; //'A'문자가 자도응로 int로 저장되어 저장됨
			
			
			char c2 = 'a';
			int n2=c2;
			System.out.println(n2); //97
			
			
			//2
			short s = 10;
			short s2 = 20;
			//short s3 = s+s2; // 에러발생, 각각은 short지만 연산된 s+s2 결과값은 int임
			int s4 = s+s2;
			
			System.out.println(s4);
			
			//3
			int k = 10;
			double k2 = 20;
			//int k3 = k + k2; // k+k2 double로 반환
			double k4 = k +k2;
			
			//4. 문자열 + (비)문자열 ==> 문자열로 반환
			System.out.println("hello"+ "world");
			System.out.println("hello"+ 10);
			System.out.println("hello"+ 3.15);
			System.out.println("hello"+ true);
			
			System.out.println("hello"+ 10+20+30); //hello102030 문자열+문자열 구조가 되어버림
			System.out.println(10+20+30+"hello"); //60hello 숫자+문자열구조가 되어버림
	}

}
