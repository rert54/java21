package 워크샵04;

public class ArrayTest02 {

	public static void main(String[] args) {
		//다음 배열의 짝수 번째 정수의합을 구하는 프로그램을 작성하시오.
		int[] arr =  {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int sum= 0;
		for(int i=1; i < arr.length;i+=2) {
			sum += arr[i];
			}
		System.out.println("sum="+sum);


	}

}
