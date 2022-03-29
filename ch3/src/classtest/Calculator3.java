package classtest;

// static : 객체 생성 없이 호출 가능한 메소드

public class Calculator3 {
	
	// 멤버 변수(인스턴스 변수)
	long a, b;
	
	// 멤버 메소드(인스턴스 메소드) : 객체가 가지고 있는 메소드
	long add() {
		return a + b;
	}
	
	long subtract() {
		return a - b;
	}
	
	long multiply() {
		return a * b;
	}
	
	long divide() {
		return a / b;
	}
	
	// 클래스 메소드 : 공유되는 메소드, 객체 생성없이 사용 가능
	static long add(long c, long d) {
		return c + d;
	}
	
	static long subtract(long c, long d) {
		return c - d;
	}
	
	static long multiply(long c, long d) {
		return c * d;
	}
	
	static double divide(long c, long d) {
		return c / d;
	}
	
	// 인스턴스 변수, 인스턴스 메소드 사용 불가
	// 객체 생성 이후에 메모리에 올라가는 애들이기 때문에 사용 불가
//	static long add2() {
//		return a + b; >> Cannot make a static reference to the non-static field a
//		add(); >> Cannot make a static reference to the non-static method add() from the type Calculator3
//	}
	
}