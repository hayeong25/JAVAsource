package extend;

public class TV2 {
	
	// 속성
	private String color;
	private boolean power;
	private int channel;
   
	// 생성자
	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	// getter
	public String getColor() {
		return color;
	}
	public boolean isPower() {
		return power;
	}
	public int getChannel() {
		return channel;
	}
	
	// setter
	public void setColor(String color) {
		this.color = color;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	// 기능
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