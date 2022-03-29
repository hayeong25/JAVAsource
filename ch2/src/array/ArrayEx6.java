package array;

import java.util.Arrays;

// 10명의 점수를 배열로 생성하고 최대값, 최소값 출력

public class ArrayEx6 {
	public static void main(String[] args) {
		
		int score[] = {79, 88, 91, 33, 100, 55, 95, 45, 48, 82};
		int min = score[0];
		int max = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(min > score[i]) {
				min = score[i];
			}
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		System.out.print(Arrays.toString(score) + " 중에서 ");
		System.out.println("가장 높은 점수는 " + max + ", 가장 낮은 점수는 " + min + "입니다.");
		
	}
}