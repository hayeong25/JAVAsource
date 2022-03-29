package emp.service;

import static emp.jdbc.JDBC.*;
import java.sql.Connection;
import emp.dao.DAO;

public class UpdateService {
	
	public boolean Update(int empno, int mgr) {
		boolean isUpdateSuccess = false;
		Connection con = getConnection();
		
		DAO dao = new DAO(con);
		
		if(dao.getUpdate(empno, mgr)) {
			commit(con);
			isUpdateSuccess = true;
		}else {
			rollback(con);
		}

		close(con);
		
		return isUpdateSuccess;
	}
	
}