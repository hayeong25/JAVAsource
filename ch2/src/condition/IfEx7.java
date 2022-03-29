package condition;

import java.util.Scanner;

// 점수를 입력받아 학점 계산하기

public class IfEx7 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int score = scanner.nextInt();
		
		char grade;
		char opt = ' ';
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			}else {
				opt = '-';
			}
		}else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			}else {
				opt = '-';
			}
		}else {
			grade = 'C';
		}
		
		System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);
		// System.out.println("당신의 학점은 " + grade + opt + "입니다.");
		
		scanner.close();
		
	}
}
