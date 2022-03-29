package condition;

import java.util.Scanner;

// 사용자로부터 근무시간 입력받아 8시간까지는 9800원, 8시간 초과는 급여의 1.5배 지급하는 프로그램 작성

public class PayOfHours {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("근무시간을 입력해주세요 : ");
		int time = scanner.nextInt();
		
		if(time <= 8) {
			System.out.println("오늘 급여는 " + (time * 9800) + "원입니다.");
		}else {
			System.out.println("오늘 급여는 " + (int)((8 * 9800) + ((time - 8) * 9800 * 1.5)) + "원입니다.");
		}
		
		scanner.close();
		
	}
}