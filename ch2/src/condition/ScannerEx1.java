package condition;

import java.util.Scanner;

// 두 수를 입력받아 합 구하기

public class ScannerEx1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력해주세요 : ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 : ");
		int num2 = scanner.nextInt();
		
		System.out.printf("%d + %d = %d입니다.", num1, num2, (num1 + num2));
		
		scanner.close();
		
	}
}