package array;

import java.util.Arrays;

// 1 ~ 45 카드 뒤섞기

public class ArrayEx7 {
	public static void main(String[] args) {
		
		int card[] = new int[45];
		
		for(int i = 0; i < card.length; i++) {
			card[i] = i + 1;
		}
		
		System.out.println("뒤섞기 전 : " + Arrays.toString(card));
		
		for(int i = 0; i < card.length; i++) {
			int pos = (int)(Math.random() * 45); // card[] 인덱스는 0 ~ 44이므로 random 값도 0<=random<44 로 만들어주어야 한다
			int temp = card[i];
			card[i] = card[pos];
			card[pos] = temp;
		}
		
		System.out.println("뒤섞은 후 : " + Arrays.toString(card));
		
	}
}