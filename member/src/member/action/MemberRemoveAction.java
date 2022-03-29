package member.action;

import java.util.Scanner;

import member.service.MemberRemoveService;
import member.util.ConsoleUtil;

public class MemberRemoveAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		ConsoleUtil util = new ConsoleUtil();
		
		// 사용자에게 ID 입력 받아오기
		int id = util.printRemoveIdMessage(scanner);
		
		// Service 호출
		MemberRemoveService service = new MemberRemoveService();
		boolean result = service.remove(id);
		
		if(result) {
			util.printRemoveSuccessMessage();
		}else {
			util.printRemoveFailMessage();
		}
		
	}

}