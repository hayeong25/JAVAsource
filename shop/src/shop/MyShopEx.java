package shop;

public class MyShopEx {
	public static void main(String[] args) {
		
		// 쇼핑몰 생성
		MyShop shop = new MyShop();
		
		// 상호명 지정
		shop.setTitle("MyShop");
		
		// 고객 생성
		shop.genUser();
		
		// 제품 생성
		shop.genProduct();
		
		// shop 시작
		shop.start();
		
	}
}