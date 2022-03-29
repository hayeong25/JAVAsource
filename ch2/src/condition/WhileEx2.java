package condition;

public class WhileEx2 {
	public static void main(String[] args) {
		
		// 1부터 10까지의 합 구하기		
		int sum = 0;
		int i = 1;
		while(i < 11) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		// 1부터 100까지의 합 구하기
		sum = 0;
		i = 1;
		while(i < 101) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 100까지의 합은 " + sum + "입니다.");

	}
}