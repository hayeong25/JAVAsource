package basic;

public class PromotionEx2 {
	public static void main(String[] args) {
		
		byte b1 = 12;
		short s2 = 25;
		// short result = b1 + s2; int보다 작은 타입끼리 연산하는 경우 결과는 int
		int result = b1 + s2;
		System.out.println(result);
	}
}