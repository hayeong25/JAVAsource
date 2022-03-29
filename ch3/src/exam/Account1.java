package exam;

public class Account1 {
	
	// 잔고(balance) 필드
	// 0 <= balance <= 1,000,000
	private int balance;
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	
	// 입금
	public int deposit(int money) {
		if(!(balance < MIN_BALANCE) || (balance > MAX_BALANCE)) {
			balance += money;
		}
		return balance;
	}
	
	// 출금
	public int withdraw(int money) {
		if(!(balance < MIN_BALANCE) || (balance > MAX_BALANCE)) {
			balance -= money;
		}
		return balance;
	}
	
	// getter
	public int getBalance() {
		return balance;
	}

	// setter
	// 매개값이 음수이거나 1,000,000원 초과하면 현재 balance값 유지
	public void setBalance(int balance) {
		if(!(balance < MIN_BALANCE) || (balance > MAX_BALANCE)) {
			this.balance = balance;
		}
	}
	
}