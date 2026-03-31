package exam06_제어문;

public class Statement04_switch2 {

	public static void main(String[] args) {

		int num = 100;
		
		switch(num) {
		
		case 5: {
			int n =200;
			System.out.println("5"); 
		}
		case 10: {
			int n = 400;
			System.out.println("10");
		}
		case 15: System.out.println("15");
		case 20: System.out.println("20");
		default: System.out.println("default");
		}//end switch
		System.out.println("---------------------------");
		//switch expression
		int n = 10;
		int result = switch(n) {
		case 10->100;
		case 20->200;
		default -> 0;
		};
		System.out.println(result);
	}
}