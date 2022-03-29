package condition;

import java.util.Scanner;

// scanner.next()와 scanner.nextLine()의 차이
// Integer.parseInt()

public class ScannerEx2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력해주세요 : ");
		// Integer.parseInt("35"); >> String "35"를 Int 35로 변환
		int num1 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("두 번째 정수를 입력해주세요 : ");
		int num2 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("연산자(+, -, *, /, %)를 입력해주세요 : ");
		String op = scanner.nextLine();
		// nextLine()은 엔터까지 포함되어 연산 오류가 날 수 있다
		
		int result = 0;
		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 + num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		}
		
		System.out.printf("%d %s %d = %d", num1, op, num2, result);
		scanner.close();
		
	}
}