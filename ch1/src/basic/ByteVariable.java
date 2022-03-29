package basic;

// Class명이 2개 이상의 단어로 이루어진 경우 각 시작은 대문자로

// 변수 : 메모리 저장공간 (무엇을 담을 것이냐에 따라 타입 지정)
//     - 정수형(숫자의 크기에 따라 메모리 차지 공간 달라짐), 문자형, 실수형, 논리형

// 정수형 : byte, short, int, long

// bit : 0 or 1
// byte : 8bit (2^8)
//       - 음수 & 양수 표현 : -127 ~ 127

public class ByteVariable {
	public static void main(String[] args) {		
		// 타입 변수명 = 값;
		byte b1 = 3; // local variable b1 is not used
		System.out.println(b1);
		
		byte b2 = -128;
		// byte b3 = 128; // Type mismatch: cannot convert from int to byte
		byte b3 = 127;
		
		System.out.println("b2 = " + b2 + ", b3 = " + b3);
	}
}