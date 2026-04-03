package exam11_static2;

public class Dog {
	
	private String name;
	private int age;
	private String gender;
	
	public Dog() {}
	/*
	public Cat(String name, int age, String gender) {
		this.name = name;
		//age 검증
		if(age >= 20) {
			System.out.println("나이 입력 오류발생");
		}else {
			this.age = age;
		}
	
		this.gender = gender;
	}
	*/
	public Dog(String name, int age, String gender) {
		this.name = name;
		//age 검증
		if(ValidClass.ageValidCheck(age)) {
			System.out.println("나이 입력 오류발생");
		}else {
			this.age = age;
		}
	
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//age 검증
		if(ValidClass.ageValidCheck(age)) {
			System.out.println("나이 수정 오류발생");
		}else {
			this.age = age;
		}
	
		
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
//필요시 메서드 추가
//age 검증하는 메서드
	/*private public boolean ageValidCheck(int age) { //private로 주었기때문에 이 메소드는 여기 클래스에서만 사용한다 필요한것만 다른데 보내기위함
		boolean result = false;
		//조건체크
		if(age >= 20)result=true;
		return result;
		
		}*/
		/*
		public boolean ageValidcheck(int age) {
			boolean result = false;
			//조건체크
			if(age >= 20);{
				return true;
			}
			}else {
				return false;
			}
				*/ //이것도 사용가능하나 비추천 리턴을 늘릴 필요가 없다
	
	
	

	
	
}
