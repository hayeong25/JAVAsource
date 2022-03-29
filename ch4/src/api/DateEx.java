package api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		Date date1 = new Date();
		System.out.println(date1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(date1));
		
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		LocalDateTime date3 = LocalDateTime.now();
		System.out.println(date3);
		
		Calendar today = Calendar.getInstance();
		System.out.println("올해는 " + today.get(Calendar.YEAR) + "년");
		System.out.println("이번 달은 " + (today.get(Calendar.MONTH) + 1) + "월"); // Calendar : 0월 ~ 11월
		System.out.println("오늘은 이 달의 " + today.get(Calendar.WEEK_OF_MONTH) + "째 주");
		System.out.println("현재는 " + today.get(Calendar.HOUR) + "시");
		
	}
}