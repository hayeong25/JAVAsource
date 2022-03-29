package condition;

// 반복문 - for / while / do ~ while

// 초기화 필수 - int i = 0;
// 조건식 - i < 10;
// 증감식 - i++;

/*
	초기화
	while(조건식) {
		실행할 문장
		증감식
	}
*/

public class WhileEx1 {
	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		
	}
}