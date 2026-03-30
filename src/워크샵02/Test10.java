package 워크샵02;
import java.util.Scanner;
public class Test10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
	
		System.out.println("주소를 입력하시오.");
		String addr = scan.next();
		String[] addrsplit = addr.split(" ");
		
		String city = addrsplit[0];
		String gu = addrsplit[1];
		String dong = addrsplit[2];
		
		System.out.println("도명: "+city);
		System.out.println("시명: "+gu);
		System.out.println("구명: "+dong);

	
		scan.close();
	}

}

