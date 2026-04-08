package exam17_유틸리티;

import java.util.Arrays;

public class DateTest {

	public static void main(String[] args) {
		
		//StringBuilder 클래스의 메서드 정리
			StringBuilder sb = new StringBuilder("helLo");
					
			System.out.println("1. 값출력:"+ sb);
			System.out.println("1. 값출력:"+ sb.toString());
			
			System.out.println("2. 값 추가:"+ sb.append("world"));
			System.out.println("2. 값 추가:"+ sb.append(100));
			System.out.println("2. 값 추가:"+ sb.append(true));
			System.out.println("2. 값 추가:"+ sb.append('X'));
			
			//중간 삽입
			System.out.println("3. 값 삽입:"+ sb.insert(0, "홍길동"));//sb의 0번 자리에 "홍길동"삽입

			//삭제
			System.out.println("4. 값 삭제:"+ sb.deleteCharAt(0));//sb의 0번 자리 삭제
			System.out.println("4. 값 삭제:"+ sb.delete(0,3));//sb의 0~3 자리 삭제
			
			System.out.println("5. 값 삭제:"+ sb.delete(0,3));//sb의 0~3 자리 삭제
			
			//String에서도 제공된 메서드
			System.out.println("6. 길이:"+ sb.length());
			System.out.println("7. 특정문자 얻기:"+ sb.charAt(0));
			System.out.println("8. 부분열:"+ sb.substring(3));//3번 자리부터 마지막까지
			System.out.println("8. 부분열:"+ sb.substring(3,6));//3번부터 6번자리 까지
			
			String s = sb.toString(); //StringBuilder 사용후 마지막엔 String에 저장해주어야한다
			System.out.println("최종사용:"+s);
	}

}
