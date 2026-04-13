package exam22_StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4_최종처리2 {

	public static void main(String[] args) {

		//배열
		Student3 [] stuArr = { new Student3("홍길동", 100),
				new Student3("홍길동", 90),
				new Student3("이순신", 90),
				new Student3("유관순", 50),
				new Student3("강감찬", 70),
				new Student3("정조", 95),
				new Student3("선덕여왕", 45) };
		
		//출력
	   Stream.of(stuArr) // Arrays.stream(stuArr) 와 동일
	         .forEach(System.out::println);
		
	   
	   // 이름만 추출해서 List로 반환
	   Function<Student3, String> f3 = Student3::getName;
	   Stream<String> stream = Stream.of(stuArr).map(f3);
	   // stream.collect(Collector) <== Collector 변수 = Collectors.메서드
	   List<String> listNames = stream.collect(Collectors.toList());
	   System.out.println("이름만 추출해서 List로 반환:" + listNames);
		
		Set<String> setNames = Stream.of(stuArr)
									.map(f3)
									.collect(Collectors.toSet());
		System.out.println("이름만 추출해서 Set로 반환:" + setNames);
		
		//3. 최종처리 - 갯수
		long count = Stream.of(stuArr).collect(Collectors.counting());
		System.out.println("갯수" + count);
		//4. 전체합계
		long sum = Stream.of(stuArr).collect(Collectors.summingInt(Student3::getGrade));
		System.out.println("갯수" + sum);
		//5.최대값
		Optional<Student3> max = Stream.of(stuArr)
				.collect(Collectors.maxBy(Comparator.comparing(Student3::getGrade)));
		Student3 maxStud = max.get();
		System.out.println("최대값" + maxStud);
		//5.최소값
		Optional<Student3> min = Stream.of(stuArr)
				.collect(Collectors.maxBy(Comparator.comparing(Student3::getGrade)));
		Student3 minStud = min.get();
		System.out.println("최소값" + minStud);
	}
		
}
class Student3{
	String name; //이름
	int grade;   //점수
	public Student3() {}
	public Student3(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
}
