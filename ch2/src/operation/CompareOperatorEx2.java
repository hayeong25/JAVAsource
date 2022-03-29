package operation;

// Scanner, String과 같이 대문자로 시작하면

public class CompareOperatorEx2 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1 + " == " + str2 + " : " + (str1 == str2));
		System.out.println(str1 + " == " + str3 + " : " + (str1 == str3)); // 같은 객체가 아니기 때문에 false
		
		System.out.println(str1 + " == " + str2 + " : " + (str1.equals(str2))); // 객체가 갖고 있는 값이 동일하기에 true
		System.out.println(str1 + " == " + str3 + " : " + (str1.equals(str3)));
		
		// https://brunch.co.kr/@mystoryg/132
	}
}