package access;

public class SingletonEx {
	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1 == obj2); // true
		
		Account account1 = new Account("111-11", "찬료리", 10000);
		Account account2 = new Account("222-22", "곰탱이", 10000);
		System.out.println(account1 == account2); // false
		
	}
}