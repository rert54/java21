package 워크샵04;

public class ArrayTest01 {

	public static void main(String[] args) {
		//다음 배열의 합과 평균을 구하는 프로그램을 작성 하시오.
		int [] arr = {10,20,30,40,50};
		int sum = 0;
		int avg = 0;
		// 배열을 for문 돌려서 sum에 더하고 avg를 length로 나누기
		for(int x : arr) {
			sum = sum + x;
			
		}
		System.out.println(sum); 
		System.out.println(sum/arr.length); 
		
		
			


	}

}
