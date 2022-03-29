package emp.action;

import java.util.Scanner;
import emp.console.Console;
import emp.service.SelectService;

public class SelectAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		// Service 객체 생성 및 호출
		SelectService service = new SelectService();
		
		// Console 객체 생성 및 호출
		Console console = new Console();
		
		// Console에서 사용자로부터 입력받은 값 = empno
		int empno = console.SelectEmpno(scanner);
		
		// Console.Show(SelectService.getList(DAO.getSelect(empno)));
		console.Show(service.getList(empno));
	}

}
