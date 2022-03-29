package extend;

public class CellPhone {
	
	// 속성 : 모델, 색상
	String model;
	String color;
	
	// 기능
	// 전원 켜고 끄기
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 벨이 울린다
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	// 메시지 주고 받기
	void sendVoice(String msg) {
		System.out.println("본인 : " + msg);
	}
	
	void receiveVoice(String msg) {
		System.out.println("상대방 : " + msg);
	}
	
	// 전화 끊기
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}