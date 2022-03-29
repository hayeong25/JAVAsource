package operation;

import java.util.Scanner;

// 사용자로부터 한 달 월급을 입력받아 10년 저축 시의 금액 확인

public class Salary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월급을 입력해주세요 : ");
		int salary = scanner.nextInt();
		
		System.out.println("10년간 저축하면 총 " + (salary * 12 * 10) + "원입니다.");
		
		scanner.close();
	}
}