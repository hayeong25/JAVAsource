package emp.service;

import static emp.jdbc.JDBC.*;
import java.sql.Connection;
import java.util.List;
import emp.dao.DAO;
import emp.dto.DTO;

/*
	전체 조회 Service
*/

public class SelectAllService {

	public List<DTO> getListAll() {
		
		Connection con = getConnection();
		
		DAO dao = new DAO(con);
		
		List<DTO> list = dao.getSelectAll();
		
		close(con);
		
		return list;
	}

}