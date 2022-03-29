package classtest;

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

	// 기능
	// 입금
	int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	// 출금
	int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
}