package 워크샵03;

public class Test04 {

	public static void main(String[] args) {
	//Q두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오

		for(int num1 = 1; num1 <6; num1++)
			for(int num2 = 1; num2<6; num2++)
				if(num1 + num2 == 6)
					System.out.println(num1 + "+" + num2 + "=6");
				
			
			
}
}