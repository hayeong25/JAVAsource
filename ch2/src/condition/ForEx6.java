package condition;

public class ForEx6 {
	public static void main(String[] args) {
		
		// 1 ~ 100 중에서 3의 배수 더하기 (9의 배수는 제외)
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if((i % 3 == 0) && (i % 9 != 0)) {
				sum += i;
			}
		}
		System.out.println("1 ~ 100 중에서 9의 배수를 제외한 3의 배수의 합은 " + sum + "입니다.");
		
		// 1 ~ 100 중에서 3의 배수와 5의 배수의 총합
		sum = 0;
		for (int i = 1; i < 101; i++) {
			if((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
			}
		}
		System.out.println("1 ~ 100 중에서 3의 배수와 5의 배수의 합은 " + sum + "입니다.");
		
	}
}