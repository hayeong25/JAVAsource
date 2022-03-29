package interfacetest;

public class RemoteControlEx {
	public static void main(String[] args) {
		
		// Television 객체
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		System.out.println();
		
		// Audio 객체
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		// Radio 클래스와 객체 생성하지 않고 인터페이스 코드 활용
		// 인터페이스 직접 객체 생성 불가
//		RemoteControl rc1 = new RemoteControl();
//		RemoteControl rc1 = new Radio();
		
		// 익명 구현 객체
		RemoteControl rc1 = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Radio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Radio를 끕니다.");
			}
			@Override
			public void setVolume(int volume) {
				System.out.println("현재 Radio 볼륨은 " + volume + "입니다.");
			}
		};
		
		rc1.turnOn();
		rc1.setVolume(7);
		rc1.turnOff();
	}
}