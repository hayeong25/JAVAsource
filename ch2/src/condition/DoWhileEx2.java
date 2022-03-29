package condition;

import java.util.Scanner;

// q가 입력되기 전까지 문자 입력받기

public class DoWhileEx2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("메시지를 입력해주세요. q를 누르면 프로그램이 종료됩니다.");
		String str = ""; // null 값으로 초기화
		// do 안에 str 선언하면 while 조건문에 사용할 수 없기 때문에 반복문 밖에 선언 후 나중에 값 지정
		
		do {
			str = scanner.nextLine(); // scanner.nextInt() : 숫자
			if(str.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
			}
		}while(!str.equals("q")); // str.equals("q")가 false여야 계속 반복된다
		
		scanner.close();
		
	}
}