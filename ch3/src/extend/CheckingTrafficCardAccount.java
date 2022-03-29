package extend;

// Account + 체크카드 + 교통카드 기능

public class CheckingTrafficCardAccount extends CheckingAccount {
	
	public CheckingTrafficCardAccount(String accountNo, String owner, int balance, String cardNo, boolean hasTrafficCard) {
		super(accountNo, owner, balance, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}

	// 교통카드 기능
	private boolean hasTrafficCard;
	
	// 기능 - 교통비 지불
	int payTrafficCard(String cardNo, int amount) {
		if(!hasTrafficCard) {
			System.out.println("교통카드 기능이 없습니다.");
			return -1;
		}else {
			return pay(cardNo, amount);
		}
	}
}