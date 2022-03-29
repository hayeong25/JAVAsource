package condition;

import java.util.Scanner;

public class MinValue {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int number1 = scanner.nextInt();
		System.out.print("정수를 입력해주세요 : ");
		int number2 = scanner.nextInt();
		System.out.print("정수를 입력해주세요 : ");
		int number3 = scanner.nextInt();
		
		int min = number1;
		
		if(min > number2) {
			min = number2;
		}
		if(min > number3) {
			min = number3;
		}
		
		System.out.println("가장 작은 수는 " + min + "입니다.");
		
		int max = number1;
		
		if(max < number2) {
			max = number2;
		}
		if(max < number3) {
			max = number3;
		}
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		scanner.close();
		
	}
}