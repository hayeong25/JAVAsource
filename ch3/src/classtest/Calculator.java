package classtest;

public class Calculator {
	
	// 정사각형 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형 넓이
	// 메소드명은 같지만 매개변수 타입, 개수나 순서가 다를 경우 Method Overloading
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
}