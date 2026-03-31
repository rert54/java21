package 워크샵03;
import java.util.Scanner;
public class Test07 {

	public static void main(String[] args) {
		//1부터 100까지 더하는 프로그램을 작성 한다. 단, Scanner로 1자리 정수형 데이터를 입력 받아 입력 받은 수의 배수만 더한다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("한 자리 정수값을 입력하시오");
		int num = scan.nextInt();
		int sum = 0;

		for(int i = num;i <= 100; i+= num ) {
			System.out.print(i);
				sum +=i;
				if(i + num <= 100){
			System.out.print("+");
				}
		}
		System.out.println("="+ sum);
	}

	}


