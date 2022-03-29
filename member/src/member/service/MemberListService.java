package member.service;

import java.sql.Connection;
import java.util.List;
import static member.dao.JdbcUtil.*;
import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberListService {

	public List<MemberDTO> MemberList() {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		List<MemberDTO> list = dao.getList();
		
		// 비즈니스 로직이 SELECT라면 commit과 rollback은 안 함
		
		close(con);
		
		return list;
	}
	
}