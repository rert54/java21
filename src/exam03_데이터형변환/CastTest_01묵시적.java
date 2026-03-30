package exam03_데이터형변환;

public class CastTest_01묵시적 {

	public static void main(String[] args) {

			short s = 10;
			short s2 = 20;
			short s3 = (short)(s+s2); //(short)s+s2 면 s만 short로 변환이라 에러뜸
			System.out.println(s3);

	}

}
