package exam19_제네릭스;

//임의의 데이터를 저장 할 수 잇는 클래스
class Box2<T>{
	T obj; //박스안에 모든데이터를 담기위함

	public void setValue(T obj) {
		this.obj = obj;
	
	}
	public T getValue() {
		return obj;
	}
}//end Box
	
public class GenericsTest2_제네릭적용 {
	public static void main(String[] args) {

		//Box에 데이터 저장
		//제네릭스 사용안한경우
		Box2 box1 = new Box2();
		box1.setValue("홍길동");
		System.out.println(box1.getValue());
		box1.setValue(10);
		System.out.println(box1.getValue());
		
		//문자열만 저장요구
		Box2(String) Box2 box2 = new Box2<String>();
		box2.setValue("홍길동");
//		box2.setValue(10);
		String s = box2.getValue();
		System.out.println(s+"\t"+s.length());

		//정수만 저장 요구
		Box2<Integer> box3 = new Box2<Integer>();
		box3.setValue(10);
//		box3.setValue("홍길동");
	
		int n = box3.getValue();
		System.out.println(n);
				
	}

}
