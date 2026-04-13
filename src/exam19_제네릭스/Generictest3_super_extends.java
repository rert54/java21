package exam19_제네릭스;

import java.util.ArrayList;
import java.util.List;

class Pet{}
class Cat extends Pet{}
class Dog extends Pet{}

public class Generictest3_super_extends {

	public static void main(String[] args) {
/*
 * <?superT>
 * <?extends T>
 */
		List<Cat> list = new ArrayList<Cat>();
		list.add(new Cat());
		list.add(new Cat());
	
		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog());
		list2.add(new Dog());
		
		List<Pet> list3 = new ArrayList<Pet>();
		list3.add(new Pet());
		list3.add(new Pet());
		
		List<String> list4 = new ArrayList<String>();
		list4.add("aaa");
		
		printData(list); //Cat
		printData(list2); //Dog
		printData(list3); //Pet
		printData(list4); //String
	
		printData2(list);  // Cat
		printData2(list2); // Dog
		printData2(list3); // Pet
		printData2(list4); // String
		
		printData3(list);  // Cat
		printData3(list2); // Dog
		printData3(list3); // Pet
		printData3(list4); // String
	}

	//메서드1 : 전달하는 데이터 타입 및 부모타입만 가능하도록
	public static void printData(List list) { //부모에서 가져오니간 super 그중 dog만 받아옴
		System.out.println(list);
		}
	//메서드2 : 전달하는 데이터타입(Dog) 및 부모타입(Pet)만 가능하도록
	public static void printData2(List<? super Dog> list) { //전달되는 Dog과 그 부모만 가능하다(super) <? super
		System.out.println(list);
		}
		//메서드3 : 전달하는 데이터 타입(Pet) 및 자식타입(Cat, Dog)만 가능하도록
		public static void printData3(List<? extends Pet> list) { //Pet을 연결 해둬서 그아래 전부 사용 가능하게
			System.out.println(list);
	
			//<? super T>, <?extend T>
		
		}
}
