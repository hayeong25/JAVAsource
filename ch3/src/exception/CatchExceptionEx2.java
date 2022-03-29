package exception;

// 여러 개의 Exception을 한 번에 입력하는 것도 가능

/*
	catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
		e.printStackTrace();
	}
*/

public class CatchExceptionEx2 {
	public static void main(String[] args) {
		
		try {
			
			// 배열 : ArrayIndexOutOfBoundsException 발생할 수 있는 구문
			String data1 = args[0]; // Run - Run Configurations - Arguments
			String data2 = args[1];
			
			// NumberFormatException 발생할 수 있는 구문
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변경할 수 없습니다.");
		}
		
	}
}