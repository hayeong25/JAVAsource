package exception;

// 비밀번호가 틀렸을 경우

public class WrongPasswordException extends Exception {
	
	public WrongPasswordException(String message) {
		super(message);
	}
	
}