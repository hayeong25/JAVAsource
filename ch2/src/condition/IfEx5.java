package condition;

import java.util.Scanner;

// 조건이 여러 개인 경우

/*
	if(조건문) {
		수행할 문장
	}else if(조건문) {
		수행할 문장
	}else if(조건문) {
		수행할 문장
	}else {
		수행할 문장
	}
*/

public class IfEx5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int score = scanner.nextInt();
		
		if(score >= 90) {
			System.out.println("A입니다.");
		}else if(score >= 80) {
			System.out.println("B입니다.");
		}else if(score >= 70) {
			System.out.println("C입니다.");
		}else if(score >= 60) {
			System.out.println("D입니다.");
		}else {
			System.out.println("F입니다.");
		}
		
		scanner.close();
	}
}