package exam12_상속1_상속전;

public class Engineer {

		String name;
		int salary;
		String skill; //엔지니어의 기술
		
		public Engineer() {}
		public Engineer(String name, int salary, String skill) {
			this.name = name;
			this.salary = salary;
			this.skill = skill;
			//우클릭 source using field에서 만든 생성자
		}
		
		//getter
		//setter 편의상 스킵
		
		public String getEngineer() { //메소드
			return name+"\t"+salary+"\t"+skill;
		}
		
		
}
