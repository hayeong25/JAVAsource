package member.ui;

import java.util.Scanner;

import member.action.*;
import member.controller.MemberController;

public class MemberMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean isStop = false;
		MemberController controller = new MemberController();
		
		do {
			System.out.println("============= 회원 관리 프로그램 =============");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 목록");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println();
			System.out.print("메뉴 선택 >> ");
			
			int menu = Integer.parseInt(scanner.nextLine());
			
			Action action = null;
			switch (menu) {
			case 1:
				action = new MemberAddAction();
				break;
			case 2:
				action = new MemberListAction();
				break;
			case 3:
				action = new MemberModifyAction();
				break;
			case 4:
				action = new MemberRemoveAction();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				isStop = true;
				break;
			default:
				break;
			}
			
			if(action != null) {
				controller.processRequest(action, scanner);
			}
			
		} while(!isStop);
		
	}
}