package emp.action;

import java.util.Scanner;
import emp.dto.EmpDTO;
import emp.service.EmpRowService;
import emp.util.ConsoleUtil;

public class EmpRowAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		
		// Service 호출
		EmpRowService service = new EmpRowService();
		
		// 화면 출력 담당은 util
		ConsoleUtil util = new ConsoleUtil();
		int empno = util.printRowMessage(scanner);
		EmpDTO dto = service.getRow(empno);
		
		// 출력
		util.printEmpMessage(dto);
	}

}