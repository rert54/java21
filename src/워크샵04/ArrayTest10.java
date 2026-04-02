package 워크샵04;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest10 {

	public static void main(String[] args) {

   
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
            System.out.println("숫자를 확인 하세요");
            return;
        }

      
        if (row < 1 || row > 5 || col < 1 || col > 5) {
            System.out.println("숫자를 확인 하세요");
            return;
        }


        int[][] arr = new int[row][col];
        Random rand = new Random();

        int sum = 0;


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = rand.nextInt(5) + 1; // 1~5
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }


        double avg = (double) sum / (row * col);

        System.out.println("총합=" + sum);
        System.out.println("평균=" + avg);
	}
}


		

