package operation;

// 논리 연산자 : 결과가 true, false
// && : 논리 곱 (and)
// || : 논리 합 (or)
// ! : 부정 (not)

public class LogicalOperatorEx1 {
	public static void main(String[] args) {
		boolean result = (5 > 3) && (5 > 2);
		System.out.println(result);
		
		result = (5 > 3) || (5 < 2); // Dead code : 죽은 코드, 아무 의미 없는 코드. 앞이 이미 true이기 때문에 뒤는 상관없음
		System.out.println(result);
	}
}