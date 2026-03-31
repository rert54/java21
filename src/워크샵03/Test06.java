package 워크샵03;

public class Test06 {

	public static void main(String[] args) {
		//세 개의 주사위를 던졌을 때, 눈의 곱이 3의 배수인 값을 출력하는 프로그램을 작성하시오
		for(int num1 = 1; num1 <=6; num1++)
			for(int num2 = 1; num2<=6; num2++)
				for(int num3 = 1; num3<=6; num3++) {
					if((num1 * num2 * num3)%3 == 0)
						

					System.out.println(num1 + "*" + num2 + "*" + num3+ "=" + (num1 * num2 * num3));

	}

}
}