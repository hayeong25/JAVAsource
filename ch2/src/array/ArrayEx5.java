package array;

import java.util.Arrays;

// heap 주소값이 아닌 기본 모양으로 값을 출력하려면 Arrays.toString()
// for문을 사용하지 않고도 배열 요소 값 출력 가능

public class ArrayEx5 {
	public static void main(String[] args) {
		
		int iArr[] = {1, 2, 3, 4, 5};
		String strArr[] = {"abc", "cde", "spring"};
		
		System.out.println("System.out.println(iArr) : " + iArr);
		System.out.println("System.out.println(Arrays.toString(iArr) : " + Arrays.toString(iArr));
		
		System.out.println();
		
		System.out.println("System.out.println(iArr) : " + strArr);
		System.out.println("System.out.println(Arrays.toString(iArr) : " + Arrays.toString(strArr));
		
	}
}