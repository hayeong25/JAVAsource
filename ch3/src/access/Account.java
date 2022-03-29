package access;

/*
	접근 제한자
	- 객체 생성을 막아야 하는 경우
	- 특정 메소드 호출 못하도록 하는 경우
	- 객체의 속성을 외부에서 함부로 변경하지 못하도록 하는 경우
	
	종류 : private < default(package) < protected < public
	
	클래스의 접근 제한 : public(다른 패키지에서도 접근 가능), default(같은 패키지만 허용)
	
	멤버변수의 접근 제한 : private
					- 패키지 상관없이 멤버변수 사용 불가
					- 속성값 변경하기 위해서는 메소드를 통해서만 가능하고 직접적으로 변경하는 것은 허용하지 않음
					- getter, setter를 통해서만 값 변경 가능
*/

class Account {
	
	// 속성 - 계좌번호, 예금주, 잔액
	private String accountNo;
	private String owner;
	private int balance;
	
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
	
	// getter 메소드
	// private으로 설정된 변수에 외부에서 직접 접근 불가능한 상황일 때 해당 변수값 return 하는 기능
	public String getAccountNo() {
		return accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	
	// setter 메소드
	// 메소드를 통해서 private 변수 값 변경 (매개값의 유효성 검증 후 변경)
	public void setAccountNo(String accountNo) {
		// 유효성 검사 : 숫자 4자리 - 숫자 3자리
		this.accountNo = accountNo;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}