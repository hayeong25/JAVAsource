package classtest;

/*
	클래스 ( 어떠한 내용들의 묶음을 틀로하여 여러 곳에서 사용이 가능하다 )
	객체 생성 및 실행
	
	Class명 변수명 = new Class명();
*/

public class StudentEx {
	public static void main(String[] args) {
		Student student1 = new Student(); // Heap 메모리에 생성
		
		// 객체 생성 후 초기화 작업 필요
		student1.studentId = 20220307;
		student1.studentName = "홍길동";
		student1.address = "서울시 OO구";
		student1.mobile = "010-1234-5678";
		
		// 메소드 실행
		student1.changeAddress();
		
		Student student2 = new Student();
		
		student2.studentId = 20220307;
		student2.studentName = "성춘향";
		student2.address = "광명시 OO동";
		student2.mobile = "010-5678-1234";
		
	}
}
