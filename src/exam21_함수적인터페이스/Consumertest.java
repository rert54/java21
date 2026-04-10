package exam21_함수적인터페이스;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjDoubleConsumer;

public class Consumertest {
/*
 @FunctionalInterface
public interface Consumer<T>{
   void accept(T t); // public abstract void accept(T t);
}
 */
	
	/*
@FunctionalInterface
interface Flyer2{
	public abstract void fly(int n);
}
	 */
	public static void main(String[] args) {
		
		//consumer 인터페이스 사용
		
		//익명클래스
		Consumer<String> c = new Consumer<String>() { //new 다음 컨트롤+스페이스하면 재정의 해준다
			
			@Override
			public void accept(String s) {
				System.out.println("Consumer:"+s);
			}
		};
		c.accept("Hello");
	
		//람다표현식
		Consumer<String> c2 = s-> System.out.println("람다.Consumer:"+s);
				//데이터 타입생략가능 하나라서 소괄호 생략가능 실행문장 하나라 중괄호 생략가능
		c2.accept("Hello2");
		
		//Biconsumer:파라미터 두개(T,U) 인터페이스 사용
		//익명클래스
		BiConsumer<String, Integer> c3 = new BiConsumer<String, Integer>() {
			@Override
			public void accept(String s, Integer n) {
				System.out.println("BiConsumer:" + s +"\t" + n);
			}
		};
		
		
		c3.accept("홍길동", 10);

		//람다표현식
		BiConsumer<String,Integer> c4 = (s,n) -> System.out.println("Biconsumer:"+s+"\t"+n);
		c4.accept("홍길동", 10);
		
		//익명클래스
		ObjDoubleConsumer<Float> c5 = new ObjDoubleConsumer<Float>() {
			
			@Override
			public void accept(Float t, double value) {
				System.out.println("ObjDoubleConsumer:"+f+"\t"+d);
			}
		};
		c5.accept(3.14f,3.14D);
		//람다표현식
		BiConsumer<Float,Double> c6 = (f,d) -> System.out.println("ObjDoubleConsumer:"+f+"\t"+d);
		c6.accept(3.14f, 3.14d);
	}
}
