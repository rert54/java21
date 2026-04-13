package exam21_함수적인터페이스;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/*

@FunctionalInterface
public interface BinaryOperator<T>{
   T apply(T t, T t2);  // public abstract T apply() 동일
}
*/

public class OperatorTest {
	public static void main(String[] args) {

		//Operator 인터페이스 사용
		//익명클래스
		BinaryOperator<String> x = new BinaryOperator<String>() {
			@Override
			public String apply(String t, String u) {
				return t+u;
			}
		};
		String s = x.apply("hello", "world");
		System.out.println(s);
	
		//람다표현식
		BinaryOperator<String> x2 = ( t,  u)->t+u;
		String s2 = x2.apply("hello", "world");
		System.out.println(s2);
	
		IntUnaryOperator x3 = new IntUnaryOperator() {
			@Override
			public int applyAsInt(int x) {
				return x+100;
			}
		}; 
		int n = x3.applyAsInt(100);
		System.out.println(n);
		
		//람다표현식
		IntUnaryOperator x4 = y-> y+100;
		int n2 = x4.applyAsInt(100);
		System.out.println(n2);
	}
}