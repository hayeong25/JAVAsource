package extend;

// 상속

/*
   CaptionTV
      기존 TV + Caption
*/

public class TV {
	
	String color;
	boolean power;
	int channel;
   
	void power() {
		power = !power;
	}
   
	void channelUp() {
		channel++;
	}
   
	void channelDown() {
		channel--;
	}
	
}