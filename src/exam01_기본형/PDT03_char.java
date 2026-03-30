package exam01_기본형;

public class PDT03_char {

	public static void main(String[] args) {
		System.out.println('남');
		System.out.println('여');
		System.out.println("남자");
		System.out.println("여자남");
		//System.out.println('남자'); 여러글자는 ""해야한다, string 클래스가 관리한다 이건 돌리면 에러나옴
		
		System.out.println("=============================");
		// escape 문자
		System.out.println("안녕하세요\n");
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		System.out.println("안녕\"하세요");
		System.out.println("안녕\'하세요");
		System.out.println("안녕\\하세요");
			// \\<- 경로설정시 주로사용 ex. c:\\temp ==> c:\temp
		System.out.println("c:\\amp");
		System.out.print('\t');
		System.out.print("asdssdda");
		
	}

}
