package operation;

// 증감 연산자는 앞, 뒤 모두 올 수 있음

public class IncreaseDecreaseOperationEx2 {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		// 대입 연산자와 같이 사용되는 경우 증감 연산자가 앞에 있을 때 증감 후 대입
		int result1 = ++x + 20;
		System.out.println("++x + 20 = " + result1); // 22
		int result2 = --y + 20;
		System.out.println("--y + 20 = " + result2); // 20
		
		// 대입 연산자와 같이 사용되는 경우 증감 연산자가 뒤에 있을 때 대입 후 증감
		// 1. x + 20
		// 2. 대입 연산자(=) 실행 >> 결과 21
		// 3. x++
		int result3 = x++ + 20;
		System.out.println("x++ + 20 = " + result3); // 21
		int result4 = y-- + 20;
		System.out.println("y-- + 20 = " + result4); // 21
	}
}