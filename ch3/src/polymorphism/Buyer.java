package polymorphism;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
	// 제품 배열 생성
	Product items[] = new Product[10];
	int i = 0;
	
	void buy(Product p) { // Product를 부모로 갖는 모든 자식 클래스가 buy() 메소드 사용 가능
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items[i++] = p; 
		
		System.out.println(p.price + "만 원짜리 " + p + "을/를 구매하였습니다.");
	}
	
	// 제품마다 buy() 메소드 만들지 않아도 됨
//	void buy(TV p) {
//		if(money < p.price) {
//			System.out.println("잔액이 부족합니다.");
//			return;
//		}
//		money -= p.price;
//		bonusPoint += p.bonusPoint;
//		
//		System.out.println(p.price + "만 원짜리" + p + "을/를 구매하였습니다.");
//	}
//	
//	void buy(Computer p) {
//		if(money < p.price) {
//			System.out.println("잔액이 부족합니다.");
//			return;
//		}
//		money -= p.price;
//		bonusPoint += p.bonusPoint;
//		
//		System.out.println(p.price + "만 원짜리" + p + "을/를 구매하였습니다.");
//	}
	
}