package exam12_상속6_다형성;

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
		
		//Employee의 toString 재정의
		
		@Override
		public String toString() {
			return "Engineer [skill=" + skill + ", name=" + name + ", salary=" + salary + "]";
		}
		
}
