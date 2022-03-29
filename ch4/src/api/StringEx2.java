package api;

public class StringEx2 {
	public static void main(String[] args) {
		
		// String 생성자
		String str1 = new String();
		System.out.println("str1 = " + str1);
		
		// 생성자에서 char 배열을 허용한다
		char chArr[] = {'a', 'b', 'c', 'd', 'e'};
		String str2 = new String(chArr);
		System.out.println("str2 = " + str2); // abcde로 연결되어 출력됨
		
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str3 = new String(bytes); // ASCII CODE로 변환되어 저장됨
		System.out.println("str3 = " + str3); // Hello Java
	}
}