package classtest;

public class NumbersEx {
	public static void main(String[] args) {
		
		// Numbers(배열) 인자 받기 때문에 임의로 int 배열 선언
		int num[] = {15, 35, 25, 99, 26, 33};
		
		// Numbers 객체 생성
		Numbers numbers = new Numbers(num);
		
		// 합계 평균 구하기
		System.out.println("합계 = " + numbers.getTotal());
		System.out.printf("평균 = %.2f", numbers.getAverage());
		
	}
}