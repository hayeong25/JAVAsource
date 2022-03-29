package classtest;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.company = "현대";
		car.modelName = "아반떼";
		car.color = "white";
		car.maxSpeed = 200;
		
		System.out.println("제조회사 : " + car.company);
		System.out.println("모델 : " + car.modelName);
		System.out.println("색상 : " + car.color);
		
		car.forward();
	}
}
