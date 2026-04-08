package exam15_익명클래스;

public class Bird implements Flyer {

	@Override
	public void fly() {
		System.out.println("bird.fly()");
	}
	@Override
	public void land() {
		System.out.println("bird.land()");
	}
	
}
