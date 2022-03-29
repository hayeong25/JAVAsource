package shop;

public class CellPhone extends Product {

	// 멤버변수
	private String carrier; // 통신사
	
	// 생성자
	public CellPhone(String name, int price, String carrier) {
		super(name, price);
		this.carrier = carrier;
	}

	// Product 추상메소드 오버라이딩
	@Override
	public void printExtra() {
		System.out.println("통신사 : " + carrier);
	}

}