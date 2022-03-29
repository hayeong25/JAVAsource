package emp.action;

import java.util.Scanner;
import emp.console.Console;
import emp.dto.DTO;
import emp.service.UpdateService;

public class UpdateAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		UpdateService service = new UpdateService();
		Console console = new Console();
		
		DTO dto = console.UpdateEmpno(scanner);
		
		if(service.Update(dto.getEmpno(), dto.getMgr())) {
			console.printUpdateSuccessMessage(dto);
		}else {
			console.printUpdateFailMessage(dto);
		}
	}

}