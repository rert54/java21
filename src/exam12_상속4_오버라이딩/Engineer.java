package exam12_상속4_오버라이딩;

//엔지니어
//Engineer is a Employee (상속관계)
public class Engineer extends Employee { 

		String skill; //엔지니어의 기술
		
		public Engineer() {
			super();//기본 생성자를 호출하는 super가 자동으로 추가 된다 why부모가에서 생성된건 부모에서 초기화하는게 맞기 떄문에
		}
		public Engineer(String name, int salary) {
			super(name, salary);
		}
		public Engineer(String name, int salary, String skill) {
			super(name, salary);
			this.skill = skill;
			System.out.println("Enginner 생성자");
			//우클릭 source using field에서 만든 생성자
		}
		
		//getter
		//setter 편의상 스킵
		
		/*public String getEngineer() { //메소드
			return name+"\t"+salary+"\t"+skill;
		}
		*/
		//오버라이딩 적용을 할거기에 get이후 주석처리함
		//오버라이딩 자식을 재정의할예정 여기선 skill가지 가져올 예정
		@Override  
		public String getEmployee() {
			return super.getEmployee()+"\t"+skill;
			// = return name+"\t+salary+"\t"skill; 중 택일
		}
		//재정의한 메소드라는 걸 알려준다 override는 클래스다
}
