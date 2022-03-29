package basic;

// 변수 유효 범위 - 변수를 어디서 선언했느냐에 따라 미치는 범위가 다름
// {} : 블록 안에서 선언 - 선언된 블록 내에서만 사용 가능
// 클래스 내부에 선언

public class VariableScope1 {
	
	// 클래스 내부에 선언
	int age;
	
	public static void main(String[] args) {
		
		// 메소드 내부에서 선언
		// 지역변수(local variable)
		int v1 = 3;
		
		// 메소드 내부의 블록 안에서 선언
		{
			int age = 3;
			// int age = 4; Duplicate local variable age
			// 같은 블록 안에서 동일한 변수명 사용 불가
			v1 = age + 30;
			int v2 = 45;
			System.out.println("v2 = " + v2);
		}
		System.out.println("v1 = " + v1);
		// System.out.println("v2 = " + v2); v2가 선언된 블록 밖이므로 사용 불가
	}
	
	public static void print() {
		// System.out.println(age); age가 선언된 블록과는 다른 블록이므로 사용 불가
		
	}
}