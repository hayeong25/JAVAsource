package classtest;

/*
	final : 최종적인
	무조건 초기화 필요 (수정 불가)
	생성자 내부에서 초기화 되거나 클래스 내부에서 초기화 되어야 함
	변수, 클래스(상속 금지), 메소드(오버라이딩 금지)에 사용
*/

public class Person {
	
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn; // 이 부분은 주석처리 하면 안 됨 (final 초기화 필수)
		this.name = name; // 이 부분은 주석처리 해도 되지만
	}
	
}