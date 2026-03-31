package 워크샵03;
import java.util.Scanner;
public class Test09 {

	public static void main(String[] args) {
		//Scanner 클래스를 사용하여 키보드로 세 개의 정수값을 입력 받아서 최대값과 최소값을 구하는 코드 작업. 단, if 문 사용할 것
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 정수의 최대값 구하기");
		System.out.println("A값");
		int n1 = scan.nextInt();
		System.out.println("B값");
		int n2 = scan.nextInt();
		System.out.println("C값");
		int n3 = scan.nextInt();
		int max = 0;
		if(n1>n2) {
			max = n1;
		}else {
			max = n2;
		}
		if(n3>max) {
			max = n3;
		}
		System.out.println("최대값:"+max);
	}

	}


