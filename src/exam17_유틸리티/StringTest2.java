package exam17_유틸리티;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
		
		//String 클래스의 메서드 정리
		
		String s = "helLo";
		
		int n = s.length();
		System.out.println("1. 문자열 길이:"+n);
		System.out.println("1. 문자열 길이:"+s.length());

		char c = s.charAt(0);
		System.out.println("2. 특정위치의 문자얻기:"+c);
	
		System.out.println("3. 부분열:"+s.substring(1)); //s.substring(1,) s의 문자열 1부터 끝가지
		System.out.println("3. 부분열:"+s.substring(1,4));//s.substring(1,) s의 문자열 1부터 4까지
	
		System.out.println("4. 대문자로 변경:"+s.toUpperCase()); //s의 문자열전체 대문자로 변경
		System.out.println("5. 소문자로 변경:"+s.toLowerCase()); //s의 문자열전체 소문자로 변경
	
		String s2 = "     world     ";
		System.out.println("6.양쪽 공백제거:"+s2.strip()); //s2 공백전체제거
		System.out.println("6.양쪽 공백제거후 길이:"+s2.strip().length()); //s2 공백전체제거 후 길이 메소드 체인이다 .로 연결시킴
		System.out.println("6.왼쪽 공백제거:"+s2.stripLeading()); //s2 좌측공백제거
		System.out.println("6.오른쪽 공백제거:"+s2.stripTrailing()); //s2 우측공백제거
		
		System.out.println("7.문자열 연결:"+(s+"world")); //+연산자
		System.out.println("7.문자열 연결:"+s.concat("world")); //concat 연산자 이용

		String s3 = "helLo";
		System.out.println("8.문자열 포함여부:"+s3.contains("he")); //s3.에 he가 포함되어잇는지 ? boolean 타입으로 결과 출력된다
		System.out.println("8.문자열 포함여부:"+s3.contains("ex")); //s3.에 ex가 포하되어 있는지 ? boolean 타입으로 결과 출력된다
	
		System.out.println("9.문자열 치환:"+s3.replace('h', 'H')); //s3에 h를 H로 치환
		System.out.println("9.문자열 치환:"+s3.replace("Lo", "XY")); //s3에 LO를 XY로 치환

		System.out.println("9.특정문자의 위치:"+s3.indexOf('e')); //s3에서 e가 있는 위치값
		System.out.println("9.특정문자의 위치:"+s3.indexOf('x')); //s3에서 x가 있는 위치값. 없으므로 -1 리턴

		String x = "hello";
		String x2 = new String ("hello");
		String x3 = "hello";
		//x와 x2가 같은 문자열이냐?
		System.out.println("11.문자열비교:"+(x==x2)); //false, ==는 주소값 비교
		System.out.println("11.문자열비교:"+x.equals(x2)); //x와 x2가 같은지 비교 true. 문자열 비교는 이렇게 한다
		System.out.println("11.문자열비교:"+x.equals(x3)); //x와 x3가 같은지 대소문자 엄격하게 비교
		System.out.println("11.문자열비교(대소문자무시):"+x.equalsIgnoreCase(x3)); //x와 x3가 같은지 비교 true. 문자열 비교는 이렇게 한다
	
		//특정 구분자로 분리
		String ss = "홍길동/이순신/유관순";
		String [] names = ss.split("/"); // ss를 구분자로 분리시켜서 배열에 저장한다
		System.out.println("12.구분자로 분리:"+  Arrays.toString(names)); //
		
		//문자열아닌 데이터
		//ex. 10->"10" , 3.15--> "3.14", true --> "true"
		System.out.println("13.비문자열======> 문자열:"+ String.valueOf(10)); //10을"10"로 변환
		System.out.println("13.비문자열======> 문자열:"+ String.valueOf(3.14)); //3.14을"3.14"로 변환
		System.out.println("13.비문자열======> 문자열:"+ String.valueOf(true)); //10을"ture"로 변환
		System.out.println("13.비문자열======> 문자열:"+ String.valueOf(new char[] {'A','B'})); //10을"AB"로 변환
		
		//원본 문자열의 변경 여부
		System.out.println(s); //가공을 해도 원본은 변경되어지지 않는다
	}

}
