package member.action;

import java.util.*;
import member.dto.MemberDTO;
import member.service.MemberListService;
import member.util.ConsoleUtil;

public class MemberListAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		
		// Service 호출
		MemberListService service = new MemberListService();
		List<MemberDTO> list = service.MemberList();
		
		// Service 호출 결과 화면 출력
		ConsoleUtil util = new ConsoleUtil();
		util.printListMessage(list);
		
	}

}