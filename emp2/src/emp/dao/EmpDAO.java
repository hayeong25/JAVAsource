package emp.dao;

import java.sql.*;
import java.util.*;
import java.util.Date;
import emp.dto.EmpDTO;
import static emp.dao.JdbcUtil.*; // static 클래스 import 해서 메소드 바로 사용

// CRUD 메소드 구현

public class EmpDAO {
	
	private Connection con;
	
/* ------------------------------ Connection 생성자 ------------------------------ */
	public EmpDAO(Connection con) {
		super();
		this.con = con;
	}

/* ---------------------------------- 전체 조회 ---------------------------------- */
	public List<EmpDTO> getList() {
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM exam_emp";

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				
				EmpDTO dto = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
            
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
   
/* ---------------------------------- 사원 조회 ---------------------------------- */
   public EmpDTO getRow(int empno) {
	   
	   PreparedStatement pstmt = null;
	   ResultSet rs = null;
	   EmpDTO dto = null;
	   String SQL = "SELECT empno, ename, job, hiredate, deptno FROM exam_emp WHERE empno = ?";
	   
	   try {
		   pstmt = con.prepareStatement(SQL);
		   pstmt.setInt(1, empno);
		   rs = pstmt.executeQuery();

		   if(rs.next()) {
				dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setHiredate(rs.getDate("hiredate"));
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
   
/* ---------------------------------- 정보 수정 ---------------------------------- */
   public boolean update(int empno, int mgr) {
	   
	   PreparedStatement pstmt = null;
	   String SQL = "UPDATE exam_emp SET mgr = ? WHERE empno = ?";
	   
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
	   } finally {
			close(pstmt);
	   }
	  
	   return false;
	}

/* ---------------------------------- 사원 삭제 ---------------------------------- */
   public boolean delete(int empno) {
	   
	   PreparedStatement pstmt = null;
	   String SQL = "DELETE FROM exam_emp WHERE empno = ?";
	   
	   try {
		   pstmt = con.prepareStatement(SQL);
		   pstmt.setInt(1, empno);
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

/* ---------------------------------- 사원 추가 ---------------------------------- */
   
   public boolean insert(EmpDTO insertDTO) {
	   
	   PreparedStatement pstmt = null;
	   String SQL = "INSERT INTO exam_emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(?, ?, ?, ?, SYSDATE, ?, ?, ?)";
	   
	   try {
		   pstmt = con.prepareStatement(SQL);
		   pstmt.setInt(1, insertDTO.getEmpno());
		   pstmt.setString(2, insertDTO.getEname());
		   pstmt.setString(3, insertDTO.getJob());
		   pstmt.setInt(4, insertDTO.getMgr());
		   pstmt.setInt(5, insertDTO.getSal());
		   pstmt.setInt(6, insertDTO.getComm());
		   pstmt.setInt(7, insertDTO.getDeptno());
		   
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
}