package basic;

// 역슬래시(\)로 시작하는 문자는 Escape 문자로 인식
// \n : 줄 바꿈
// \t : tab

public class EscapeChar {
	public static void main(String[] args) {
		System.out.println("\n안녕하세요.");
		System.out.println("안녕하세요.\t반갑습니다.");
		System.out.println(" 'Hello' ");
		System.out.println("\"Hello\""); // 큰 따옴표 출력하려면 역슬래시 + 큰 따옴표
		System.out.println("C:\\"); // 역슬래시 표현하려면 역슬래시 * 2
		
		System.out.print("Hello\n");
		System.out.print("World!");
	}
}