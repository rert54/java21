package exam09_class2_생성자;
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
		//생성자를 만들지 않으면 시스템이 기본생성자를 만들어준다 다만, 안보인다 파라미터는 없다
		//위치는 상관없으나 일반적으론 변수 - 생성자 - 메소드 순
		public Cat() {}//overloading 생성자 즉, 동일 클래스를 사용하나 인자가 다른 생성자
		
		public Cat(String s) {
			name = s;
		}
		public Cat(String s, int num) {
			name = s;
			age = n;
		}	
		public Cat(String s,int num ,String s2) {
			//s n s2는 로컬 변수
			name = s;
			//age 검증
			if(num >= 20) {
				System.out.println("나이 오류, 확인요망");
			}else {
				age = num;
			}
			age = num;
			gender = s2;
		
		}
	}


