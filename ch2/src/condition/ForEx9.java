package condition;

// 구구단 출력하기

public class ForEx9 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\t ", i, j, (i*j));
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\t ", j, i, (i*j));
			}
			System.out.println();
		}
		
	}
}