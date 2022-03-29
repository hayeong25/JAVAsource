package exception;

// throws : 예외 던지기

public class CheckedException2 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName(null);
		
	}
}