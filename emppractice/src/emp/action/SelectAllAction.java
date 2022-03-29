package emp.action;

import java.util.List;
import java.util.Scanner;
import emp.console.Console;
import emp.dto.DTO;
import emp.service.SelectAllService;

/*
	사원 전체 조회는 List 객체에 담아서 return 할 것임
*/

public class SelectAllAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		// Service 객체 생성
		SelectAllService service = new SelectAllService();
		
		// Service는 DAO로부터 DB 결과값 가져옴 + List<DTO> 객체에 Service가 가져온 값 담기
		List<DTO> list = service.getListAll();
		
		Console console = new Console();
		console.ShowAll(list);
	}

}