package exam09_class4_실습;

public class Student {
	
	String name;
	int age;
	String address;
	
	public Student() {}
	
		
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Student(String name, int age) {
		this(name, age, null); // 3번이 없어서 null로 초기화 시켜버림
		//this.name = name;
		//this.age = age;
	}

}

	