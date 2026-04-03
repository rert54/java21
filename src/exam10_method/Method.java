package exam10_method;

public class Method {
	
	//1.파라미터 없고 리턴값 없는경우
		public void method() {
		System.out.println("method");
		}
		
		//2.파라미터 있고 리턴값 없는 경우 setter 메소드
		public void method2(int m, String s) {
		System.out.println("method2"+n+s);
		}
		
		//3.파라미터 없고 리턴값 있는경우 getter 메소드
		public int method3() {
		System.out.println("method3");
		return 100;
		}

		//4.파라미터 있고 리턴값 잇는 경우
		public int method4(int n, int n2) {
		System.out.println("method4"+n+n2);
		return n +n2;
		}
		
	}
