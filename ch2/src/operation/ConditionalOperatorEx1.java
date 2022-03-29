package operation;

// 삼항 연산자 : 조건 ? 참일 때 수행 : 거짓일 때 수행

public class ConditionalOperatorEx1 {
	public static void main(String[] args) {
		
		int score = 85;
		
		char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'C'); // 삼항 연산자 속에 삼항 연산자 가능
		
		System.out.println(score + "점은 " + grade + "입니다.");
	}
}