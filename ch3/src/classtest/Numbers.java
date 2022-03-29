package classtest;

public class Numbers {
	
	int num[];

	public Numbers(int[] num) {
		super();
		this.num = num;
	}
	
	// 합계 구하는 메소드
	int getTotal() {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	// 평균 구하는 메소드
	double getAverage() {
		return (double)getTotal() / num.length;
		// getTotal은 int이기 때문에 소수점까지 나오게 하고 싶으면 double로 형변환
	}
	
}