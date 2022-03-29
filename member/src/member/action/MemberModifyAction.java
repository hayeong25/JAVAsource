package member.action;

import java.util.Scanner;
import member.service.MemberModifyService;
import member.util.ConsoleUtil;

public class MemberModifyAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		ConsoleUtil util = new ConsoleUtil();
		// 사용자에게 아이디 입력 받아오기
		int id = util.printModifyIdMessage(scanner);
		
		// 주소, 이메일 중 어떤 부분 수정할 것인지 사용자에게 질문 화면 제시
		int no = util.printModifyMessage(scanner);
		
		// 수정 내용을 사용자에게 입력 받는 화면 제시
		String input = util.printModifyValueMessage(scanner);
		
		MemberModifyService service = new MemberModifyService();
		boolean result = service.update(no, input, id);
		
		if(result) {
			util.printModifySuccessMessage();
		}else {
			util.printModifyFailMessage();
		}
	}

}