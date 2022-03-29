package extend;

public class BonusPointAccountEx {
	public static void main(String[] args) {
		
		// 객체 2개 생성
		BonusPointAccount account1 = new BonusPointAccount("111-11", "곰탱이", 50000, 0);
		BonusPointAccount account2 = new BonusPointAccount("222-22", "찬료리", 30000, 10);
		
		// 예금
		account1.deposit(20000);
		
		// 보너스 포인트 출력
		System.out.println(account1.getOwner() + "님의 보너스 포인트는 " + account1.getBonusPoint() + "점입니다.");
		System.out.println(account1.getOwner() + "님의 현재 잔액은 " + account1.getBalance() + "원입니다.");
		
		System.out.println();
		
		// 예금
		account2.deposit(50000);
		
		// 보너스 포인트 출력
		System.out.println(account2.getOwner() + "님의 보너스 포인트는 " + account2.getBonusPoint() + "점입니다.");
		System.out.println(account2.getOwner() + "님의 현재 잔액은 " + account2.getBalance() + "원입니다.");
		
	}
}