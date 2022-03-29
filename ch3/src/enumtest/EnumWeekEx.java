package enumtest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumWeekEx {
	public static void main(String[] args) {
		
		Week today = null; // today 변수 안에는 MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY만 들어있음
		
		// 오늘 날짜
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		// 요일에 따른 숫자 return - 월요일(1) ~ 일요일(7)
		DayOfWeek week = now.getDayOfWeek();
		
		switch (week.getValue()) {
		case 1:
			today = Week.MONDAY;
			break;
		case 2:
			today = Week.TUESDAY;
			break;
		case 3:
			today = Week.WEDNESDAY;
			break;
		case 4:
			today = Week.THURSDAY;
			break;
		case 5:
			today = Week.FRIDAY;
			break;
		case 6:
			today = Week.SATURDAY;
			break;
		case 7:
			today = Week.SUNDAY;
			break;
		}
		
		System.out.println("오늘은 " + today + "입니다.");
	}
}