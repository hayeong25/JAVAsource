package condition;

// Math.Random() : 0.0 <= random < 1.0 난수

// 주사위 프로그램

public class IfEx6 {
	public static void main(String[] args) {
		
		int dice = (int)(Math.random() * 6 + 1);
		
		if(dice == 1) {
			System.out.println("주사위 1번");
		}else if(dice == 2) {
			System.out.println("주사위 2번");
		}else if(dice == 3) {
			System.out.println("주사위 3번");
		}else if(dice == 4) {
			System.out.println("주사위 4번");
		}else if(dice == 5) {
			System.out.println("주사위 5번");
		}else {
			System.out.println("주사위 6번");
		}
		
	}
}