package emp.service;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;
import java.sql.*;
import static emp.dao.JdbcUtil.*;

// DB 작업 클래스

public class EmpAddService {
	
	// DTO 불러오기
	public boolean addEmp(EmpDTO newEmp) throws Exception {
		
		boolean isAddSuccess = false;
		
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		boolean result = dao.insert(newEmp);
		
		// 개발자가 직접 트랜잭션 관리
		if(result) {
			commit(con);
			isAddSuccess = true;
		}else {
			rollback(con);
		}
		
		close(con);
		
		return isAddSuccess;
	}
	
}