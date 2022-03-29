package emp.ui;

import java.util.Scanner;
import emp.action.*;
import emp.controller.Controller;

/*
	사용자 >> Controller >> Action >> Service(+Console) >> DAO >> Service >> Action >> Console

	DAO 클래스
	1. JDBC가 연결해준 Connection을 바탕으로 DB 쿼리 연산 작업
	2. DAO 메소드를 호출하는 Service로 DB 작업 결과를 보내줌
	
	Main 클래스
	1. 사용자가 메뉴 선택
	2. 해당 Action 객체 생성
	3. 해당 Action이 null이 아닐 경우 Controller가 해당 Action 호출(연결)해줌
	4. 호출된 Action은 DAO 연산값을 가지고 오는 Service와 Console창에 메시지 나오게 하는 Console 호출
	5. Console에서 사용자 입력값을 받아야 하는 경우 그 값을 DTO 객체 생성 후 담아 Service로 보냄
	6. Service는 Connection 가져와서 해당 연산 DAO 메소드를 호출 >> DAO가 DB 연산 후 결과값 return >> DAO가 가져다준 값을 가지고 자신을 호출한 Action으로 return
	7. Service의 return 값을 받은 Action은 Console의 print message 메소드 호출
	8. 최종 결과가 Console에 출력되어 사용자가 볼 수 있게 됨
*/

public class UI {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		Controller controller = new Controller();
		
		while(flag) {
			System.out.println("==================================");
			System.out.println("1. 전체 사원 목록");
			System.out.println("2. 사원 조회");
			System.out.println("3. 사원 추가");
			System.out.println("4. 매니저 변경");
			System.out.println("5. 사원 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println("==================================");
			System.out.print("메뉴 선택 >> ");
			int number = Integer.parseInt(scanner.nextLine());
			
			Action action = null;
			switch (number) {
			case 1:
				action = new SelectAllAction();
				break;
			case 2:
				action = new SelectAction();
				break;
			case 3:
				action = new AddAction();
				break;
			case 4:
				action = new UpdateAction();
				break;
			case 5:
				action = new DeleteAction();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			}
			
			if(action != null) {
				controller.Request(action, scanner);
			}
		}
		
	}
}