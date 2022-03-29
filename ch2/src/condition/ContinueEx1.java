package condition;

// continue : 반복문과 함께 쓰이며 continue 이후의 문장은 실행하지 않음

public class ContinueEx1 {
	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			if(i % 3 == 0) {
				continue; // 건너뛰기, 처음으로 돌아가기 같은 역할
			}
			System.out.println(i);
		}
		
	}
}