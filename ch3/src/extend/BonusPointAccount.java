package extend;

// Account + 보너스 포인트

public class BonusPointAccount extends Account {

	// 속성 - 보너스 포인트
	private int bonusPoint;
	
	public BonusPointAccount(String accountNo, String owner, int balance, int bonusPoint) {
		super(accountNo, owner, balance);
		this.bonusPoint = bonusPoint;
	}
	
	// getter
	public int getBonusPoint() {
		return bonusPoint;
	}

	// setter
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	// 오버라이딩
	@Override
	int deposit(int amount) {
		// 예금
		super.deposit(amount);
		// 보너스 포인트 = 입금액 * 0.1%
		bonusPoint += (int)(amount * 0.001);
		return bonusPoint;
	}
	
}