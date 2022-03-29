package emp.service;

import static emp.jdbc.JDBC.*;
import java.sql.Connection;

import emp.dao.DAO;
import emp.dto.DTO;

public class AddService {

	public boolean Add(DTO dto) {
		boolean isInsertSuccess = false;
		
		Connection con = getConnection();
		DAO dao = new DAO(con);
		
		boolean result = dao.getInsert(dto);
		
		if(result) {
			commit(con);
			isInsertSuccess = true;
		}else {
			rollback(con);
		}
		
		close(con);
		
		return isInsertSuccess;
	}
	
}