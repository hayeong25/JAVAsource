package classtest;

public class CardEx {
	public static void main(String[] args) {
		
		// static 변수 : 객체 생성없이 호출 가능
		System.out.println("width = " + Card.width);
		System.out.println("height = " + Card.height);
		
		Card card1 = new Card("heart", 7);
		Card card2 = new Card("spade", 4);
		Card card3 = new Card("heart", 8);
		
		System.out.println("card1 kind = " + card1.kind + ", card1 number = " + card1.number + ", card1 width = " + Card.width + ", card1 height = " + Card.height);
		System.out.println("card2 kind = " + card2.kind + ", card2 number = " + card2.number + ", card2 width = " + Card.width + ", card2 height = " + Card.height);
		// The static field Card.width should be accessed in a static way
		// static 변수는 고정이기 때문에 card1.width가 아닌 Card.width
		
		Card.width = 50;
		Card.height = 50;
		
		System.out.println("card3 kind = " + card3.kind + ", card3 number = " + card3.number + ", card3 width = " + Card.width + ", card3 height = " + Card.height);
		
	}
}
