package exam04_연산자;

public class Operator04_논리연산자1 {

	public static void main(String[] args) {
		
		//&& : and 연산자
		
		System.out.println(true && true); //true
		System.out.println(true && false); //false
	//	System.out.println(false && true); //false  shor-circuit 논리 연산자 계산 리소스를 위해 잇는 기능 이미 값이 정해져잇을 경우 앞의 값에 따라 겨로가가 정해져잇으면 굳이 비교할 필요가 없다 
	//	System.out.println(false && false); //false &&와||에서 존재한다 &&앞이 false일시 or는 앞이 t일시
		System.out.println("========");
		
		//|| : or 연산자
		
	//	System.out.println(true || true); //true 값이 이미 정해짐 tt는 or 비교 가치 x
	//	System.out.println(true || false); //true 앞이 t라서 비교가치 x 이미 t임
		System.out.println(false || true); //true
		System.out.println(false || false); //false
		System.out.println("========");
		
		//! : not 연산자
		
		System.out.println(!true); //false
		System.out.println(!true); //false
		System.out.println(!false); //true
		System.out.println(!false); //true


	}

}
