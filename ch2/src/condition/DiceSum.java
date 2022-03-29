package condition;

// while문과 Math.random()을 사용해 주사위 2개를 던졌을 때 나오는 값을 (값1, 값2) 형태로 출력
// 값1 + 값2의 합이 5가 아니면 계속 주사위를 던지고, 합이 5인 경우 실행을 멈추는 프로그램 작성

public class DiceSum {
	public static void main(String[] args) {
		
		System.out.println("주사위 2개를 던져 눈의 합이 5가 되면 프로그램을 종료합니다.");
		System.out.println();
		
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			
			System.out.printf("(%d, %d)\n", dice1, dice2);
			System.out.println(dice1 + " + " + dice2 + " = " + (dice1 + dice2));
			System.out.println("==========");
			
			if(dice1 + dice2 == 5) {
				break;
			}
		}
		
	}
}