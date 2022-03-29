package abstracttest;

public class SportsCar extends Car {
	
	// 추상클래스를 상속받는 클래스는 추상메소드 오버라이딩 필수
	@Override
	public void drive() {
		System.out.println("스포츠카를 운전합니다.");
	}

	@Override
	public void stop() {
		// 내용이 없어도 무조건 메소드 오버라이딩 해야 함
		System.out.println("스포츠카를 멈춥니다.");
	}

}