package array;

public class ArrayEx3 {
	public static void main(String[] args) {
		
		// score 배열에 5개의 int 값 (0, 10, 20, 30, 40) 담기
		int score[] = new int[5];
		
		for(int i = 0; i < score.length; i++) { // score.length == 5
			score[i] = i * 10;
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		// 배열 원소들의 평균과 합계 구하기
		int score2[] = {48, 78, 25, 65, 36, 79};
		int sum = 0;
		
		for(int i = 0; i < score2.length; i++) {
			sum += score2[i];
		}
		
		System.out.println("score2의 합계는 " + sum + "이고, 평균은 " + sum / score2.length + "입니다.");
		
	}
}