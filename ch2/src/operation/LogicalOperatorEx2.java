package operation;

// == : 같다
// != : 같지 않다
// = : 대입

public class LogicalOperatorEx2 {
	public static void main(String[] args) {
		
		int charCode = 'A';
		
		if((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자");
		}
		
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("숫자");
		}
		
		int value = 6;
		if((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수입니다.");
		}
	}
}