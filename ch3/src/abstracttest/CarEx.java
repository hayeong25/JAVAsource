package abstracttest;

public class CarEx {
	public static void main(String[] args) {
		
		// 추상 클래스는 직접적으로 객체 생성 불가
		// Car car = new Car(); >> Cannot instantiate the type Car
		
		Car car = new SportsCar();
		
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
		
		System.out.println();
		
		car = new Truck();
		
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
		
	}
}