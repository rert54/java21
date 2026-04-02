package 워크샵04;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest09 {

	public static void main(String[] args) {
		//다음과 같이 선언되어 있는 배열에 1~10까지의 랜덤한 숫자(중복허용)를 넣고 이 배열에 어떤 값이 셋팅 되었는지 출력 하고 배열 데이터의 합과 평균을 구하는 프로그램을 작성 하시오. 
		int[] arr3 = new int[5];

		Random rand = new Random();
        int sum = 0;

        
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = rand.nextInt(10) + 1;
            System.out.print(arr3[i] + " ");
            sum += arr3[i];
        }

        System.out.println();

       double avg = (double) sum / arr3.length;

        System.out.println("sum=" + sum);
        System.out.println("avg=" + avg);
		

	
	}
}


		

