package condition;

/*
	if(조건문) {
		수행할 문장;
	} else {
		조건문이 거짓일 때 수행할 문장;
	}
*/

public class IfEx2 {
	public static void main(String[] args) {
		
		int score = 90;
		
//		if(score >= 90) {
//			
//		}
//		if(score < 90) { >> 조건 검사 2번하게 되므로 효율성 저하
//			
//		}
		
		if(score >= 90) {
			System.out.println("90점 이상입니다.");
			System.out.println("A등급입니다.");
		} else {
			System.out.println("90점 미만입니다.");
			System.out.println("B등급입니다.");
		}
		
	}
}