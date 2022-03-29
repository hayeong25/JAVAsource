package interfacetest;

public class Television implements RemoteControl, Searchable { // 인터페이스 여러 개 가능

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME; 
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨은 " + this.volume + "입니다.");
	}

	@Override
	public void setMute(boolean mute) {
		RemoteControl.super.setMute(mute);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
}