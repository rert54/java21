package exam04_연산자;

public class Operator05_증감연산자3 {

	
		
		public static int method() {
		int n =10;
		return ++n; //전치 : 먼저 계산후 리턴
		}
	
		public static int method2() {
		int n =10;
		return n++; //후치 : 먼저 리턴하고 나중에 증가
		}
		
		
		public static void main(String[] args) {
			System.out.println("전치:"+ method());
			System.out.println("후치:"+ method2());
			
		}

}
