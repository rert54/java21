package exam10_method3;

public class TestCat {

	public static void main(String[] args) {
		
		//야옹이 2 암컷
		Cat c = new Cat("야옹이",2,"암컷")
				
		// c.name="망치"; //접근불가
		c.setName("망치");
		c.setAge(3);
		c.
		c.setGender("수컷");
		
		//조회역할
		Spring name = c.getName();
		int age = c.getAge();
		String gender = c.getGender();
		System.out.printf("이름:%s 나이:%d 성별:%s",name,age,gender));
	}

}
