package exam;

public class TestEx {
	public static void main(String[] args) {
		
		Test test = new Test("홍길동");
		// test.name = "홍길동"; >> private 변수 값 설정 불가
		// System.out.println(test.name); >> private 변수 값 불러오기 불가
		
	}
}