package member.service;

import java.sql.Connection;
import member.dao.MemberDAO;
import member.dto.MemberDTO;
import static member.dao.JdbcUtil.*;

public class MemberAddService {
	
	public boolean insertMember(MemberDTO insertDTO) {
		boolean isAddSuccess = false;
		
		Connection con = getConnection();
		
		// 비즈니스 로직 처리 >> DB 테이블에 Member 추가
		MemberDAO dao = new MemberDAO(con);
		
		if(dao.insert(insertDTO)) {
			isAddSuccess = true;
			commit(con);
		}else {
			rollback(con);
		}
		
		return isAddSuccess;
	}
	
}