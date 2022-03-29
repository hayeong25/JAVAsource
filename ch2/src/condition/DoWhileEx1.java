package condition;

import java.util.Scanner;

// 1 ~ 100 사이의 임의의 숫자 맞히기

/*
	do {
		수행할 문장 (무조건 한 번 실행)
	} while(조건);
*/

// for, while과 do ~ while 차이점 : 조건이 맞는지 나중에 검사함
// do ~ while은 무조건 한 번은 실행됨

public class DoWhileEx1 {
	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.print("1 ~ 100 사이의 정수를 입력하세요 : ");
			input = scanner.nextInt();
			
			if(answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else if(answer == input) {
				System.out.println("정답입니다!");
			}else {
				System.out.println("더 큰 수를 입력하세요.");
			}
		}while(input != answer);
		
		System.out.println("프로그램을 종료합니다.");
		
		scanner.close();
	}
}