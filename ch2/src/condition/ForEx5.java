package condition;

// 구구단 출력하기

//3 * 1 = 3   3 * 2 = 6  3 * 3 = 9 ...

// 3 * 1 = 3
// 3 * 2 = 6
// ...

public class ForEx5 {
	public static void main(String[] args) {
		
		//2단
		for(int i = 1; i < 10; i++) {
			System.out.printf("2 * %d = %d\t", i, (2 * i));
		}
		
		System.out.println();
		
		// 3단
		for(int i = 1; i < 10; i++) {
			System.out.printf("3 * %d = %d\n", i, (3 * i));
		}
		
	}
}