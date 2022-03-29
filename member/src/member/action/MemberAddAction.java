package member.action;

import java.util.Scanner;

import member.dto.MemberDTO;
import member.service.MemberAddService;
import member.util.ConsoleUtil;

public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {

		// 사용자에게 입력화면 제시
		// 화면 제시 역할은 Console
		ConsoleUtil util = new ConsoleUtil();
		MemberDTO insertDTO = util.getNewMember(scanner);
		
		// 입력값을 받아서 Service로 전송
		MemberAddService service = new MemberAddService();
		boolean result = service.insertMember(insertDTO);
		
		// Service의 처리 결과를 화면으로 제시
		if(result) {
			util.printAddSuccessMessage(insertDTO);
		}else {
			util.printAddFailMessage(insertDTO);
		}
		
	}

}