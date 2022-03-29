package emp.db2;

import java.sql.*;
import java.util.*;
import java.util.Date;

/*
   서비스 관리 업무

      C : INSERT
      R : SELECT
      U : UPDATE
      D : DELETE
      
   DAO(Data Access Object) : Database (CRUD) 작업 클래스
*/

public class EmpDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
   
/* ------------------------------- Connection 메소드 ------------------------------- */
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
         
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
   
/* ---------------------------------- 전체 조회 ---------------------------------- */
	public List<EmpDTO> getList() {
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		
		try {
			con = getConnection();
         
			String sql = "SELECT * FROM exam_emp";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			// rs 에 담긴 SQL 실행 결과를 List에 담아서 Reutrn
			while(rs.next()) {
				// 행의 각 Column을 가져와서 EmpDTO 객체로
//				EmpDTO dto = new EmpDTO();
//				dto.setEmpno(rs.getInt("empno"));
//				dto.setEname(rs.getString("ename"));
//				dto.setJob(rs.getString("job"));
//				dto.setMgr(rs.getInt("mgr"));
//				dto.setHiredate(rs.getDate("hiredate"));
//				dto.setSal(rs.getInt("sal"));
//				dto.setComm(rs.getInt("comm"));
//				dto.setDeptno(rs.getInt("deptno"));
            
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				EmpDTO dto = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
            
				// list에 추가
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
   
/* ---------------------------------- 사원 조회 ---------------------------------- */
   public EmpDTO getRow(int empno) {
	   
	   EmpDTO dto = null;
	   String SQL = "SELECT empno, ename, job, hiredate, deptno FROM exam_emp WHERE empno = ?";
	   
	   try {
		   con = getConnection();
		   pstmt = con.prepareStatement(SQL);
			
		   // ? 처리
		   pstmt.setInt(1, empno); // 1 : 첫 번째 물음표(?) 라는 의미
		   rs = pstmt.executeQuery();
			
		   if(rs.next()) {
//				empno = rs.getInt("empno");
//				String ename = rs.getString("ename");
//	            String job = rs.getString("job");
//	            Date hiredate = rs.getDate("hiredate");
//	            int deptno = rs.getInt("deptno");
//	            dto = new EmpDTO(empno, ename, job, hiredate, deptno);
				
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
			try {
				rs.close();
	            pstmt.close();
	            con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	   
	   return dto;
   }
   
/* ---------------------------------- 정보 수정 ---------------------------------- */
   public boolean update(int empno, int mgr) {
	   
	   String SQL = "UPDATE exam_emp SET mgr = ? WHERE empno = ?";
	   
	   try {
			con = getConnection();
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
		   try {
			   pstmt.close();
			   con.close();
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
	   }
	  
	   return false;
	}

/* ---------------------------------- 사원 삭제 ---------------------------------- */
   public boolean delete(int empno) {
	   
	   String SQL = "DELETE FROM exam_emp WHERE empno = ?";
	   
	   try {
			con = getConnection();
			pstmt = con.prepareStatement(SQL);
			pstmt.setInt(1, empno);
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				return true;
			}
	   } catch (Exception e) {
		   e.printStackTrace();
	   } finally {
		   try {
			   pstmt.close();
			   con.close();
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
	   }
	  
	   return false;
	   
   }

/* ---------------------------------- 사원 추가 ---------------------------------- */
//   public boolean insert(int empno, String ename, String job, int mgr, int sal, int comm, int deptno) {
//	   
//	   String SQL = "INSERT INTO exam_emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(?, ?, ?, ?, SYSDATE, ?, ?, ?)";
//	   
//	   try {
//		   con = getConnection();
//		   pstmt = con.prepareStatement(SQL);
//		   pstmt.setInt(1, empno);
//		   pstmt.setString(2, ename);
//		   pstmt.setString(3, job);
//		   pstmt.setInt(4, mgr);
//		   pstmt.setInt(5, sal);
//		   pstmt.setInt(6, comm);
//		   pstmt.setInt(7, deptno);
//		   
//		   int result = pstmt.executeUpdate();
//		   if(result > 0) {
//			   return true;
//		   }
//		   
//	   } catch (Exception e) {
//		   e.printStackTrace();
//	   } finally {
//		   try {
//			   pstmt.close();
//			   con.close();
//		   } catch (Exception e) {
//			   e.printStackTrace();
//		   }
//	   }
//	   
//	   return false;
//	   
//   }
   
   public boolean insert(EmpDTO insertDTO) {
	   
	   String SQL = "INSERT INTO exam_emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(?, ?, ?, ?, SYSDATE, ?, ?, ?)";
	   
	   try {
		   con = getConnection();
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
		   try {
			   pstmt.close();
			   con.close();
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
	   }
	   
	   return false;
	   
   }
}