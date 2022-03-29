package arrays;

import java.util.Arrays;

public class ArraysEqual {
	public static void main(String[] args) {
		
		int arr1[] = {10, 73, 2, -5, 42};
		int arr2[] = {10, 73, 2, -5, 41};
		
		// arr1과 arr2 요소 비교
		System.out.println(Arrays.equals(arr1, arr2) ? "배열 요소 같음" : "배열 요소 다름");
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}
}