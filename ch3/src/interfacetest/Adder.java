package interfacetest;

/*
	인터페이스
	- 상수와 추상 메소드만 가질 수 있음
	- 추상 클래스보다 추상화 정도가 더 높음
	- 다른 클래스를 작성하는 데 도움을 주는 게 목적
	- default, static 키워드가 붙은 메소드는 8 버전 이상부터 허용
*/

public interface Adder {
	
	// 변수 선언 불가
//	private int num; >> interface field only public, static & final are permitted
	
	// 상수 선언 가능
	public static final int SPADE = 1;
	int DIAMOND = 3; // public static final 생략 가능
	final int HEART = 2; // public static 생략 가능
	static int CLOVER = 4; // public final 생략 가능
	
	// 일반 메소드 불가
//	public void print() { >> Abstract methods do not specify a body
//		
//	}
	
	// 추상 메소드만 가능
	public void print();
	
	int add(int x, int y); // public 생략 가능
	
}