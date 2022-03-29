package basic;

// double : 8byte - 부호 비트 1bit, 지수 11bit, 허수 52bit
// 같은 실수형이지만 double이 float보다 더 정밀하게 표현 가능

public class DoubleVariable {
	public static void main(String[] args) {
		double d1 = 90.17f;
		double d2 = 100.123d;
		System.out.println("d1 = " + d1 + ", d2 = " + d2);
	}
}