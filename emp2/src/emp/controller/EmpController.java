package emp.controller;

import java.util.Scanner;
import emp.action.Action;

public class EmpController {
	
	public void processRequest(Action action, Scanner scanner) {
		try {
			action.execute(scanner);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}