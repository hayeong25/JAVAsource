package classtest;

public class TV2 {
	String color;
	boolean power;
	int channel;
	
	public TV2(String color) {
		this.color = color;
	}

	public TV2(String color, boolean power) {
		this.color = color;
		this.power = power;
	}
	
	public TV2(String color, boolean power, int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
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
