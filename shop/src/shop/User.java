package shop;

public class User {
	
	// 멤버변수
	private String name; // 고객명
	private PayType paytype; // 결제방법(Enum) : 현금 & 카드
	
	// 생성자
	public User(String name, PayType paytype) {
		super();
		this.name = name;
		this.paytype = paytype;
	}

	// getter
	public String getName() {
		return name;
	}
	public PayType getPaytype() {
		return paytype;
	}
	
}