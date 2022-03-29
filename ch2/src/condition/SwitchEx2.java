package condition;

// 8 ~ 11 사이의 정수

public class SwitchEx2 {
	public static void main(String[] args) {
		
		int time = (int)(Math.random() * 4) + 8;
		System.out.println("[현재 시간은 : " + time + "시입니다.]");
		
		switch (time) {
		case 8:
			System.out.println("출근하기");
			break;
		case 9:
			System.out.println("회의하기");
			break;
		case 10:
			System.out.println("업무보기");
			break;
		default:
			System.out.println("외근 나가기");
			break;
		}
		
	}
}