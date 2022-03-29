package emp.service;

import java.util.List;
import java.sql.Connection;
import static emp.dao.JdbcUtil.*;
import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

// ~~ Service : 실질적인 비즈니스 로직 처리

public class EmpListService {

	public List<EmpDTO> getEmpList() {
		
		Connection con = getConnection();
		
		// DAO 호출
		EmpDAO dao = new EmpDAO(con);
		
		List<EmpDTO> list = dao.getList();
		
		close(con);
		
		return list;
		
	}
	
}