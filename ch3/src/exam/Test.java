package exam;

public class Test {
	
	// 속성 : 멤버변수
	private String name;
	
	// 생성자 : 초기화
	public Test(String name) {
		this.name = name;
	}
	
	// setter : 초기화 or 변경
	public void setName(String name) {
		this.name = name;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	// Test 내부에서만 사용하는 메소드
	private void method() {
		
	}
}