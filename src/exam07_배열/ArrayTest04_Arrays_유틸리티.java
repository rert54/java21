package exam07_배열;

import java.util.Arrays;


public class ArrayTest04_Arrays_유틸리티 {

	public static void main(String[] args) {

		//1. 배열을 문자열로 모두 출력
		//문법: Arrays.toString(배열);
		int [] num = {10,20,30};
		String s = Arrays.toString(num);//"[10,20,30]"
		
		System.out.println(Arrays.toString(num));////"[10,20,30]"
	
		//2. 배열을 오름차순 정렬
		//문법:Arrays.sort(배열)
		int[] num2 = {8,3,10,20,30,1};
		Arrays.sort(num2);
		System.out.println(Arrays.toString(num2));
	
		//3. 배열을 특정값으로 채우기
		//문법:Arrays.fill(배열, 변경할값);
		String [] name = {"a","b","c","d","2","e","f"};
		Arrays.fill(name,"X");
		System.out.println(Arrays.toString(name));
	
		//4.배열을 일부분을 특정값으로 채우기
		//문법 : Arrays.fill(배열,시작위치,끝위치, 변경할값); 자바에서는 끝위치 지정시 끝은 포함이 안된다
		String [] name2 = {"a","b","c","d","2","e","f"};
		Arrays.fill(name2,0,3,"X");// 0~3 까지 범위를 지정 0 1 2 가 범위다
		System.out.println(Arrays.toString(name2));
		
		
		//5.배열에서 특정요소의 위치값(index)값 찾기
		//Arrays.binarySearch(배열,찾을값)
		int[] num3 = {8,3,10,20,30,1};
		//정렬 필수
		Arrays.sort(num3);//정렬
		System.out.println(Arrays.toString(num3));
		int indx = Arrays.binarySearch(num3, 8); // num3 배열에서 8이 있는 위치를 반환해줌
		System.out.println(indx);

		
		
		//6. 배열비교
		//문법:Arrays.equals(배열1, 배열2);
		int [] x = {8,3,10,20,30,1};
		int [] x2 = {8,3,10,20,30,1};
		boolean result = Arrays.equals(x, x2);
		System.out.println(result);
		
		//7.배열크기 변경 ( 기존 배열 크기변경은 불가, 새로운 배열을 만들어서 기본 배열값을 복사해서 사용
		//문법: 새로운 배열 = Arrays.copyOf(기존배열, 크기
		int[] num4 = {8,3}; //local 변수 stack에 num4가 자리 잡음 heap에 {8,3}이 들어가있음
		System.out.println(Arrays.toString(num4)); //[8, 3]
		int[] newArr = Arrays.copyOf(num4, 5); // local에 newArr울 stack에 생성 heap에 5개짜리 배열을 만들고83000을 만들고 newArr에 할당함 
		System.out.println(Arrays.toString(newArr)); //[8, 3, 0, 0, 0]
		num4 = newArr;
		System.out.println(Arrays.toString(num4)); //[8, 3, 0, 0, 0]으로 하고싶어서 num4=newArr을 할당시킴. 이름 8,3 이들어있는 기존 배열은 가르키는게 없어서 시스템이 삭제한다
	}
}
