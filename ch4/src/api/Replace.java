package api;

// replace(문자열1, 문자열2) :문자열1을 문자열2로 변경 
// String은 변하지 않음(immutable) >> 수정이나 변경이 아닌 다시 새로 선언해야 함 >> 효율이 떨어짐

public class Replace {
	public static void main(String[] args) {
		
		String str1 = "Hello Java";
		str1.replace("Java", "자바");
		
		System.out.println(str1.replace("Java", "자바")); // Hello 자바
		System.out.println(str1); // Hello Java >> 자바 변경 안 됨
		
		String str2 = "Hello";
		str2 += " 안녕하세요"; // 기존의 str2를 파괴하고 "안녕하세요"가 붙은 str2을 새로 만듦
		str2 += " 반갑습니다"; // 기존의 str2를 파괴하고 "반값습니다"가 붙은 str2을 새로 만듦
		str2 += " 감사합니다"; // 기존의 str2를 파괴하고 "감사합니다"가 붙은 str2을 새로 만듦
		str2 += " 안녕히가세요"; // 기존의 str2를 파괴하고 "안녕히가세요"가 붙은 str2을 새로 만듦
		System.out.println(str2);
		
		String str3 = str1.replace("Java", "자바");
		System.out.println(str3);
		
		String str4 = str1.replaceFirst("Java", "자바");
		System.out.println(str4);
		
	}
}