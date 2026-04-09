package 워크샵07_app1;

public class Calculator {
	public double plus(int a,int b) {
		double result = (double) a + b;
		System.out.println("결과: " + result);
		return result;
	}
	public double minus(int a,int b) {
        double result = (double) a - b;
        System.out.println("결과: " + result);
        return result;		
	}
	public double	multiplication(int a,int b) {
        double result = (double) a * b;
        System.out.println("결과: " + result);
        return result;
	}
	public double divide(int a,int b) {
		double result = 0.0;
		try {
			result = (double) a / b;
            System.out.println("결과: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Exception 이 발생 하였습니다. 다시 입력해 주세요");
            System.out.println("결과: " + result);
		}
		 return result;
	}
}
