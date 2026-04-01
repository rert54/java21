package 워크샵04;

import java.util.Arrays;

public class ArrayTest08 {

	public static void main(String[] args) {
		//다음과 같이 제공된 배열에서 최대값과 최소값을 구하는 코드 작성. 
		int [] score= {99,34,67,22,11,9}; 

	
		 int max = score[0];
	        for (int i = 1; i < score.length; i++) {
	            if (score[i] > max) {
	                max = score[i];
	            }
	        }
	        System.out.println("최댓값:" + max );
			Arrays.sort(score);
			System.out.println("최소값:"+score[0]);


	
	}
}


		

