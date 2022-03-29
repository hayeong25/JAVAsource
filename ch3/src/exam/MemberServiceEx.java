package exam;

public class MemberServiceEx {
	public static void main(String[] args) {
		
		// MemberService 객체 생성
		MemberService service = new MemberService();
		
		// login 메소드 호출
		boolean result = service.login("hong", "12346");
		
		// 메소드 호출 결과 true인 경우 "로그인 되었습니다" 메시지 출력
		// false인 경우 "id 또는 password가 올바르지 않습니다" 메시지 출력
		if(result) {
			System.out.println("로그인 되었습니다.");
			service.logout();
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다");
		}
		
	}
}