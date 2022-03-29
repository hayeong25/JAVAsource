package classtest;

public class TVEx {
	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.color = "black";
		tv.channel = 3;
		tv.power = false;
		
		tv.power();
		
		System.out.println("전원 : " + tv.power + " 현재 채널 : " + tv.channel);
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		System.out.println("전원 : " + tv.power + " 현재 채널 : " + tv.channel);
	}
}
