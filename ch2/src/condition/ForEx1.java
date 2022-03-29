package condition;

// 반복문 : 어떤 작업이 반복적으로 실행되도록 할 때 사용 - for / while / do~ while
// 조건이 맞지 않으면 한 번도 실행되지 않는다

/*
	for(int i = 0; i < 반복 횟수; i 증감) {
		실행할 문장
	}
*/

public class ForEx1 {
	public static void main(String[] args) {
		
		// 안녕하세요 10번 출력하기
		for (int i = 0; i < 10; i++) {
			// ① int i = 0;
			// ② i < 10 가 true인 경우에만 for문 실행
			// ③ for 블럭 안으로 진입 >> {} 안 구문 실행
			// ④ i++ >> i = 1
			// ⑤ i < 10;
			// ⑥ for 블럭 안으로 진입 >> {} 안 구문 실행
			// ⑦ i++ >> i = 2
			// ⑧ i < 10;
			// ⑨ for 블럭 안으로 진입 >> {} 안 구문 실행
			// ...
			// i++ >> i = 10
			// i < 10 >> false가 되는 순간 반복문 종료
			System.out.println("안녕하세요.");
		}
		
	}
}