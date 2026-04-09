package exam17_유틸리티;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar car = Calendar.getInstance();//싱글톤디자인 패턴
		
		//현재 날자 출력
		System.out.println("년도" + car.get(Calendar.YEAR));
		System.out.println("월" + (car.get(Calendar.MONTH)+1));
		System.out.println("일" + car.get(Calendar.DAY_OF_MONTH));
		System.out.println("시" + car.get(Calendar.HOUR_OF_DAY));
		System.out.println("분" + car.get(Calendar.MINUTE));
		System.out.println("초" + car.get(Calendar.SECOND));

		//측정날짜 설정
		Calendar car2 = Calendar.getInstance();
		car2.set(2030,0,12);
		System.out.println("년도" + car2.get(Calendar.YEAR));
		System.out.println("월" + (car2.get(Calendar.MONTH)+1));
		System.out.println("일" + car2.get(Calendar.DAY_OF_MONTH));

	
	
	
	}

}
