package extend;

public class CheckingTrafficCardAccountEx {
	public static void main(String[] args) {
		
		// 객체 2개 생성
		CheckingTrafficCardAccount account1 = new CheckingTrafficCardAccount("111-11", "찬료리", 50000, "111-11", false);
		CheckingTrafficCardAccount account2 = new CheckingTrafficCardAccount("222-22", "곰탱이", 30000, "222-22", true);
		
		// 입금
		account1.deposit(10000);
		
		// 출금
		account1.withdraw(20000);
		
		// 체크카드 사용
		account1.pay("111-11", 30000);
		System.out.println(account1.getOwner() + "님의 잔액은 " + account1.getBalance() + "원입니다.");
		
		// 교통카드 사용
		account1.payTrafficCard("111-11", 1250);
		System.out.println(account1.getOwner() + "님의 잔액은 " + account1.getBalance() + "원입니다.");
		
		// 입금
		account2.deposit(10000);
		
		// 출금
		account2.withdraw(20000);
		
		// 체크카드 사용
		account2.pay("222-22", 30000);
		System.out.println(account1.getOwner() + "님의 잔액은 " + account1.getBalance() + "원입니다.");
		
		// 교통카드 사용
		account2.payTrafficCard("222-22", 1250);
		System.out.println(account1.getOwner() + "님의 잔액은 " + account1.getBalance() + "원입니다.");
	}
}