package exam07_배열;

public class ArrayTest03_command_line_arguments2 {

	public static void main(String[] args) {

			//실행시 command line argument로 정수값을 하나 입력 받아서 
			// 입력 받은 정수값 만큼 반복해서 hello를 출력하시오
		String s = args[0]; //s에는 받은 문자열이 들어잇음 우리는 3할것
		int num = Integer.parseInt(s); //"3"을 3으로 바꾸어줌
		
		for(int i=1; i<= num;i++) {
			System.out.println("hello:"+i);
		}
			System.out.println("end");
	}
}