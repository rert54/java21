package exam06_제어문;

public class Statement10_중첩반복문 {

	public static void main(String[] args) {

for(int dan=2; dan <=9; dan++) {
	for(int n = 1; n <= 9; n++) {
		System.out.printf("%d * %d = %d \n", dan, n, (dan*n));
	}
}

	}
}