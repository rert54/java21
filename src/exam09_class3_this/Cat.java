package exam09_class3_this;
// 수업에서는 재사용 클래스라고 부름 
public class Cat { // 고양이 객체


		//구성요소 3가지
		//1. 인스턴스 변수 // 고양이개겣속성
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
		public Cat() {		
		}
		//초기화하는 진짜 생성자
		public Cat(String name, int age, String gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		public Cat(String name, int age) {
			this(name, age, null); // 생성자에서만 this 호출이 가능하고 반드시 첫라인호출해야한다, 중복 작업을 제거하기 위한 초기화
			
		}
		//우클릭 sourche 에서 제너레이트 using field super제외 클릭해서 만든 생성자들 이게 빠르고 편하다
			
		
	}


