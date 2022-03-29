package api;

/*
	문자열 만드는 방법 (두 방법은 메모리 상에서 차이가 있음)
	- 문자열 리터럴 지정
	- String 클래스 생성자 이용
*/

public class StringEx1 {
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		// "Hello"가 담긴 주소를 str1도 가리키고 str2도 가리키고 있음
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println(str1 == str2); // true (같은 주소를 가리키고 있다고 리터럴 인식)
		System.out.println(str3 == str4); // false (new로 객체 생성 시 각각 서로 다른 주소가 생성되므로 false)
		// 따라서, 문자열 자체를 비교할 때는 == 이 아닌 equals 사용
		
	}
}