package exception;

public class ThrowsEx {
	public static void main(String[] args) {
		
		// throws로 인해 호출하는 곳에서 예외 처리하게 됨
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}
}