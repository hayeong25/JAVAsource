package extend;

public class CheckingAccountEx {
	public static void main(String[] args) {
		
		// 계좌 2개 생성
		CheckingAccount account1 = new CheckingAccount("111-11", "곰탱이", 20000, "111-11");
		CheckingAccount account2 = new CheckingAccount("222-22", "찬료리", 50000, "222-22");
		
		// 예금
		account1.deposit(30000);
		
		// 편재 잔액 확인
		System.out.println(account1.getOwner() + "님의 잔액은 " + account1.getBalance() + "원입니다.");
		
		// 체크카드 사용
		account1.pay("111-11", 20000);
		
		// 체크카드 사용 후 잔액
		System.out.println(account1.getOwner() + "님의 잔액은 " + account1.getBalance() + "원입니다.");
		
		// 출금
		account2.withdraw(30000);
		
		// 체크카드 사용
		account2.pay("333-33", 15000); // 카드번호 오류
		
		// 체크카드 사용 후 잔액
		System.out.println(account2.getOwner() + "님의 잔액은 " + account2.getBalance() + "원입니다.");
		
	}
}