package emp.action;

import java.util.Scanner;
import emp.console.Console;
import emp.dto.DTO;
import emp.service.DeleteService;

public class DeleteAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		DeleteService service = new DeleteService();
		Console console = new Console();
		
		int empno = console.DeleteEmpno(scanner);
		DTO dto = new DTO();
		dto.setEmpno(empno);
		
		if(service.Delete(empno)) {
			console.printDeleteSuccessMessage(dto);
		}else {
			console.printDeleteFailMessage(dto);
		}
		
	}

}