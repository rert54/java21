package exam13_추상클래스;

public class AbstractChildCalss extends AbstractClass{

	@Override
	public void b() {
		System.out.println(num);
	}

	@Override
	public void c() {
		a();
	}

}
