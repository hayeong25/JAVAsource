package emp.db;

import java.sql.*;

// JDBC

public class Connect {
	public static void main(String[] args) {
		
		// DB 서버와 연결
		
		try {
			// Driver load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// DB 연결을 위한 문자열 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			// Driver Manager를 통해 연결 시도
			Connection con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				System.out.println("연결 성공");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}