package condition;

import java.util.Scanner;

public class BreakContinueEx {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int menu = 0;
		
		while(true) {
			System.out.println("==================================================");
			System.out.println("1 : square");
			System.out.println("2 : square root");
			System.out.println("3 : log");
			System.out.println("1 ~ 3 중 원하는 메뉴를 선택해주세요. 0 선택시 프로그램 종료됩니다.");
			System.out.println("==================================================");

			
			menu = scanner.nextInt();
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			}else if(!((1 <= menu) && (menu <= 3))) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}
			
			System.out.printf("선택하신 메뉴는 %d번입니다\n", menu);
			
		}
		
	}
}