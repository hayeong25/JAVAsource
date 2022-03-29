package basic;

// 강제 형변환(Casting) : 컴파일 오류와 관련 - "작은 크기 타입 = (작은 크기 타입)큰 크기 타입"
// 강제 형변환으로 인해 원래의 값이 손실될 수 있음. 원래 값 기억 못 함 (int 1034 > byte 10)

public class CastingEx1 {
	public static void main(String[] args) {
		int intValue = 1034;
		// byte byteValue = intValue; int에서 byte로 자동 형변환 불가
		byte byteValue = (byte)intValue;
		System.out.println("intValue = " + intValue);
		System.out.println("byteValue = " + byteValue);
		
		int num1 = 123456789;
		double num2 = num1; // 자동 형변환
		// int num3 = num2; double에서 int로 자동 형변환 불가
		int num3 = (int)num2;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
	}
}