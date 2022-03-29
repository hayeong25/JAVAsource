package basic;

// short : 2byte (2^16)
//        - 음수 & 양수 표현 : -32768 ~ 32767

public class ShortVariable {
	public static void main(String[] args) {
		short s1 = 200;
		s1 = 350; // 변수에 담은 값은 변경 가능
		System.out.println("s1 = " + s1); // + :연결
		
		byte b1 = 12;
		short s2 = 25;
		System.out.println(b1 + s2); // + : 산술연산
	}
}