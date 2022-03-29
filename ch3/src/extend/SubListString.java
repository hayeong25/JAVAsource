package extend;

public class SubListString extends ListString {
	String name = "꼬물이";
	
	// 오버라이딩
	// @ 어노테이션 : 컴파일러에게 알려주기
	@Override
	public void list() {
		super.list(); // 부모 클래스의 메소드 호출
		System.out.println(name  + " 하위 클래스");
	}
	
	public void writer() {
		System.out.println("상위 클래스 name : " + super.name);
		System.out.println("하위 클래스 name : " + name);
		this.list();
		super.list();
	}
	
}