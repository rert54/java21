package exam06_제어문;

public class Statement05_for문4_실습 {

	public static void main(String[] args) {

		//Q:1~20까지 반복하고 짝수 값만 출력시키기
		System.out.println("Q:1~20까지 반복하고 짝수 값만 출력시키기");
			for(int n=1; n<=20; n++) { 
				if(n%2 == 0) {
				System.out.println(n);
				}
			}
			
		//Q2: 1~20까지 반복하고 3배수 값만 출력시키기
			System.out.println("Q2: 1~20까지 반복하고 3배수 값만 출력시키기");	
			for(int n=1; n<=20; n++) { 
				if(n %3 == 0) {
				System.out.println(n);
				}
			}
			//Q-2: 1~20까지 반복하고 3배수중 5의배수 값만 출력시키기
			System.out.println("Q-2: 1~20까지 반복하고 3배수중 5의배수 값만 출력시키기");	
			for(int n=1; n<=20; n++) { 
				if((n %3 == 0) &&(n%5==0)) {
				System.out.println(n);
				}
			}
			
			//Q3:1~20까지 반복하고 총합을 출력시키기
			System.out.println("Q3:1~20까지 반복하고 총합을 출력시키기");
			int sum=0;
			for(int n=1; n<=20; n++) { 
				sum = sum + n; // sum+=n
			
			}		
			System.out.println(sum);

		//Q:1~20까지 반복하고 짝수 값의 총합을 출력시키기
			System.out.println("Q:1~20까지 반복하고 짝수 값의 총합을 출력시키기");
			int sum2=0;
			for(int n=1; n<=20; n++) { 
				if(n%2 == 0) {
				sum2=sum2 +n;	
				}
			}	
			System.out.println(sum2);
		
		
		
		
	}
	
}