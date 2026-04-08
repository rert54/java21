package exam14_인터페이스;

public interface MyserviceTest {
	 public static void main(String[] args) {
		 //Myservice s = new Myservice(); //객체생성 불가
		 MyserviceImpl s2 = new MyserviceImpl();
			 System.out.println(s2.NUM);
		 s2.a();
		 s2.b();
		 s2.c();
		 Myservice.d();
		 System.out.println(MyserviceImpl.NUM);
		 System.out.println(MyserviceImpl.SIZE);
	 }
	

}
