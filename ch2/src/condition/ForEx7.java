package condition;

// for문 중첩

public class ForEx7 {
	public static void main(String[] args) {
		
		// ① int i = 1;
		// ② i < 4;
		// ③ 내부 for 블럭 안으로 진입
		// ④ int j = 1;
		// ⑤ j < 4;
		// ⑥ for 블럭 안으로 진입 >> * 출력
		// ⑦ j++ >> j = 2;
		// ⑧ j < 4;
		// ⑨ for 블럭 안으로 진입 >> * 출력
		// ...
		// j++ >> j = 4
		// j < 4 >> false
		// 안쪽 for문 종료 후 println() 실행
		// i++ >> i = 2
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
