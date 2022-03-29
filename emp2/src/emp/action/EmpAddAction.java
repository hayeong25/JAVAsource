package emp.action;

import java.util.Scanner;
import emp.dto.EmpDTO;
import emp.service.EmpAddService;
import emp.util.ConsoleUtil;

// 데이터 추가

public class EmpAddAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		
		ConsoleUtil util = new ConsoleUtil();
		EmpDTO insertDTO = util.getNewEmp(scanner);
		
		EmpAddService service = new EmpAddService();
		boolean insertResult = service.addEmp(insertDTO);
		
		if(insertResult) {
			util.printAddSuccessMessage(insertDTO);
		}else {
			util.printAddFailMessage(insertDTO);
		}
		
	}

}