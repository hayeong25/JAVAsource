package api;

import java.util.Scanner;
import java.util.StringTokenizer;

// 사용자로부터 문자열을 입력받아 공백으로 분리된 어절이 몇 개인지 출력
// ex) 오늘은 화요일 입니다. >> 3
// exit 입력하면 반복문 종료

public class StringTokenizerEx3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("문장을 입력해주세요 : ");
			String str = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(str);
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("단어는 " + st.countTokens() + "개입니다.");
			}
		}
		
		scanner.close();
		
	}
}