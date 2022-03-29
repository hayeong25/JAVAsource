package modifier;

import classtest.Account;
// Account 클래스는 classtest 패키지 안에 있으므로 import 필요
// House 클래스는 동일 패키지 안에 있으므로 import 필요 없음

public class AccountEx {
	public static void main(String[] args) {
		
		Account account = new Account(null, null, 0);
		House house = new House();
	}
}