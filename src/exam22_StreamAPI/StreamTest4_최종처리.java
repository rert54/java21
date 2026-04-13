package exam22_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest4_최종처리 {

	public static void main(String[] args) {
			
		//최종처리 - 갯수
		List<Integer> list = Arrays.asList(5,10,42,57,2,1);
		
		//1.갯수
		long count = list.stream() //리턴타입은 Stream<Integer>
						.count();
		long count2 = list.stream()
				.filter(n->n%2==0) //정렬등 가공 전부 가능하다
				.count();
		System.out.println("count:"+count2);
		
		//2.최대값 Optional Max
		int max = Arrays.stream(new int[] {5,10,42,57,2,1}) //리턴타입은 IntStream
				.max() //optionalInt반환하기에 getasInt필요
				.getAsInt();
		System.out.println("max: "+max);
		
		//3.최소값
		int min = Arrays.stream(new int[] {5,10,42,57,2,1}) //리턴타입은 IntStream
		.min() //optionalInt반환 하기에 getasInt필요
		.getAsInt();
		
		//3.총합
		int sum = Arrays.stream(new int[] {5,10,42,57,2,1}) //리턴타입은 IntStream
				.sum(); // int로 반환
		System.out.println("sum: "+sum);
		
	
		
		
		
	
	}
}
