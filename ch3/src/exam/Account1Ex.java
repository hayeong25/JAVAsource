package exam;

import java.util.Scanner;

public class Account1Ex {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Account1 account = new Account1();
		boolean status = true;
		
		while(status) {
			System.out.println("입금(1) 출금(2) 잔액확인(3) 종료(4)");
			System.out.print("메뉴를 선택하세요 : ");
			
			int number = scanner.nextInt();
			
			switch (number) {
			case 1:
				System.out.print("얼마를 입금하시겠습니까?");
				int deposit = scanner.nextInt();
				account.deposit(deposit);
				System.out.println(deposit + "원 입금되었습니다.");
				break;
			case 2:
				System.out.print("얼마를 출금하시겠습니까?");
				int withdraw = scanner.nextInt();
				if(withdraw > account.getBalance()) {
					System.out.println("잔액보다 더 출금할 수 없습니다.");
				}else {
					account.withdraw(withdraw);
					System.out.println(withdraw + "원 출금되었습니다.");
				}
				break;
			case 3:
				System.out.println("잔액은 " + account.getBalance() + "원입니다.");
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