package basic;

// int : 4byte (2^32)

public class IntVariable {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		
		// 변수 선언 후 나중에 값 대입해도 됨
		int var1; // 변수 선언
		var1 = 75; // 값 대입
		System.out.println("var1 = " + var1);
	}
}