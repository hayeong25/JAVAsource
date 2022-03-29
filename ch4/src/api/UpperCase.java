package api;

// toUpperCase() : 모든 문자를 대문자로 변경
// toLowerCase() : 모든 문자를 소문자로 변경

public class UpperCase {
	public static void main(String[] args) {
		
		String str1 = "Hello";
		
		String str2 = str1.toUpperCase();
		String str3 = str1.toLowerCase();
		
		System.out.println(str2);
		System.out.println(str3);
	}
}