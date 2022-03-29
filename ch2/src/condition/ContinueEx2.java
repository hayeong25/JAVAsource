package condition;

public class ContinueEx2 {
	public static void main(String[] args) {
		
		// 1 ~ 10 중에서 짝수만 출력 (continue 사용)
		for(int i = 1; i < 11; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 1 ~ 100 중에서 홀수의 합만 구해서 출력 (continue 사용)
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}	
		System.out.println("1 ~ 100 중에서 홀수의 합은 " + sum + "입니다.");
		
	}
}