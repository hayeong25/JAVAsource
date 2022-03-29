package exception;

public class LoginEx {
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		
		// ID가 blue가 아니라면 NotExistIDException 발생
		// 아이디가 존재하지 않습니다 메시지 출력
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		// PW가 12345가 아니라면 WrongPasswordException 발생
		// 패스워드가 틀립니다 메시지 출력
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀렸습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		
		// try ~ multi catch
		try {
			login("white", "12345");
		} catch (NotExistIDException | WrongPasswordException e) {
			e.printStackTrace();
		}
		
		// try ~ catch
		try {
			login("blue", "54321");
		} catch (NotExistIDException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		}
		
	}
}