package condition;

// break : 반복문 수행 중지
/*
	while(조건) {
		while(조건) {
			
			break; >> 내부 반복문만 빠져나가는 것
			
		}
	}
*/

public class BreakEx2 {
	public static void main(String[] args) {
		
		while(true) {
			int dice = (int)(Math.random() * 6) + 1;
			if(dice == 6) {
				System.out.println("6이 나왔습니다. 프로그램을 종료합니다.");
				break;
			}else {
				System.out.println(dice);
			}
		}
		
	}
}