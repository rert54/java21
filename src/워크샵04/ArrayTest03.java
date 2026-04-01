package 워크샵04;

public class ArrayTest03 {

	public static void main(String[] args) {
		//2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성 하시오.
		int[][] arr2 = { 
				{ 5, 5, 5, 5, 5}, 
				{10,10,10,10,10}, 
				{20,20,20,20,20}, 
				{30,30,30,30,30} 
				};
		int sum=0;
		float avg=0;
		float count=0;
		for( int [] i: arr2 ){ // 행 반복
			for( int j : i ){ // 열 반복
				sum += j;
				count++;
		//System.out.println(j); 
				
				}
			}
		
		avg = sum/count; 
		System.out.println(sum);
		System.out.println(avg);
	}
}