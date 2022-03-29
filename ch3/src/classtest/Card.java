package classtest;

public class Card {
	
	// 멤버변수(인스턴스 변수)
	String kind;
	int number;
	
	// 클래스 변수
	// 카드의 높이와 너비는 모두 동일하기 때문에 static으로 고정
	// static 변수는 초기화 기본으로 해야 함
	static int width = 100;
	static int height = 150;
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
}