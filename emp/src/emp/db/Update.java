package emp.db;

import java.sql.*;

public class Update {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost@1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				String SQL = "UPDATE exam_emp SET deptno = 80 WHERE empno = 7202";
				
				pstmt = con.prepareStatement(SQL);
				
				int result = pstmt.executeUpdate();
				
				if(result > 0) {
					System.out.println("업데이트 성공");
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