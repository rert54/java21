package exam12_상속4_오버라이딩;

public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m = new Manager("홍길동", 2000,"인사");
		Engineer eng = new Engineer("유관순",1800,"자바");
		
		System.out.println(m.getEmployee());
		System.out.println(eng.getEmployee());
		
		//수정 : 원래는 setter 메서드 이요
		//m.salary = 3000;
		//조회:원래는 getter 메서드이용
		//System.out.println(m.name+"\t"+m.salary+"\t"+m.depart);
	}

}
