package member.dao;

import java.sql.*;
import java.util.*;
import member.dto.MemberDTO;
import static member.dao.JdbcUtil.*;

/*
	C : INSERT
	R : SELECT
	U : UPDATE
	D : DELETE
*/

public class MemberDAO {
	
	private Connection con;

	public MemberDAO(Connection con) {
		super();
		this.con = con;
	}
	
/* ----------------------------- C (INSERT) ----------------------------- */
	public boolean insert(MemberDTO insertDTO) {
		
		PreparedStatement pstmt = null;
		String SQL = "INSERT INTO member(id, name, addr, email, age) VALUES(member_seq.NEXTVAL, ?, ?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, insertDTO.getName());
			pstmt.setString(2, insertDTO.getAddr());
			pstmt.setString(3, insertDTO.getEmail());
			pstmt.setInt(4, insertDTO.getAge());
			
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

/* ----------------------------- R (SELECT) ----------------------------- */
	public List<MemberDTO> getList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		String SQL = "SELECT * FROM member";
		
		try {
			pstmt = con.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				dto.setEmail(rs.getString("email"));
				dto.setAge(rs.getInt("age"));
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
	
/* ----------------------------- U (UPDATE) ----------------------------- */
	public boolean update(int no, String input, int id) {
		PreparedStatement pstmt = null;
		String SQL = "";
		
		try {
			if(no == 1) {
				SQL = "UPDATE member SET addr = ? WHERE id = ?";
			}else {
				SQL = "UPDATE member SET email = ? WHERE id = ?";
			}
			
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, input);
			pstmt.setInt(2, id);
			
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

/* ----------------------------- D (DELETE) ----------------------------- */
	public boolean remove(int id) {
		PreparedStatement pstmt = null;
		String SQL = "DELETE FROM member WHERE id = ?";
		
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setInt(1, id);
			
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