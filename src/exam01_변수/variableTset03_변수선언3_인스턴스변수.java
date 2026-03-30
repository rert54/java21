package exam01_변수;

public class variableTset03_변수선언3_인스턴스변수 {

	public static void main(String[] args) {
		int size = 20; //인스턴스 변수
		
		public static void main(String[] args) {
			
			//로컬변수
			int num = 10;
			System.out.println(num);
			
			//인스턴스 변수
			
			//System.out.println(size);  //사이즈 변수가 생성되지 않아 실행이 안됨 따라서 생성 해줌
			
			variableTset03_변수선언3_인스턴스변수 t =
					new variableTset03_변수선언3_인스턴스변수();
				System.out.println(t.size); // 객체생성후이기에 사용가능 위치를 알려주기위해서 t뒤에 .을 붙여 t.로 사용		}

	}

		public static void main(String[] args) {
			/hellotest/src/exam01_변수/variableTset03_변수선언3_인스턴스변수.java
		}

}
