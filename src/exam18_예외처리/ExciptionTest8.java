package exam18_예외처리;

class Pet{
	public void a() {}
	public void b() throws RuntimeException {}
	public void c() throws RuntimeException {}
	
}

class Cat extends Pet{
	//public void a()throws Exception {} 
	/*
	부모에 throws 없으면 못붙인다. 즉 접근 지정자는 부모보다 확대된 형식 지정 불가능
	 */
	public void b()throws ArithmeticException {} 
	/*
	 //같거나 자식은 가능하기에 RuntimeException과 같은 ArithmeticException된다
	 */
	
	//public void c()throws IOException {} //같은 계열만 가능하다

public class ExciptionTest8 {

	public static void main(String[] args) {
		
	}//end main
}
