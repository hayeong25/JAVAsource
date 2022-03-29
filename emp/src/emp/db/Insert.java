package emp.db;

import java.sql.*;

public class Insert {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			 
			con = DriverManager.getConnection(url, user, password);
			 
			if(con != null) {
				String sql = "INSERT INTO exam_emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7209, 'TEST_USER9', 'MANAGER', 7201, '2016-03-10', 1400, NULL, 80)";
				pstmt = con.prepareStatement(sql);
				
				if(pstmt.executeUpdate() != -1) {
					System.out.println("Success !");
				}
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
	}
}