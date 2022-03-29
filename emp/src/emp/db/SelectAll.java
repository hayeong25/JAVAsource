package emp.db;

import java.sql.*;

public class SelectAll {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				String SQL = "SELECT * FROM emp";
				pstmt = con.prepareStatement(SQL);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					int empno = rs.getInt(1);
					String ename = rs.getString(2);
					String job = rs.getString(3);
					int mgr = rs.getInt(4);
					String hiredate = rs.getString(5);
					int sal = rs.getInt(6);
					int comm = rs.getInt(7);
					int deptno = rs.getInt(8);
					
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d", empno, ename, job, mgr, hiredate, sal, comm, deptno);
					// System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getInt(4) + "\t\t" + rs.getString(5) + "\t\t" + rs.getInt(6) + "\t\t" + rs.getInt(7) + "\t\t" + rs.getInt(8));
				}
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
		
	}
}