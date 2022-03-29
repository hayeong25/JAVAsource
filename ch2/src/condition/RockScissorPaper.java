package condition;

import java.util.Scanner;

// 컴퓨터와 가위바위보 게임

public class RockScissorPaper {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1(가위), 2(바위), 3(보) 중 하나를 입력하세요 : ");
		int user = scanner.nextInt();
		
		int com = (int)((Math.random() * 3) + 1);
		
//		if(user == 1) {
//			if(com == 1) {
//				System.out.println("비겼습니다.");
//			}else if(com == 2) {
//				System.out.println("컴퓨터가 이겼습니다.");
//			}else {
//				System.out.println("사용자가 이겼습니다.");
//			}
//		}else if(user == 2) {
//			if(com == 1) {
//				System.out.println("사용자가 이겼습니다.");
//			}else if(com == 2) {
//				System.out.println("비겼습니다.");
//			}else {
//				System.out.println("컴퓨터가 이겼습니다.");
//			}
//		}else {
//			if(com == 1) {
//				System.out.println("컴퓨터가 이겼습니다.");
//			}else if(com == 2) {
//				System.out.println("사용자가 이겼습니다.");
//			}else {
//				System.out.println("비겼습니다.");
//			}
//		}
		
		switch (user - com) {
		case -1: case 2:
			System.out.println("사용자가 졌습니다.");
			break;
		case -2: case 1:
			System.out.println("사용자가 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
		default:
			break;
		}
		
		scanner.close();
	}
}