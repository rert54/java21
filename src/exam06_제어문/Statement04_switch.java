package exam06_제어문;

public class Statement04_switch {

	public static void main(String[] args) {

		int num = 10;
		
		switch(num) {
		
		case 5: System.out.println("5"); 
		case 10: System.out.println("10");
		case 15: System.out.println("15");
		case 20: System.out.println("20");
		default: System.out.println("default");
		}//end switch
		
		String name = "A";
		
		switch(name) {
		
		case "A": System.out.println("5"); 
		case "B": System.out.println("10");
		case "C": System.out.println("15");
		case "D": System.out.println("20");
		default: System.out.println("default");
		}//end switch
		
		char num2 = 'G';
		
		switch(num2) {
		
		case 'g': System.out.println("5"); 
		case 'd': System.out.println("10");
		case 'a': System.out.println("15");
		case 'f': System.out.println("20");
		default: System.out.println("default");
		}//end switch
		
	}
}