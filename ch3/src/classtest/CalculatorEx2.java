package classtest;

public class CalculatorEx2 {
	public static void main(String[] args) {
		// 다른 클래스 내부의 메소드 사용하고 싶을 때 무조건 객체 생성부터 해야 함
		Calculator2 cal = new Calculator2(); 
		
		cal.execute();
		
	}
}