package emp.service;

import static emp.jdbc.JDBC.*;
import java.sql.Connection;
import emp.dao.DAO;

public class DeleteService {
	
	public boolean Delete(int empno) {
		boolean isDeleteSuccess = false;
		
		Connection con = getConnection();
		DAO dao = new DAO(con);
		
		if(dao.getDelete(empno)) {
			commit(con);
			isDeleteSuccess = true;
		}else {
			rollback(con);
		}
		
		close(con);
		
		return isDeleteSuccess;
	}
	
}