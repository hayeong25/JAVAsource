package shop;

public class SmartTV extends Product {

	// 멤버변수
	private String resolution; // 해상도
	
	// 생성자
	public SmartTV(String name, int price, String resolution) {
		super(name, price);
		this.resolution = resolution;
	}

	// Product 추상메소드 오버라이딩
	@Override
	public void printExtra() {
		System.out.println("해상도 : " + resolution);
	}

}