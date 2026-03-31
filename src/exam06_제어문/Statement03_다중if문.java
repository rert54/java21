package exam06_제어문;
import java.util.Scanner; 
public class Statement03_다중if문 {

	public static void main(String[] args) {
//scanner 점수를 입력 받아서 학점을 출력하시오
		/*
		 * 점수     학점
		 * ------------
		 * 90~100	A학점
		 * 80~89	B학점
		 * 70~79	C학점
		 * 60~69	F학점

		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int num = scan.nextInt();
		
		if(num >= 90 ) {
			System.out.println("A학점");
		}else if(num >= 80 ) {
			System.out.println("B학점");
		}else if(num >= 70 ) {
			System.out.println("C학점");
		}else{
			System.out.println("F학점");
		}
	}
}