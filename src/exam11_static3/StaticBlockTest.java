package exam11_static3;

public class StaticBlockTest {
//static 블럭
	static {
		//순차문, 제어문 사용 가능, 필요시 하나로 여러번 사용 가능
		int num = 10;
		System.out.println(num);
}
	static {
		System.out.println("static 블럭");
	}
	public static void main(String[] args) {
		
	
	}
}
