package exam06_제어문;

public class Statement09_continue {

	public static void main(String[] args) {


		for(int n=1; n<=5; n++){

			System.out.println("hello"+n);
			if(n==3)continue; //반복분 끝으로 간다
			System.out.println("wolrd"+n);
			System.out.println("happy"+n);
			}
			System.out.println("end");

	}
}