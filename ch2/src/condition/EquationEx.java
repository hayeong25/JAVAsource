package condition;

// 4x + 5y = 60의 해 구하기
// x, y는 10 이하의 자연수

public class EquationEx {
	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				if((4 * i) + (5 * j) == 60) {
					System.out.println("x = " + i + ", y = " + j);
				}
			}
		}
		
	}
}