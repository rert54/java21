package exam01_변수;

public class ConstantTest {

	public static void main(String[] args) {
		// TODO Auto-gene
		final int NUM = 30;
		
		System.out.println(NUM);
		
		NUM = 40; // 에러, 값 변경 불가

		int size = 30;
		
		size = 40;
		
	}

}
