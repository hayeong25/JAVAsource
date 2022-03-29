package exam;

public class MemberService {
	
	// 멤버변수 : id, password
	private String id;
	private String password;
	
	// default 생성자
	public MemberService() {
		
	}
	
	// 로그인 메소드
	// boolean return. id와 password 받아서 id가 hong이고 password가 12345이면 true
	boolean login(String id, String password) {
		if((id.equals("hong") && (password.equals("12345")))) {
			return true;
		}else {
			return false;
		}
	}
	
	// 로그아웃 메소드
	// 매개변수(인자) 없음, return 없음, 로그아웃 되었습니다 메시지 출력
	void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
}