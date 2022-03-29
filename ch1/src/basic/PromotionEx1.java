package basic;

// 자동 형변환(Promotion) : "큰 크기 타입 = 작은 크기 타입"

// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)

public class PromotionEx1 {
	public static void main(String[] args) {
		byte byteValue = 10;
		
		int intValue = byteValue; // byte에서 int로 자동 형변환
		System.out.println(intValue);
		
		char charValue = 'A';
		intValue = charValue; // char에서 int로 자동 형변환
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue; // int에서 long으로 자동 형변환
		System.out.println(longValue);
		
		float floatValue = intValue; // int에서 float으로 자동 형변환
		System.out.println(floatValue);
		
		floatValue = 35.2f;
		double doubleValue = floatValue; // float에서 double로 자동 형변환
		System.out.println(doubleValue);
		
		int v1 = 10;
		double d1 = 5.5;
		double d2 = v1 + d1; // 두 타입이 서로 다를 경우 산술연산은 큰 타입을 따라감
		// int d3 = v1 + d1;
		System.out.println("d2 = " + d2);
	}
}