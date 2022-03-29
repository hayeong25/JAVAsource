package operation;

import java.util.Scanner;

// System.out : 모니터에 출력
// 키보드(System.in)에서 입력 받기

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 입력 ");
		int num = scanner.nextInt(); // 사용자가 입력한 숫자 담는 변수 (문자 입력시 exception 발생)
		
		System.out.println("입력한 숫자는 " + num);
		
		scanner.close();
	}
}