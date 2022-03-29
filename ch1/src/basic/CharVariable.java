package basic;

// 문자형 : char, String

// 문자 인코딩 : 컴퓨터 내부에서 문자를 표현하기 위한 문자 코드 set
// 문자 디코딩 : 비트를 문자로 변환
// ASCII code : 기본 문자 인코딩 방식 (A 65 / a 97)
// 유니코드 : 각 나라별 표준 인코딩 (UTF-8)
//         1byte는 ASCII code값과 호환

public class CharVariable {
	public static void main(String[] args) {
		char ch1 = 'A';
		// char ch2 = 'AB'; // Invalid character constant
		System.out.println("ch1 = " + ch1);
		
		char ch3 = 65; // ASCII code 값
		System.out.println("ch3 = " + ch3);
		
		String str1 = "A";
		String str2 = "ABCDE";
		System.out.println("str1 = " + str1 + ", str2 = " + str2);
	}
}