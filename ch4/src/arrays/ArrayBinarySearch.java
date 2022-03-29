package arrays;

import java.util.Arrays;

// 이진 검색 : 현존하는 검색 방식 중 가장 빠른 검색 방식

public class ArrayBinarySearch {
	public static void main(String[] args) {
		
		int arr[] = {11, 13, 25, 27, 36, 45, 65};
		
		System.out.println(Arrays.binarySearch(arr, 40)); // arr에서 40을 찾고자 함
		System.out.println(Arrays.binarySearch(arr, 36)); // arr에서 40을 찾고자 함
		
	}
}