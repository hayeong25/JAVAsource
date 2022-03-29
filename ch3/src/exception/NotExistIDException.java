package exception;

// ID가 존재하지 않는 경우

public class NotExistIDException extends Exception {
	
	public NotExistIDException(String message) {
		super(message);
	}
	
}