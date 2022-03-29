package emp.db;

import java.sql.*;

public class Select {
	public static void main(String[] args) {
		
		// DB 서버와 연결
		Connection con = null; // 커넥션
		PreparedStatement pstmt = null; // SQL 쿼리문 전송
		ResultSet rs = null; // SELECT 쿼리문 결과를 담는 객체
		
		try {
			// Driver Load
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				String sql = "SELECT * FROM emp WHERE empno = 7369";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery(); // 쿼리문 실행 + 실행 결과 rs에 담기
				
				// rs에 담긴 결과 출력
				if(rs.next()) { // ResultSet에 결과가 담겨있는지 확인
					// 컬럼 하나씩 가져오기
					// getInt("컬럼명") 또는 getInt(index)
					int empno = rs.getInt("empno");
					String ename = rs.getString("ename");
					String job = rs.getString("job");
					int mgr = rs.getInt("mgr");
					String hiredate = rs.getString("hiredate");
					int sal = rs.getInt("sal");
					int comm = rs.getInt("comm");
					int deptno = rs.getInt("deptno");
					
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d", empno, ename, job, mgr, hiredate, sal, comm, deptno);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
	}
}