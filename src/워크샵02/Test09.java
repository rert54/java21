package 워크샵02;
import java.util.Scanner;
public class Test09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
	
		System.out.println("1. 정수를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("2. 정수를 입력하세요");
		int num2 = scan.nextInt();
		System.out.print("정수 "+num1+" 과 정수 "+num2+" 중에서 최대값: ");
		System.out.println((num1>num2)?num1:num2);
	
		scan.close();
	}

}
