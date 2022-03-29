package array;

// 2차원 배열

public class ArrayEx9 {
	public static void main(String[] args) {
		
		int scores[][] = new int[3][3];
		
		scores[0][0] = 10;
		scores[0][1] = 20;
		scores[0][2] = 30;
		
		scores[1][0] = 40;
		scores[1][1] = 50;
		scores[1][2] = 60;
		
		scores[2][0] = 70;
		scores[2][1] = 80;
		scores[2][2] = 90;
		
		for(int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				System.out.print("[" + i + ", " + j + "] ");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		for(int i = 0; i < scores.length; i++) {
//			for (int j = 0; j < scores.length; j++) {
//				System.out.print(scores[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		for(int score[] : scores) { // 원소 하나씩 갖고 나오는 게 아니라 한 행 전체를 갖고 나오기 때문에 int score[]
			for(int i : score) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
		
	}
}