package polymorphism;

public class Employee {
	
	// 속성 - 이름, 직위
	private String name;
	private String position;
	
	// 기능 - work 메소드
	public void work() {
		System.out.println(name + " " + position + "이(가) 일한다.");
	}

	// getter
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}