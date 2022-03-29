package emp.action;

import java.util.Scanner;
import emp.console.Console;
import emp.dto.DTO;
import emp.service.AddService;

public class AddAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		
		AddService service = new AddService();
		Console console = new Console();
		
		DTO dto = console.AddEmpno(scanner);
		
		if(service.Add(dto)) {
			console.printAddSuccessMesssage(dto);
		}else {
			console.printAddFailMesssage(dto);
		}
		
	}

}