package classtest;

public class PhysicalInfo {
	
	// 속성 - 이름, 나이, 키, 몸무게
	String name;
	int age;
	double height;
	double weight;
	
	// 생성자 - 멤버변수 4개 모두 매개변수로 받는 형태
	public PhysicalInfo(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 기능 - age, height, weight 받아서 현재 age, height, weight 변경
	void update(int age) {
		this.age = age;
	}
	
	void update(int age, double height) {
		this.age = age;
		this.height = height;
	}
	
	void update(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
}