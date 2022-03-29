package operation;

// 변수명은 소문자로 시작(대소문자 구별)
// 2개 이상의 단어가 붙을 경우 첫 글자는 대문자 ex) fileName

public class Pencil {
	public static void main(String[] args) {
		int pencil = 534;
		int student = 30;
		
		int result = pencil / student;
		int left = pencil % student;
		
		System.out.println("학생들은 " + result + "자루씩 가질 수 있습니다.");
		System.out.println("연필은 " + left + "자루 남습니다.");
	}
}