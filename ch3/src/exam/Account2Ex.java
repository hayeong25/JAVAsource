package exam;

import java.util.Scanner;

// 다계좌 ㅅ입출금 관리 프로그램

public class Account2Ex {
	
	// 멤버변수
	// static : 공유 가능 (클래스명.변수명 으로 사용 가능)
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);
	
	// main
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("==============================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 입금 | 4. 출금 | 5. 종료");
			System.out.println("==============================================");
			System.out.print("메뉴를 선택하세요 : ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			}
			
		}
		
		scanner.close();
		
	}
	
	// 계좌 생성
	private static void createAccount() {
		// ano, owner, balance 입력 받아 Acount2 객체 배열에 담기
		System.out.print("계좌번호를 입력해주세요 : ");
		String ano = scanner.nextLine();
		System.out.print("예금주를 입력해주세요 : ");
		String owner = scanner.nextLine();
		System.out.print("잔액을 입력해주세요 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account2(ano, owner, balance);
				System.out.println(ano + " 계좌가 생성되었습니다.");
				break; // for문 빠져나가서 main의 while문으로 되돌아감
			}
		}
	}
	
	// 계좌 목록
	private static void accountList() {
		System.out.println("================================");
		System.out.println("계좌번호\t\t 예금주\t 잔액");
		System.out.println("================================");
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			}
		}
	}
	
	// 입금
	private static void deposit() {
		System.out.print("입금할 계좌번호를 입력해주세요 : ");
		String ano = scanner.nextLine();
		Account2 account = findAccount(ano);
		if(account != null) {
			System.out.print("입금할 금액을 입력해주세요 : ");
			int deposit = Integer.parseInt(scanner.nextLine());
			account.setBalance(account.getBalance() + deposit);
			System.out.println(deposit + "원 입금되었습니다.");
		}else {
			System.out.println("존재하지 않는 계좌입니다.");
			System.out.println("메뉴로 돌아갑니다.");
		}
	}
	
	// 출금
	private static void withdraw() {
		System.out.println("출금할 계좌번호를 입력해주세요 : ");
		String ano = scanner.nextLine();
		Account2 account = findAccount(ano);
		if(account != null) {
			System.out.println("출금할 금액을 입력해주세요 : ");
			int withdraw = Integer.parseInt(scanner.nextLine());
			if(withdraw > account.getBalance()) {
				System.out.println("잔액보다 더 출금할 수 없습니다.");
			}else {
				account.setBalance(account.getBalance() - withdraw);
				System.out.println(withdraw + "원 출금되었습니다.");
			}
		}else {
			System.out.println("존재하지 않는 계좌입니다.");
			System.out.println("메뉴로 돌아갑니다.");
		}
	}
	
	// Account2 배열에서 ano와 동일한 Account 찾기
	private static Account2 findAccount(String ano) {
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(ano.equals(accountArray[i].getAno())) {
					return accountArray[i];
				}
			}
		}
		return null;
	}
	
}