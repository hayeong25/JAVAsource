package classtest;

// 클래스 - 멤버변수, 메소드를 내부에서 사용할 때는

public class Calculator2 {
	int plus(int x, int y) { // x = 7, y = 10
		return x + y; // 17
	}
	
	double avg(int x, int y) { // x = 7, y = 10
		int sum = plus(x, y); // 17
		return sum / 2; // (int)8 >> (double)8.0
	}
	
	void execute() { // 클래스 내부의 메소드 호출
		double result = avg(7, 10); // 8.0
		println("실행결과 = " + result);
	}
	
	void println(String message) {
		System.out.println(message); // 실행결과 = 8.0
	}
}