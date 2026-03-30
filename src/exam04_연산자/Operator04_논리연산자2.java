package exam04_연산자;

public class Operator04_논리연산자2 {

	public static void main(String[] args) {
		
		//전치 연산자가 변수명 앞에 연산자가 있어서 전치다
		int n = 10;
		++n; //n=n+1 동일, n+1 동일
		System.out.println(n);
		
		--n; //n=n-1 동일, n-=1 동일
		System.out.println(n);
		
		//후치 연산자가 변수명 뒤에 연산자가 있어서 전치다
		int n2 = 10;
		n2++; //n=n+1 동일, n+1 동일
		System.out.println(n2);
	
		n2--; //n=n-1 동일, n-=1 동일
		System.out.println(n2);
	
		
		
		
	}

}
