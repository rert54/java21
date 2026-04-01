package 워크샵03;
import java.util.Scanner;
public class Test10 {

	public static void main(String[] args) {
		//Scanner 클래스를 사용하여 키보드로 정수값을 입력받아 1부터 입력 받은 정수값까지의 총합을 구하는 실습
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 n까지 총합구하기,정수를 입력하세요");

		while(true) {
			System.out.print("n 값:");
			int n = scan.nextInt();
			if(n>0) {
				int sum = 0;
				for(int i = 1;i<=n;i++) {
					sum += i;
				}System.out.println("1부터"+n+"까지의 총합: "+ sum);
					
				
				break;
			} else {
			System.out.println("재입력하세요");
			}

		
		}

	}
	}
