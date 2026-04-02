package exam09_class2;
// 수업에서는 재사용 클래스라고 부름 
public class Cat { // 고양이 객체


		//구성요소 3가지
		//1. 인스터늣 변수 // 고양이개겣속성
		String name;
		int age; // 접근지정자를 사용하여 접근을 차단 하기 위해서 private
		String gender;
	
	//2. 메서드		//고양이객체 동작
		public void eat() {
			System.out.println("쩝쩝");
		}
		public void cry() {
			System.out.println("야옹");
		}
		//3. 생성자
		public Cat(int n, String s) {
			 System.out.println("Cat 생성자" );
		}
	}


