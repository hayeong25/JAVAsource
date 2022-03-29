package classtest;

public class Triangle {
	
	// 속성 - 밑변(int), 높이(int)
	int baseLine;
	int height;
	
	public Triangle(int baseLine, int height) {
		super();
		this.baseLine = baseLine;
		this.height = height;
	}

	// 기능 - 면적을 구한다
	// return 타입이 double인 메소드 생성
	double getArea() {
//		double area = baseLine * height / 2;
//		return area;
		
		return baseLine * height / 2;
	}
	
}