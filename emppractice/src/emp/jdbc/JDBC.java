package emp.jdbc;

import java.sql.*;

/*
	모든 클래스에서 쓸 수 있도록 static으로
*/

public class JDBC {

/* --------------------JDBC Driver Class 등록(프로그램 최초 1회만 등록)-------------------------*/
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
/* -------------------- Oracle Driver Manager와 Connection 연결 -------------------------*/
	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
			String url = "oracle:jdbc:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false); // 자동 commit 해제 (실행 중 에러가 났을 경우 rollback 할 수 있도록)
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
/* -------------------- 자원 close 메소드 -------------------------*/
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
/* -------------------- commit 메소드 -------------------------*/
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

/* -------------------- rollback 메소드 -------------------------*/
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}