package exception;

public class AccountEx {
	public static void main(String[] args) {
		
		Account account = new Account("111", "곰탱이", 20000);
		
		// Account.withdraw()에서 Exception을 throws 했기 때문에 호출한 곳에서 예외 처리 해야 함
		try {
			account.withdraw(300000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}