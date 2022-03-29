package emp.dao;

import static emp.jdbc.JDBC.*;
import java.sql.*;
import java.util.*;
import emp.dto.DTO;

public class DAO {

	private Connection con;

/* --------------------- Connection 생성자 --------------------- */
	public DAO(Connection con) {
		super();
		this.con = con;
	}

/* ------------------------- 전체 사원 조회 ------------------------- */
	public List<DTO> getSelectAll() {
		List<DTO> list = new ArrayList<DTO>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String SQL = "SELECT * FROM emp";
		
		try {
			pstmt = con.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DTO dto = new DTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return list;
	}
	
/* ------------------------- 사원 조회 ------------------------- */
	public DTO getSelect(int empno) {
		DTO dto = new DTO();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String SQL = "SELECT * FROM emp WHERE empno = ?";
		
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setInt(1, empno);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return dto;
	}
	
/* ------------------------- 사원 추가 ------------------------- */
	public boolean getInsert(DTO dto) {
		PreparedStatement pstmt = null;
		
		String SQL = "INSERT INTO emp VALUES(?, ?, ?, ?, SYSDATE, ?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setString(3, dto.getJob());
			pstmt.setInt(4, dto.getMgr());
			pstmt.setInt(5, dto.getSal());
			pstmt.setInt(6, dto.getComm());
			pstmt.setInt(7, dto.getDeptno());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return false;
	}
	
/* ------------------------- 매니저 변경 ------------------------- */
	public boolean getUpdate(int empno, int mgr) {
		PreparedStatement pstmt = null;
		
		String SQL = "UPDATE emp SET mgr = ? WHERE empno = ?";
		
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setInt(1, mgr);
			pstmt.setInt(2, empno);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
/* ------------------------- 사원 삭제 ------------------------- */
	public boolean getDelete(int empno) {
		PreparedStatement pstmt = null;
		
		String SQL = "DELETE FROM emp WHERE empno = ?";
		
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setInt(1, empno);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}