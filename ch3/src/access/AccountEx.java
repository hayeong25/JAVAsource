package access;

public class AccountEx {
	public static void main(String[] args) {
		
		Account account = new Account("111-11", "찬료리", 10000);
		
		// System.out.println("계좌번호 : " + account.accountNo);
		System.out.println("계좌번호 : " + account.getAccountNo());
		
		// System.out.println("예금주 : " + account.owner);
		System.out.println("예금주 : " + account.getOwner());
		
		// System.out.println("잔액 : " + account.balance);
		System.out.println("잔액 : " + account.getBalance());
		
	}
}