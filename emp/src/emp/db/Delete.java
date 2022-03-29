package emp.db;

import java.sql.*;

public class Delete {
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
				String sql = "DELETE FROM exam_emp WHERE empno = 7209";
				pstmt = con.prepareStatement(sql);
				int result = pstmt.executeUpdate();
				
				if(result > 0) {
					System.out.println("삭제 성공");
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