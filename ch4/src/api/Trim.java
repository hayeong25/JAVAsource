package api;

// 프로그램에서는 공백도 하나의 문자로 인식
// trim() : 공백 제거

public class Trim {
	public static void main(String[] args) {
		
		String s = "     Hello World    !";
		String s1 = "Hello World!";
		
		System.out.println(s.equals(s1));
		System.out.println(s.trim().equals(s1));
		
		System.out.println(s);
		System.out.println(s.trim());
		
	}
}