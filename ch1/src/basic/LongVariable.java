package basic;

// long : 8byte(2^64)

// Java는 모든 정수값을 기본적으로 int로 표현

public class LongVariable {
	public static void main(String[] args) {
		long var1 = 15;
		System.out.println("var1 = " + var1);
		
		// var1 = 12345678900; // The literal 12345678900 of type int is out of range
		var1 = 12345678900L; // 뒤에 L을 붙여야 컴파일러에게 long 타입이라는 것을 알림. 붙이지 않으면 int로 인식
	}
}