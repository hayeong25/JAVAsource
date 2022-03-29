package classtest;

public class DataEx {
	// main이 있는 특수한 클래스
	public static void main(String[] args) {
		
		// Data 객체 생성
		Data data = new Data();
		
		// 초기화
		data.x = 10;
		System.out.println("x = " + data.x); // 10
		
		// 내부 메소드 호출
		change(data.x);
		System.out.println("change(data.x) 호출 후");
		System.out.println("x = " + data.x); // 10
		
		change(data);
		System.out.println("change(data) 호출 후");
		System.out.println("x = " + data.x); // 1000
	}
	
	// x값 변경
	static void change(int x) { // 기본형 매개변수(메소드 내부 값만 변경)
		x = 1000;
		System.out.println("change x = " + x);
		// return 값 없음
	}
	
	// 객체 값 변경
	static void change(Data d) { // 참조형 매개변수 (main에서도 변경값 그대로 유지)
		d.x = 1000;
		System.out.println("change d.x = " + d.x);
		// 값이 1000인 주소를 d, data가 참조
	}
	
}