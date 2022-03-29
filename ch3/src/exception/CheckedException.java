package exception;

// Checked Exception : 컴파일러가 바로 발견해서 알려주는 예외 오류

public class CheckedException {
	public static void main(String[] args) {
		
		// Unhandled exception type ClassNotFoundException
		
		try {
			Class.forName(null);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}