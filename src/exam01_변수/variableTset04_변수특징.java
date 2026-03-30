package exam01_변수;

public class variableTset04_변수특징 {
	
	//인스턴스 변수
	int num; // heap메모리 
	public static void main(String[] args) {
		
		//변수명 중복불가
		int num = 10;   //stack 메모리
		//int num = 20; 변수명 중복이라 주석 처리
		//long num = 20; 변수명중복이라 주석 처리
		
		//로컬변수는 사용전에 반드시 초기화
		int size;
		//System.out.println(size);
		
		//블럭 scope
		{
			int age = 20;
			System.out.println(age);
		}
			//System.out.println(age); 여기에서 주석 풀면 에러나서 안될거임 why? 블럭 안에서 선언된 변수는 블럭밖에서 사용이 불가능 하다
		{
			int age = 30;
			System.out.println(age);
		}
		//블록이 다른면 변수명이 같아도 된다
}
}