package polymorphism;

public class BuyerEx {
	public static void main(String[] args) {
		
		// 구매자 객체 생성
		Buyer buyer = new Buyer();
		System.out.println("현재 잔액은 " + buyer.money + "만 원입니다.");
		
		System.out.println();
		
		// TV 구매
		buyer.buy(new TV());
		
		// Computer 구매
		buyer.buy(new Computer());
		
		// Audio 구매
		buyer.buy(new Audio());
		
		System.out.println();
		
		// 현재 잔액 확인
		System.out.println("현재 잔액은 " + buyer.money + "만 원입니다.");
		System.out.println("현재 보너스 포인트는 " + buyer.bonusPoint + "점입니다.");
	}
}