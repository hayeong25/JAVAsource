package member.controller;

import java.util.Scanner;
import member.action.Action;

public class MemberController {
	
	public void processRequest(Action action, Scanner scanner) {
		
		// Main에 쓰면 Action 클래스의 execute 메소드가 계속 중복 호출되기 때문에 Controller에서 한 번에 처리
		try {
			action.execute(scanner);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}