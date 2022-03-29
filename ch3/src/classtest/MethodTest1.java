package classtest;

public class MethodTest1 {
	
	// true, false return하는 메소드 작성
	boolean isRedirect() {
		return false;
	}
	
	// 정수 2개 입력받아 합을 구해 return하는 메소드 작성
	int sum(int a, int b) {
		return a + b;
	}
	
	// 문자 하나 return
	char method1() {
		return 'c';
	}
	
	// 실수 2개 입력 받아 나누기 몫 return
	double divide1(double a, double b) {
		return a / b;
	}
	
	// 배열 입력받아 배열 return
	int[] array(int[] array) {
		array[0] = 8;
		return array;
	}
	
	// 문자열 return
	String method2() {
		return "Hello";
	}
}