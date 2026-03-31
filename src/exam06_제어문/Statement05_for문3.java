package exam06_제어문;

public class Statement05_for문3 {

	public static void main(String[] args) {

//hello 문자열 5번 출력
		
		for(int n=1; n>4; n++) { //조건을 잘못 지정하여 한번도 실행되어지지 않음
			System.out.println("Hello"+n);
		}

		for(int n=0; ; n++) {//for문이 빠저나올곳이 없어서 무한 루프 발생
			System.out.println("hi"+n);
		}

	
	}
	
}