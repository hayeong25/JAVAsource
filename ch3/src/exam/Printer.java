package exam;

public class Printer {
	
	// 메소드 오버로딩
	public void println(int number) {
		System.out.println(number);
	}
	
	public void println(boolean status) {
		System.out.println(status);
	}
	
	public void println(double number) {
		System.out.println(number);
	}
	
	public void println(String str) {
		System.out.println(str);
	}
	
}