package api;

// concat(문자열) - 문자열 연결

public class Concat {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = s1.concat(" World");
		
		System.out.println(s1); // Hello
		System.out.println(s2); // Hello World
		
	}
}