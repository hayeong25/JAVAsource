package array;

// 2차원 배열

public class ArrayEx10 {
	public static void main(String[] args) {
		
		int scores[][] = {
				{15, 25},
				{45, 55, 65},
				{75, 85, 95, 105}
		};
		
		for(int score[] : scores) {
			for(int i : score) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
		
	}
}