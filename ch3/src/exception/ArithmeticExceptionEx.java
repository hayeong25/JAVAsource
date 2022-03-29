package exception;

// ArithmeticException

public class ArithmeticExceptionEx {
	public static void main(String[] args) {
		
		// 0으로 나눌 경우 예외
		int num1 = 5;
		int num2 = 0;
		System.out.println(num1 / num2); // java.lang.ArithmeticException: / by zero
		
		try {
			// 예외가 발생할만한 코드
			System.out.println(num1 / num2);
		} catch (Exception e) {
			// 예외가 발생하면 다음과 같이 처리
			// System.out.println("Arithmetic Exception : 0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}
		
	}
}