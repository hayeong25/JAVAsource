package classtest;

public class SubscriberEx {
	public static void main(String[] args) {
		
		SubscriberInfo info = new SubscriberInfo();
		
		// 초기화
		info.id = "gomgom";
		info.name = "곰탱이";
		info.password = "gom123!";
		info.changeAddress("구로구"); // return 타입이 void인 경우 호출만 가능
		
		// 첫 번째 가입자 정보 출력
		System.out.println("ID  : " + info.id);
		System.out.println("Name : " + info.name);
		System.out.println("Password : " + info.password);
		System.out.println("Address : " + info.address);
		System.out.println("Phone : " + info.phone);

		System.out.println();
		
		// 두 번째 가입자
		SubscriberInfo info2 = new SubscriberInfo("꼬물이", "ggomul", "mul123!");
	
		// 두 번째 가입자 정보 출력
		System.out.println("ID  : " + info2.id);
		System.out.println("Name : " + info2.name);
		System.out.println("Password : " + info2.password);
		System.out.println("Address : " + info2.address);
		System.out.println("Phone : " + info2.phone);
		
		System.out.println();
		
		// 세 번째 가입자
		SubscriberInfo info3 = new SubscriberInfo("찬료리", "ciro", "ciro123!", "010-1234-1234", "철산");
		
		// 세 번째 가입자 정보 출력
		System.out.println("ID  : " + info3.id);
		System.out.println("Name : " + info3.name);
		System.out.println("Password : " + info3.password);
		System.out.println("Address : " + info3.address);
		System.out.println("Phone : " + info3.phone);
	}
}