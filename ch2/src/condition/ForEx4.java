package condition;

public class ForEx4 {
	public static void main(String[] args) {
		
		// 1 ~ 10 중에서 짝수만 출력
		System.out.println("1부터 10 중에서 짝수는");
//		for (int i = 2; i < 11; i+=2) {
//			System.out.print(i + " ");
//		}
		for (int i = 1; i < 11; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 1 ~ 10 중에서 홀수만 출력
		System.out.println("1부터 10 중에서 홀수는");
//		for (int i = 1; i < 11; i+=2) {
//			System.out.print(i + " ");
//		}
		for (int i = 1; i < 11; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 1 ~ 100 중에서 3의 배수만 출력
		System.out.println("1부터 100 중에서 3의 배수는");
//		for (int i = 3; i < 101; i+=3) {
//			System.out.print(i + " ");
//		}
		for (int i = 1; i < 11; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
	}
}