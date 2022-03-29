package exception;

// Number Format Exception

public class NumberFormatExceptionEx {
	public static void main(String[] args) {
		
		String data1 = "a100";
		String data2 = "100";
		
		try {
		
			int value1 = Integer.parseInt(data1); // a100는 int로 변경 불가
			
			// NumberFormatException으로 인해 이후의 코드는 실행되지 않음
			int value2 = Integer.parseInt(data2); // 100
			System.out.println(value1 + value2);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally { // 예외 여부 상관없이 무조건 실행
			
			System.out.println("종료");
			
		}
		
	}
}