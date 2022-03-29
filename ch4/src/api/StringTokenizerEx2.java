package api;

import java.util.Scanner;
import java.util.StringTokenizer;

// 사용자로부터 문자열을 입력받아 구분해서 출력
// ex) 아빠/엄마/수연/철수/영희

public class StringTokenizerEx2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("단어들을 입력하세요. ex) 아빠/엄마/수연/철수/영희");
		System.out.print("입력 : ");
		StringTokenizer st = new StringTokenizer(scanner.nextLine(), "/");
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + " ");
		}
		
		scanner.close();
		
	}
}