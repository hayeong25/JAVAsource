package emp.controller;

import java.util.Scanner;
import emp.action.Action;

/*
	Main UI에서 사용자가 원하는 Action을 받아와서
	해당 Action을 실행시켜줌(execute)
*/

public class Controller {

	// static이 없는 메소드 >> 객체 생성 후 사용 가능
	public void Request(Action action, Scanner scanner) {
		try {
			action.execute(scanner);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}