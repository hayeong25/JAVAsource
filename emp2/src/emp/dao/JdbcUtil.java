package emp.dao;

import java.sql.*;

/*
	emp, dept, salgrade 등 테이블마다 DAO 만들면 Connection이나 자원 close() 부분이 중복됨
	여러 개의 DAO 파일에서 중복되는 부분 처리하는 클래스
	
	클래스에서 new를 하지 않고 사용할 수 있도록 static 공간 안에 올림
*/
public class JdbcUtil {

/* ------------------------------- static ------------------------------- */
	static { // 클래스가 메모리에 올라가는 순간 Driver도 같이 올림
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
/* --------------------------- Connection 메소드 --------------------------- */
	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
         
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false); // 자동 commit 제한
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

/* ------------------------------- 자원 close ------------------------------- */
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
	
/* ------------------------------- COMMIT ------------------------------- */
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
/* ------------------------------- ROLLBACK ------------------------------- */
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}