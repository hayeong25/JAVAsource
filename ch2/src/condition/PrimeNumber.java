package condition;

// 1 ~ 100 중에서 소수 구하기

public class PrimeNumber {
	public static void main(String[] args) {
		
		for (int i = 1; i < 101; i++) {
			int count = 0;
			
			for (int j = 1; j <= i; j++) { // j는 i를 넘어가지 않도록 설정해야 한다
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(i + " ");
			}
		}
		
	}
}