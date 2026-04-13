package exam21_함수적인터페이스;

import java.util.function.BinaryOperator;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;


public class PredicaterTest {

	public static void main(String[] args) {
	
		//Predicate 인터페이스 사용
		//정수파라미터 전달받아서 2의배수인지 체크
		//정수파라미터 전달받아서 3의배수인지 체크
		IntPredicate x = n -> n%2 == 0;
		IntPredicate x2 = n -> n%3 == 0;
		
		//1. 전달된 값이 2의 배수이고 3의 배수이냐 ?
		
		IntPredicate x3 = x.and(x2);
		boolean result = x3.test(6);
		System.out.println(result);
	
		//2. 전달된 값이 2의 배수이거나 3의 배수이냐 ?
		
		IntPredicate x4 = x.or(x2);
		boolean result2 = x4.test(6);
		System.out.println(result2);
	
	//2. 전달된 값이 2의 배수가 아니야 ?
		
		IntPredicate x5 = x.negate();
		boolean result3 = x5.test(6);
		System.out.println(result3);
	}
}
