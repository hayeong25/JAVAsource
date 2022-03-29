package api;

public class SystemEx {
	public static void main(String[] args) {
		
		long sum = 0;
		long start = System.currentTimeMillis();
		
		for(int i = 1; i < 10000000; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("1 ~ 10,000,000의 합 : " + sum);
		System.out.println("1 ~ 10,000,000의 합을 구하는 데 걸리는 시간 : " + (end - start) + "ms"); // ms : 1000분의 1초
		
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(i + "\t");
			if(i == 5) {
				System.exit(0); // 프로그램 종료
			}
		}
		
	}
}