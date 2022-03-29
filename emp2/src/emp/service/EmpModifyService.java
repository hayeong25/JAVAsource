package emp.service;

import emp.dao.EmpDAO;
import static emp.dao.JdbcUtil.*;

import java.sql.Connection; 

public class EmpModifyService {

	public boolean modifyEmp(int empno, int mgr) {
		
		Connection con = getConnection();
		
		EmpDAO dao = new EmpDAO(con);
		
		boolean isModifySuccess = false;
		boolean modifyResult = dao.update(empno, mgr);
		
		if(modifyResult) {
			commit(con);
			isModifySuccess = true;
		}else {
			rollback(con);
		}
		
		return isModifySuccess;
	}
	
}