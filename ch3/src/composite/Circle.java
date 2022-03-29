package composite;

// 포함 관계 : 한 클래스의 멤버 변수로 다른 클래스 타입의 참조 변수 선언
// 한 클래스 안에 다른 클래스가 포함되는 관계

// 원은 점이다 : is-a
// 원은 점을 가지고 있다 : has-a

public class Circle {

//	int x;
//	int y;
	
	// Point 클래스에 x, y 존재
	Point p; // Point p = new Point();
	int r;
	
	public Circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}
	
}