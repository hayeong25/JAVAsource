package condition;

import java.util.Scanner;

// 삼항 연산자는 if else문으로 변경 가능

public class IfEx3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int number = scanner.nextInt();
		
		if(number >= 0) {
			System.out.println(number + "은/는 양수입니다.");
		}else {
			System.out.println(number + "은/는 음수입니다.");
		}
		
		scanner.close();
	}
}