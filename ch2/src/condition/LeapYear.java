package condition;

import java.util.Scanner;

// 윤년 평년 구하기
// 윤년 : 4로 나눈 나머지가 0이고, 연도를 100으로 나눈 나머지가 0이 아니거나 400으로 나눈 나머지가 0인 연도

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연도를 입력해주세요 : ");
		int year = scanner.nextInt();
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "년은 윤년입니다.");
		}else {
			System.out.println(year + "년은 평년입니다.");
		}
		
		scanner.close();
		
	}
}