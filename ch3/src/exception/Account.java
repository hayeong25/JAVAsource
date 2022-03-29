package exception;

public class Account {
	
	// 속성 - 계좌번호, 예금주, 잔액
	String accountNo;
	String owner;
	int balance;
	
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	// 입금
	int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	// 출금
	// BalanceInsufficientException
//	int withdraw(int amount) throws BalanceInsufficientException {
//		if(balance < amount) {
//			// 예외 강제 발생(throw)
//			throw new BalanceInsufficientException("잔고부족 : " + (amount - balance) + "원 부족");
//		}
//		balance -= amount;
//		return balance;
//	}
	
	// Exception
	int withdraw(int amount) throws Exception {
		if(balance < amount) {
			// 예외 강제 발생(throw)
			throw new Exception("잔고부족 : " + (amount - balance) + "원 부족");
		}
		balance -= amount;
		return balance;
	}
	
}