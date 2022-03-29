package condition;

import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.println(number + "은 짝수입니다.");
		}else {
			System.out.println(number + "은 홀수입니다.");
		}
		
		scanner.close();
	}
}