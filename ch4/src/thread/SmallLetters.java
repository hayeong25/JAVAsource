package thread;

/*
	멀티스레드
*/

public class SmallLetters extends Thread {
	
	// 소문자 a ~ z까지 출력
	@Override
	public void run() {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}
	}
	
}