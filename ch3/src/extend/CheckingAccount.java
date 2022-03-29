package extend;

// Account + 체크카드 기능

public class CheckingAccount extends Account {

	private String cardNo; // 체크카드 번호
	
	public CheckingAccount(String accountNo, String owner, int balance, String cardNo) {
		super(accountNo, owner, balance);
		this.cardNo = cardNo;
	}

	// 기능 - 금액 지불
	// 매개인자로 카드번호와 사용금액을 받아 카드번호 일치 여부 확인 및 은행 잔고와 비교 후 지불
	int pay(String cardNo, int amount) {
		if(!this.cardNo.equals(cardNo) || getBalance() < amount) {
			System.out.println("카드 번호 또는 잔액을 확인하세요.");
			return -1;
		}
		return withdraw(amount); // 부모 클래스에 출금 메소드가 있기 때문에 setBalance(getBalance() - amount) 안 해도 됨
		
	}
}