package exam14_인터페이스;

public class MyserviceImpl extends Myclass implements Myservice,Myservice2{ //implements 가 뒤로

	@Override
	public void a() {
		System.out.println("a()");
		
	}

	@Override
	public void b() {
		System.out.println("b()");
	}

	@Override
	public void x() {
		System.out.println("x()");
	}
	

}
