package api;

public class CharAt {
	public static void main(String[] args) {
		
		String str1 = "자바 프로그래밍";
		
		// index는 0부터 시작
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(3));
		System.out.println(str1.charAt(7));
		
		// str2 문자열을 char 배열로 생성하고 출력
		String str2 = "Hello!! Java";
		char chArr[] = new char[str2.length()];
		for(int i = 0; i < str2.length(); i++) {
			chArr[i] = str2.charAt(i);
		}
		System.out.println(chArr);
		
		// 문자열에 "프"가 들어가는지 확인하는 프로그램 작성
		boolean status = false;
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == '프') {
				status = true;
				break;
			}
		}
		System.out.println(status? "해당 문자가 들어있음" : "해당 문자가 없음");
		
	}
}