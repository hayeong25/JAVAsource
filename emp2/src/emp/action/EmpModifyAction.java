package emp.action;

import java.util.Scanner;
import emp.dto.EmpDTO;
import emp.service.EmpModifyService;
import emp.util.ConsoleUtil;

public class EmpModifyAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {

		// ConsoleUtil로 empno, mgr 입력받기
		ConsoleUtil util = new ConsoleUtil();
		EmpDTO updateDTO = util.getUpdateEmp(scanner);
		
		// Service 호출
		EmpModifyService service = new EmpModifyService();
		
		// ConsoleUtil로 입력받은 empno, mgr 담기
		boolean updateResult = service.modifyEmp(updateDTO.getEmpno(), updateDTO.getMgr());
		
		if(updateResult) {
			util.printUpdateSuccessMessage(updateDTO);
		}else {
			util.printUpdateFailMessage(updateDTO);
		}
	}

}