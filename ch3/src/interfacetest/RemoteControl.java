package interfacetest;

// TV, Radio, Audio 모두 조작 가능한 만능 리모컨

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 8 버전 이상부터 default 메소드 구현 가능
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 설정");
		}else {
			System.out.println("무음 해제");
		}
	}
	
	// 8 버전 이상부터 static 메소드 구현 가능
	static void changeBattery() {
		System.out.println("건전지 교환");
	}
	
}