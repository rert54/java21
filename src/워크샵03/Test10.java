package 워크샵03;
import java.util.Scanner;
public class Test10 {

	public static void main(String[] args) {
		 /*
		  * 1) eclipse Argument 에서 1~5까지의 두 개의 정수형 데이터를 입력 받는다. 
2) 입력 받은 데이터가 2개 미만 또는 2개 초과로 입력 하면 “다시 입력 하세요” 출력 
3) 1~5이외의 숫자가 입력 될 경우 “숫자를 확인 하세요” 출력 
4) 입력 받은 두 개의 정수를 이용하여 2차원 배열을 생성한다. 
5) 2차원 배열에 1~5까지의 랜덤한 숫자(중복허용)를 넣는다. 
6) 배열의 내용을 출력 한다. 
7) 배열의 총합과 평균을 실수형으로 출력 한다.

*/
	
        if (args.length != 2) {
            System.out.println("다시 입력 하세요");
            return;
        }

        int row = 0;
        int col = 0;

        try {
            row = Integer.parseInt(args[0]);
            col = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력 하세요");
            return;
        }

      
        if (row < 1 || row > 5 || col < 1 || col > 5) {
            System.out.println("숫자를 확인 하세요");
            return;
        }

        
        int[][] arr = new int[row][col];

        double sum = 0;

      
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (int)(Math.random() * 5) + 1;
                sum += arr[i][j];
            }
        }

    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

      
        double avg = sum / (row * col);

        System.out.println("sum=" + sum);
        System.out.println("avg=" + avg);
    }
}