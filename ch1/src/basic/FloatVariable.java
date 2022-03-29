package basic;

// 부동 소수점 방식 (허수 & 지수)

// 실수형 : float, double

// float : 4byte - 부호 비트 1bit, 지수 8bit, 허수 23bit

// Java는 소수점이 있으면 double로 인식

public class FloatVariable {
	public static void main(String[] args) {
		// float f1 = 90.17; // Type mismatch: cannot convert from double to float
		float f1 = 90.17f;
		System.out.println("f1 = " + f1);
	}
}