package exam10_method4_call_by;

//Cat 클래스
class Cat{
	String name;
	int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
}//end Cat

public class TestCat {
	
		
		
	// call by value: 인자값이 기본형
	public static void pdt(int n) {  // static 지정하면 객체생성없이 메서드 호출가능
		n = 20;
	}
	// call by value reference : 인자값이 참조형
	public static void rdt(Cat c) {
		c.age = 20;
	}
	public static void main(String[] args) {
		
		// call by value reference 실습
		Cat c = new Cat("야옹이", 2);
		System.out.println("변경 전 나이 :" + c.age );
		rdt(c); //참조형(배열과 class) 값의 주소가 전달됨 즐 rdt c에 야옹이 2의 주소가 전달됨
		//메서드 호출해서 수정하고 돌아올떄 로컬 변수는 사라진다 이경우 main 에 있는 c
		System.out.println("변경 후 나이 :" + c.age );
		
		
		//call by value 실습 
		int num =  10;
		System.out.println("변경 전:" + num );
		pdt(num);  //값이 복사가됨 pdt에 10이 복사가 되서 올라감. 이후 pdt에서 수정을 보아도 내가 가진 num=10은 변경되지않음 
		//메서드 호출해서 수정하고 돌아올떄 로컬 변수는 사라진다 이경우 pdt에 있는 n
		
		System.out.println("변경 후:" + num );

		//최종 참조가 없이게 stack이 전부 비워지고 heap도 사라진다	}
}