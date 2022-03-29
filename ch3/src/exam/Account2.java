package exam;

public class Account2 {
	
	// 속성 : 계좌번호, 예금주, 잔액
	private String ano;
	private String owner;
	private int balance;
	
	// 생성자 : 3개의 멤버변수 초기화
	public Account2(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// getter
	public String getAno() {
		return ano;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	
	// setter
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}