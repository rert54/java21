package 워크샵04;
import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		//다음 배열의 내용을 실행 겨로가와 같이 출력되도록 프로그램을 작성하시오

		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 

		for( int i =0; i < arr.length -1;i++) {
			for (int j = 0; j < arr.length -1; j++) {
				if (arr[j] < arr[j + 1]) { 
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
			}
		
		}
		//System.out.println(Arrays.toString(arr));
		for (int n : arr) {
            System.out.print(n + " ");
		}
	}
}
		

