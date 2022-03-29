package shop;

// 추상 클래스 : 일반 클래스 + 추상 메소드
// 객체 생성은 불가

public abstract class Product {

	private String name; // 상품명
	private int price; // 가격
	
	// 인자를 받는 생성자
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메소드 - 상품마다 동일한 내용 출력
	public void printDetail() {
		System.out.println("상품명 : " + name);
		System.out.println("상품가격 : " + price);
		
		printExtra();
	}
	
	// 추상 메소드 - 상품마다 다른 내용 출력하기 때문에 추상 메소드 사용
	public abstract void printExtra();
	
}