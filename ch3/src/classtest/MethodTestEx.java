package classtest;

import java.util.Arrays;

public class MethodTestEx {
	public static void main(String[] args) { // 실행하면 JVM이 main 메소드를 가장 먼저 찾아 아래로 실행되게 함
		
		MethodTest1 obj = new MethodTest1();
		
		// sum() 호출
		System.out.println(obj.sum(5, 6));
		
		// method1() 호출
		char charValue = obj.method1();
		int intValue = charValue + 1;
		System.out.println(intValue);
		
		// divide1() 호출
		System.out.println(obj.divide1(8, 3));
		
		// array() 호출
		int array[] = {4, 5, 6, 7};
		int[] array2 = obj.array(array);
		System.out.println(Arrays.toString(array2));
		
	}
}