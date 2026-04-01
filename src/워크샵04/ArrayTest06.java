package 워크샵04;

import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		//Scanner 클래스를 사용하여 키보드로 키(height)값을 입력 받아서 최대값을 구하는 코드 작업. 입력 받은 사람 수만큼 배열을 생성하여 사용한다.

		Scanner scan = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다\n사람수 :");
		int num = scan.nextInt();
		int [] h;
		h = new int[num];
		for(int i = 0; i < num; i++) {  //배열은 0부터 시작하니간 num수보다 작게 i
			System.out.print("사람 " + (i + 1) + ": ");
            h[i] = scan.nextInt();
		}
		 int max = h[0];
	        for (int i = 1; i < num; i++) {
	            if (h[i] > max) {
	                max = h[i];
	            }
	        }
	        System.out.println("최댓값은 " + max + "입니다.");



	
	}
}


		

