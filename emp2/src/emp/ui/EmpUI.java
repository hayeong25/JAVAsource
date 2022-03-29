package emp.ui;

import java.util.*;
import emp.action.*;
import emp.controller.EmpController;

// Main 클래스

public class EmpUI {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		EmpController empController = new EmpController();
	      
		while(status) {
			System.out.println("─────────────────────────────────────────────────────");
			System.out.println("1 . Emp 전체 조회");
			System.out.println("2 . Emp 사원 조회");
			System.out.println("3 . Emp 사원 수정");
			System.out.println("4 . Emp 사원 탈퇴");
			System.out.println("5 . Emp 사원 추가");
			System.out.println("0 . 종료");
			System.out.println("─────────────────────────────────────────────────────");
			System.out.println();
			System.out.print("메뉴선택 >> ");
			int no = Integer.parseInt(scanner.nextLine());
			
			Action action = null;
			
			switch (no) {
			case 1:
				action = new EmpListAction();
				break;
			case 2:
				action = new EmpRowAction();
				break;
			case 3:
				action = new EmpModifyAction();
				break;
			case 4:
				action = new EmpRemoveAction();
				break;
			case 5:
				action = new EmpAddAction();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				status = false;
				break;
			default:
				break;
			}
			
			if(action != null) {
				empController.processRequest(action, scanner);
			}
			
		}
		
	}
}