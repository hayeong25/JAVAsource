package condition;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = scanner.nextInt();
		
		int factorial = 1;
		for (int i = number; i > 0; i--) {
			factorial *= i;
		}
		
		System.out.println(number + "! = " + factorial);
		
		scanner.close();
	}
}