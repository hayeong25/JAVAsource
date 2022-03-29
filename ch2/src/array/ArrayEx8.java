package array;

import java.util.Arrays;

public class ArrayEx8 {
	public static void main(String[] args) {
		
		// oldArray의 값을 newArray에 복사
		int oldArray[] = {10, 20, 30};
		int newArray[] = new int[4];
		
		for(int i = 0; i < oldArray.length; i++) { // oldArray 인덱스 값이 더 작으므로 oldArray 길이를 기준으로 해야 한다
			newArray[i] = oldArray[i];
		}
		
		System.out.println(Arrays.toString(newArray));
		
	}
}