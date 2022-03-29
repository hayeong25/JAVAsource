package api;

// 문자열 거꾸로 출력하기

public class Reverse {
	public static void main(String[] args) {
		
		String str = "ABzquartK";
		
		// 방법 1
		char ch[] = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt((str.length()-1) - i);
		}
		System.out.println(ch);
		
		// 방법 2
//		for(int i = str.length()-1; i >= 0; i--) {
//			System.out.print(str.charAt(i) + " ");
//		}
		
		// 방법 3
//		char[] chArr = str.toCharArray();
//		for(int i = str.length()-1; i >= 0; i--) {
//			System.out.print(chArr[i] + " ");
//		}
		
		// 방법 4
//		StringBuilder sb = new StringBuilder(str);
//		sb.reverse();
//		str = new String(sb);
//		System.out.println(str);
		
	}
}