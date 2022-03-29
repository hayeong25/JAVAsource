package api;

// Math.random() 이용해 1 ~ 3 사이의 난수 3개 출력

public class MathEx3 {
	public static void main(String[] args) {
		
		while(true) {
			int number1 = (int) (Math.random() * 3 + 1);
			int number2 = (int) (Math.random() * 3 + 1);
			int number3 = (int) (Math.random() * 3 + 1);
			
			System.out.print(number1 + " " + number2 + " " + number3);
			
			System.out.println();
			
			if(number1 == number2 && number2 == number3) {
				System.out.println("BINGO!");
				break;
			}
			
		}
		
	}
}