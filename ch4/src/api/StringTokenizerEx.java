package api;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		
		// StringTokenizer : 띄어쓰기 기준으로 단어 자르기
		StringTokenizer st = new StringTokenizer("This is a test");
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + " ");
		}
		
		System.out.println();
		
		// StringTokenizer("문자열", "구분자") : 구분자를 기준으로 단어 자르기
		StringTokenizer st1 = new StringTokenizer("This/is/a/test", "/");
		while(st1.hasMoreTokens()) {
			System.out.print(st1.nextToken() + " ");
		}
		
		System.out.println();
		
		String exp = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer st2 = new StringTokenizer(exp, ",|");
	}
}