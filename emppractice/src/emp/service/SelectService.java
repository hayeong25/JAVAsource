package emp.service;

import static emp.jdbc.JDBC.*;
import java.sql.*;
import emp.dao.DAO;
import emp.dto.DTO;

/*
	사용자로부터 입력받은 번호에 해당하는 사원 조회
*/

public class SelectService {
	
	public DTO getList(int empno) {
		Connection con = getConnection();
		
		DAO dao = new DAO(con);
		DTO dto = dao.getSelect(empno);
		
		close(con);
		
		return dto;
	}
	
}