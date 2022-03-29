package classtest;

/*
	기본 타입의 초기화는 null 불가능
	int a = null; >> X
	
	클래스 초기화는 null 가능
	String str = null;
	TV tv = null;
	
	null은 값이 할당되지 않은 것
*/

public class SubscriberInfoEx2 {
	public static void main(String[] args) {
		
		// SubscriberInfo 객체 담을 배열 생성
		SubscriberInfo info[] = new SubscriberInfo[3];
		
		// 생성된 배열에 SubscriberInfo 객체 생성 후 담기
		info[0] = new SubscriberInfo("찬료리", "ciro", "ciro123!");
		info[1] = new SubscriberInfo("곰탱이", "gomtaeng", "gom123!", "010-1234-1234", "철산");
		info[2] = new SubscriberInfo("꼬물이", "gomul", "gomul123!", "010-1234-1234", null);
		
		// 생성된 정보 확인
		print(info);
	}
	
	static void print(SubscriberInfo info[]) {
		// 향상된 for(타입 변수명 : 배열명) {}
		for(SubscriberInfo s : info) {
			System.out.println("성명 : " + s.name + ", ID : " + s.id + ", PW : " + s.password + ", 연락처 : " + s.phone + ", 주소 : " + s.address);
			System.out.println();
		}
	}
}