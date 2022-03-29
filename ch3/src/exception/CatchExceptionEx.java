package exception;

// 서로 다른 Exception이 발생하는 경우
// Catch Exception

/*
	catch (Exception e) { >> 모든 Exception 처리 가능
		e.printStackTrace();
	}
	
	또는
	
	catch (ArrayIndexOutOfBoundsException e) { >> 각각의 Exception 개별 처리
		e.printStackTrace();
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
*/

public class CatchExceptionEx {
	public static void main(String[] args) {
		
		try {
			
			// 배열 : ArrayIndexOutOfBoundsException 발생할 수 있는 구문
			String data1 = args[0]; // Run - Run Configurations - Arguments
			String data2 = args[1];
			
			// NumberFormatException 발생할 수 있는 구문
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변경할 수 없습니다.");
		}
		
	}
}