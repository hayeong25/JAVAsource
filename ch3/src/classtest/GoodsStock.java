package classtest;

/*
	메소드(함수)
	return타입 메소드명(매개변수) {
		실행할 문장
	}
	
	return 타입 : 메소드가 실행을 끝내고 돌아갈 떄 가지고 가야 할 값 
				 int, char, float, boolean 등 데이터타입 모두 가능
				 byte[], short[] 등 배열 타입 모두 가능
				 클래스, 인터페이스
				 void - return 값 없음. 호출만 가능
			ex) int method1() {} : method1 실행을 끝내고 int 타입의 return값을 가지고 돌아간다는 뜻
*/

public class GoodsStock {
	
	// 속성 - 상품코드(P1010), 재고수량(25)
	String code;
	int stockNum;
	
	// 생성자
	public GoodsStock() { // default 생성자
		
	}
	
	// 오버로딩(인자를 갖는 생성자)
	public GoodsStock(String code) {
		super();
		this.code = code;
	}

	// 오버로딩(인자를 갖는 생성자)
	public GoodsStock(String code, int stockNum) {
		super();
		this.code = code;
		this.stockNum = stockNum;
	}

	// 기능
	// 재고추가 : 재고수량을 입력받아서 현재 재고수량에 추가하기 + 현재 재고수량 return
	int addStock(int amount) {
		stockNum += amount; // stockNum = stockNum + amount
		return stockNum; // 메소드를 호출한 곳으로 값 보내기
	}
	
	// 재고감소 : 판매수량을 입력받아서 현재 재고수량에서 감소하기 + 현재 재고수량 return
	int subtractStock(int amount) {
		stockNum -= amount;
		return stockNum;
	}
	
}