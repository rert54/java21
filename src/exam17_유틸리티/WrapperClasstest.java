package exam17_유틸리티;

public class WrapperClasstest {

	public static void main(String[] args) {

		//1.수치데이터 값의 범위
		System.out.println("int 값 최소화" + Integer.MIN_VALUE);
		System.out.println("int 값 최대화" + Integer.MAX_VALUE);
		
		System.out.println("double 값 최대화" + Double.MAX_VALUE);
		System.out.println("double 값 최대화" + Double.MAX_VALUE);
		
		
		System.out.println("문자열을 정수로 변환" + Integer.parseInt("10"));
		System.out.println("int 값 최대화" + Float.parseFloat("3.14"));
	
		System.out.println("정수 sum"+Integer.sum(10,20));
		System.out.println("정수 max"+Integer.max(10,20));
		System.out.println("정수 min"+Integer.min(10,20));

		//기본형과 참조형(Wrapper) 서로 쉽게 호환되도록 지원
		int n = 10; //기본형
		//Integer n2 = new Integer(10); 참조형을 만들때 이렇게 써야하나 아래가 가능
		Integer n2 = n; // 참조형에 기본형을 저장하는 형태
		int n3 = n2; //기본형에 참조형을 저장하는 형태
	
	}

}
