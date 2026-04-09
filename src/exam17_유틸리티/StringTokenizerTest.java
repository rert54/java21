package exam17_유틸리티;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {

		String s = "홍길동 이순신 유관순";
		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.nextToken());//토큰의 수를 알때만 nextToken을 사용한다
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	
		String s2 = "홍길동/이순신/유관순/강감찬";
		StringTokenizer st2 = new StringTokenizer(s2,"/");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());//토큰의 수를 모를때 
		}
		
		//구분자를 여러개 사용 가능
		String s3 = "영조,홍길동/이순신/유관순:강감찬,정소";
		StringTokenizer st3 = new StringTokenizer(s3,"/,:");
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());//토큰의 수를 모를때 
		}
	
	}

}
