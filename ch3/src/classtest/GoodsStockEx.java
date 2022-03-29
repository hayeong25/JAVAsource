package classtest;

/*
	메소드 호출 (값이 return만 되었을 뿐 출력이 되지는 않음)
	① 출력문 사용해 return값 처리하기
	② 변수에 담아 return값 처리하기(재사용 할 경우)
*/

public class GoodsStockEx {
	public static void main(String[] args) {
		
		GoodsStock goods1 = new GoodsStock("P1010", 100); // 상품코드 P1010, 재고수량 100
		
		System.out.println("제품번호 : " + goods1.code);
		System.out.println("현재 재고수량 : " + goods1.stockNum);
		
		// 200개가 입고됨
		// 출력문 사용해 return값 처리
		System.out.println("입고 후 재고수량 : " + goods1.addStock(200));
		
		// 150개가 출고됨(판매)
		// 변수에 담아 return값 처리
		int stockNum = goods1.subtractStock(150);
		System.out.println("출고 후 재고수량 : " + stockNum);
		
		
	}
}