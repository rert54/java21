//default 패키지
//import P1.Myhello;

import P1.Myhello;

public class Myhellotest {
	public static void main(String[] args) {

		//1. import 없이 패키지 직접 지정하는 방법


		P1.Myhello h2 = new P1.Myhello();
		h2.method();
		P1.Myhello h3 = new P1.Myhello();
		h3.method();
		
		//2. import 사용
		Myhello h4 = new Myhello();
		h4.method();
		Myhello h5 = new Myhello();
		h5.method();
		
	}
}
