package condition;

import java.util.Scanner;

// 입출금 및 잔고 확인 프로그램 작성하기

public class BankApp {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int account = 0;
		boolean status = true;
		
		while(status) {
			System.out.println("================================");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("================================");
			System.out.print("메뉴를 선택해주세요 : ");
			
			int menu = scanner.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("얼마를 입금하시겠습니까?");
				int deposit = scanner.nextInt();
				account += deposit;
				System.out.println(deposit + "원 입금되었습니다.");
				break;
			case 2:
				System.out.println("얼마를 출금하시겠습니까?");
				int withdraw = scanner.nextInt();
				if(withdraw > account) {
					System.out.println("잔고보다 더 출금할 수 없습니다.");
				}else {
					account -= withdraw;
					System.out.println(withdraw + "원 출금되었습니다.");
				}
				break;
			case 3:
				System.out.println("현재 고객님의 잔고는 " + account + "원입니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				status = false;
				break;
			}
		}
		
		scanner.close();
		
	}
}