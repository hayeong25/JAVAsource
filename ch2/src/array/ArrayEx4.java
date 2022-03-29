package array;

// 향상된 for문

/*
	for(매개변수 : 배열명) {
		실행할 문장
	}
*/

// 단순 출력시에는 향상된 for문이 편리

public class ArrayEx4 {
	public static void main(String[] args) {
		
		// char 배열
		char chArr[] = {'a', 'b', 'c', 'd', 'e'};
		
//		for(int i = 0; i < chArr.length; i++) {
//			System.out.println(chArr[i]);
//		}
		
		for(char ch : chArr) { // chArr 배열에서 차례로 하나씩 가져와서 ch라는 변수에 담아라
			System.out.println(ch);
		}
		
		System.out.print("System.out.println(chArr) : ");
		System.out.println(chArr); // println 했을 때 char 배열은 주소가 아닌 문자 자체가 나오도록 오버라이딩 되어있다
		
		System.out.println();
		
		// String 배열
		String str[] = {"a", "b", "c", "d", "e"};
		
//		for(int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//		}
		
		for(String st : str) { // str 배열에서 차례로 하나씩 가져와서 st라는 변수에 담아라
			System.out.println(st);
		}
		
		System.out.println("System.out.println(str) : " + str);
		
	}
}