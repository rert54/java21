package exam21_함수적인터페이스;

import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Supplier;

/*
@FunctionalInterface
public interface Function<T,R>{
   R apply(T t); //public abstract R apply(T t); 동일
} 
*/

public class FuctionTest {

	public static void main(String[] args) {

		//Funciton 인터페이스 사용
		//익명클래스
		
		Function<String,Integer> f = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				
				return t.length();
			}
		}; 
		
		int n = f.apply("Hello");
				System.out.println("Funtion:"+n);
		
		//람다표현식
		Function<String,Integer> f2 = t-> t.length(); //파라미터 하나라 소괄호 생략 실행문 하나라 중괄호 생략, 리턴문 하나라 리턴문 생략
		int n2 = f2.apply("hello");
		System.out.println("Funtion:"+n2);
	
	}
}
