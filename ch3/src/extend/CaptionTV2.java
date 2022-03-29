package extend;

public class CaptionTV2 extends TV2 {
	
	// default 생성자
	// Implicit super constructor TV2() is undefined for default constructor. Must define an explicit constructor
	// 부모 클래스에 default 생성자가 없으면 Error

//	public CaptionTV2() {
//		super(); // 부모의 생성자 호출
//	}
	
	// 캡션 기능
	boolean caption; // 초기화는 false
	
	public CaptionTV2(String color, boolean power, int channel, boolean caption) {
		super(color, power, channel); // 부모의 인자를 받는 생성자 호출 >> TV2 클래스의 생성자 실행
		this.caption = caption;
	}
	
	void display(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
}