package thread;

public class BigLetters {
	public static void main(String[] args) {
		
		// 같이 수행할 클래스 지정
		Thread t1 = new SmallLetters();
		t1.start(); // SmallLetters의 run()
		
		Runnable r = new NumPrint();
		Thread t2 = new Thread(r);
		t2.start();
		
		// 대문자 A ~ Z까지 출력
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		
	}
}