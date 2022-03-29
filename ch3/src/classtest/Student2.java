package classtest;

/*
	생성자 (Constructor) : 초기화 담당, 래퍼런스를 생성할 때 객체에 필요한 사전작업을 실행해준다.
	- 생성자는 여러 개 만들 수 있다. 단, 매개변수가 모두 달라야한다.(Type, 개수, 순서)
	- default 생성자 / 인자(매개변수)를 받는 생성자
	- overloading : 하나의 클래스에 동일한 이름으로 여러개의 메소드를 생성하는 것 (단, 매개변수가 모두 달라야 한다.)
	§ 매개변수 (arguments) 함수를 실행하는데 있어서 필요한 변수들을 메소드 실행전에 받아옴

	접근제한자 클래스명() { } ※ 반환값이 없음

	Overloading 의 이유
	- 객체마다 차이가 있을 수 있기 때문에
	
	JAVA 내부 클래스 확인 방법
	Ctrl + 클래스명 클릭 : Open Declaration
*/

public class Student2 {

	int studentId;
	String studentName;
	String address;
	String mobile;

	// default 생성자
	public Student2() {
		System.out.println("Student2 클래스의 Default 생성자 입니다.");
	}
	
	// 인자를 받는 생성자
	public Student2(String studentName, int studentId) {
		System.out.println("인자를 받는 Student2 객체 생성(1)");
		// this : 객체 자기자신 ex) this.studentId >> Student2 클래스의 studentId에 접근
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	// 똑같이 매개변수 2개 받지만, 순서가 달라 Overloading
	public Student2(int studentId, String studentName) {
		System.out.println("인자를 받는 Student2 객체 생성(1)");
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public Student2(int studentId, String studentName, String address) {
		System.out.println("인자를 받는 Student2 객체 생성(2)");
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}
	
	public Student2(int studentId, String studentName, String address, String mobile) {
		System.out.println("인자를 받는 Student2 객체 생성(3)");
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.mobile = mobile;
	}
	
	// 기능(동작) - 휴대폰 번호를 변경한다
	void changeMobile() {
		
	}
	
	// 기능(동작) - 주소를 변경한다
	void changeAddress() {
		
	}
	
}