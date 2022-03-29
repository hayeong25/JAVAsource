package condition;

public class ForEx3 {
	public static void main(String[] args) {
		
		// 1부터 10까지의 합 구하기		
		int sum = 0;
		
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		
		// System.out.println(i); i는 지역변수이므로 for문 밖에서 사용할 수 없다
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		// 1부터 100까지의 합 구하기
		sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		
		System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
		
	}
}