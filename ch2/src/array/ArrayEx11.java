package array;

import java.util.Scanner;

// 단어 맞추기 게임

public class ArrayEx11 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String words[] = {"television", "computer", "mouse", "phone"};
		
		// euoms >> mouse 정답!
//		String word = "mouse";
//		char[] question = word.toCharArray();
//		
//		for(int i = 0; i < question.length; i++) {
//			System.out.print(question[i] + " ");
//		}
		
		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			for(int j = 0; j < question.length; j++) {
				int random = (int)(Math.random() * question.length);
				char temp = question[j];
				question[j] = question[random];
				question[random] = temp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요 : ", (i+1), new String(question));
			// new String(question) : char 배열을 String으로 객체 생성 (char 배열을 문자열로 만들어줌)
			String user = scanner.nextLine();
			if(user.equals(words[i])) {
				System.out.println("정답입니다!");
			}else {
				System.out.println("틀렸습니다.");
			}
			
		}
		
		scanner.close();
		
	}
}