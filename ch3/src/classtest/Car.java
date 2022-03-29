package classtest;

public class Car {
	
	// 속성(property, 필드, attribute) - 제조회사, ...
	String company;
	String modelName;
	String color;
	int maxSpeed;
	
	// 기능 - 전진한다
	void forward() {
		System.out.println("forward");
	}

	// 기능 - 후진한다
	void backward() {
		System.out.println("backward");
	}
}
