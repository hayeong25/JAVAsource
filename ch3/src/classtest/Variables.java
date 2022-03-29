package classtest;

/*
	<변수의 종류>
	1. 클래스 변수
	2. 인스턴스 변수(멤버변수)
	>> 선언위치 : 클래스 영역
	   생성시기 : 클래스 변수 : 클래스가 메모리에 올라갈 때 생성
			   인스턴스 변수 : 인스턴스 객체 생성(new)되었을 때 생성
	3. 지역변수(로컬변수)
	>> 선언위치 : 메소드, 생성자 내부 인자, 초기화 블럭 내부
	   생성시기 : 변수 선언문이 실행될 때 생성
*/

public class Variables {
	
	int num; // 인스턴스 변수
	
	static int cv; // 클래스 변수
	
	void method() {
		int local = 0; // 지역변수
		System.out.println(local);
	}
	
}