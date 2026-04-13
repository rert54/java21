package exam22_StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest5_Optional {

	public static void main(String[] args) {
		//Optional
		List<Integer> list = new ArrayList<Integer>();
		
		//데이터가 존재할때
//		list.add(30);
//		list.add(30);
		
		//int->double
		ToDoubleFunction<Integer> f = new ToDoubleFunction<Integer>() {

			@Override
			public double applyAsDouble(Integer n) {
				// TODO Auto-generated method stub
				return n;
			}
		};
		ToDoubleFunction<Integer> f2 = n->n; 
		//최종코드 아님
		OptionalDouble x = list.stream().mapToDouble(n->n).average();
		System.out.println(x); //값이 비어있어서 OptionalDouble.empty 출력된다
//		System.out.println(x.getAsDouble());//double로 반환
//		System.out.println(x.orElse(0.0));// 디폴트값을 세팅할 수 있다 즉, 오류방지를 위한값 optional에는 전부 존재한다
	
		//최종코드
		double avg = list.stream().mapToDouble(n->n).average().orElse(0.0);
		System.out.println(avg);
		//수n을 실수 n으로 넘겨주고 값이 있으면 평균 없으면 0.0이 나온다
	
	}
}
