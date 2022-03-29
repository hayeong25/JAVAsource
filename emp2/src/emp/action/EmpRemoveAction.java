package emp.action;

import java.util.Scanner;
import emp.dto.EmpDTO;
import emp.service.EmpRemoveService;
import emp.util.ConsoleUtil;

public class EmpRemoveAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		
		ConsoleUtil util = new ConsoleUtil();
		int empno = util.removeEmpno(scanner);
		
		EmpRemoveService service = new EmpRemoveService();
		boolean removeResult = service.empRemove(empno);
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(empno);
		
		if(removeResult) {
			util.printRemoveSuccessMessage(dto);
		}else {
			util.printRemoveFailMessage(dto);
		}
	}

}