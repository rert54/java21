package exam12_상속6_다형성2_동적타이핑;

public class TestEmployee {

	public static void main(String[] args) {
		
		//다형성을 적용 안한 경우
		Employee m = new Manager();
		m.a();
		Employee em = new Employee();
		em.a();
		
		//다형성
		Employee e = new Manager();
		e.a();
		//e.b();자식에서 추가된건 형변환해서 사용해야 한다
		//e.name
		Manager m1 = (Manager)e;
		m1.b();
		System.out.println(m1.name);
	}

}
