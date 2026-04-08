package exam15_익명클래스;

public class TestMain {

	public static void main(String[] args) {

		Flyer f = new Bird();
		f.fly();
		
		//다형성 적용하 ㄴ익명 클래스
		Flyer f2 = new Flyer() {
			@Override
			public void fly() {
				System.out.println("익명클래스.fly()");
			}
			@Override
			public void land() {
				System.out.println("익명클래스.land()");
			}
			
		};
		f2.fly();
		f2.land();
		
	}

}
