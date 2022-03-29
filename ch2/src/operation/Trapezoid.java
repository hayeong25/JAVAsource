package operation;

// 사다리꼴 넓이 구하기

public class Trapezoid {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int h = 7;
		
		double area = (double)((x + y) * h) / 2;
		System.out.println("사다리꼴의 넓이는 " + area + "입니다.");
	}
}