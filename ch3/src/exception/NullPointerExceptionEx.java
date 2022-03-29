package exception;

// Null Pointer Exception : Null 값 출력시 나타나는 예외

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		
		Account[] account = new Account[2];
		System.out.println(account[0]);
		
		try {
			System.out.println(account[0].accountNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}