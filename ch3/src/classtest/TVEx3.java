package classtest;

import java.util.Arrays;

public class TVEx3 {
	public static void main(String[] args) {
		
		// TV 객체를 배열로 생성
		// 타입 배열명[] = new 타입[개수];
		TV tvArr[] = new TV[5];
		System.out.println(Arrays.toString(tvArr)); // 모두 null값
		System.out.println(tvArr[0].channel);
		// NullPointerException : 값이 null일 때 뜨는 에러
		
		// TV 객체 생성 후 배열에 담기
		// 배열 길이를 담은 변수를 사용하면 for문 돌 때 배열 길이 계속 확인할 필요 없음
		int length = tvArr.length;
		for(int i = 0; i < length; i++) {
			tvArr[i] = new TV(); // color, power, channel 등의 값이 담김
			tvArr[i].channel = 10 + i; // 각 객체마다 채널만 변경
		}
		
	}
}