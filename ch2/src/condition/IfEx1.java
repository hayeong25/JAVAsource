package condition;

// 조건문 : 주어진 조건에 따라 다른 문장을 선택할 수 있게 함

/*
	if(조건식) {
		수행할 문장;
	}
*/

public class IfEx1 {
	public static void main(String[] args) {
		
		int num = 10;
		
		if(num == 0) // if 수행할 문장이 1줄인 경우 대괄호 생략 가능
			System.out.println(num + "은 0입니다.");
		if(num != 0) {
			System.out.println(num + "은 0이 아닙니다.");
		}
		
	}
}