package extend;

public class CaptionTVEx1 {
	public static void main(String[] args) {
		
		CaptionTV ctv = new CaptionTV();
		
		ctv.channel = 10;
		ctv.channelUp(); // channel++
		System.out.println("현재채널 : " + ctv.channel);
		
		ctv.display("Hello World"); // boolean caption 초기값은 false이므로 출력 X
		ctv.caption = true;
		ctv.display("Hello World!");
		
		CaptionTV2 ctv2 = new CaptionTV2("black", true, 7, true);
		ctv2.setChannel(11); // ctv2의 속성은 private 접근 제한자이므로, setter, getter 사용
		ctv2.channelUp();
		System.out.println("현재 채널 : " + ctv2.getChannel());
	}
}