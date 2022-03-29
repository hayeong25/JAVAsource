package abstracttest;

// 추상 클래스 : 템플릿 메소드를 가지고 있는 클래스
// 추상 메소드가 있으면 무조건 abstract 붙여야 함

public abstract class Car {
	
	// 추상 메소드 : 템플릿 메소드
	public abstract void drive();
	public abstract void stop();
	
	// 일반 메소드도 가질 수 있음
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
}