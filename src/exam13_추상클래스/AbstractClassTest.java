package exam13_추상클래스;

public class AbstractClassTest {
		public static void main(String[] args) {
			//AbstractClass a = new AbstractClass() ;
			
			AbstractClass a = new AbstractChildCalss();
			System.out.println(a.num);
			a.a();
			a.b();
			a.c();
		}

}
