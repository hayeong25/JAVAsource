package emp.action;

import java.util.List;
import java.util.Scanner;
import emp.dto.EmpDTO;
import emp.service.EmpListService;
import emp.util.ConsoleUtil;

// ~~Action : 각 요청을 실질적으로 처리하는 클래스

public class EmpListAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		
		// Service 객체 생성 및 호출
		EmpListService service = new EmpListService();
		List<EmpDTO> list = service.getEmpList();
		
		ConsoleUtil util = new ConsoleUtil();
		util.printEmpList(list);
		
	}

}