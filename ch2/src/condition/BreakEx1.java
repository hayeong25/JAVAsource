package condition;

public class BreakEx1 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) {
				break; // 반복문 벗어나기
			}
			++i;
			sum += i;
		}
		
		System.out.println("i =" + i);
		System.out.println("sum = " + sum);
		
	}
}