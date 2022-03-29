package access;

/*
	싱글톤 패턴 : 객체 생성은 하나로 제한. 단 하나의 인스턴스만 사용하는 패턴
	1. 생성자를 private로 작성
	 - 자동으로 생성자를 만들게 하면 public으로 생성함
	2. 클래스 내부에 static으로 유일한 인스턴스 생성
	3. 외부에서 참조 가능한 public 메소드 작성
*/

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	// 생성자를 만들지 않으면 default 컴파일러가 자동으로 생성한다
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
}