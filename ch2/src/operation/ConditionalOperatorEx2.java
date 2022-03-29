package operation;

import java.util.Scanner;

public class ConditionalOperatorEx2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int number = scanner.nextInt();
		
		System.out.println(number + "은/는ㅋㅋ " + (number >= 0 ? "양수" : "음수") + "입니다.");
		
		scanner.close();
	}
}