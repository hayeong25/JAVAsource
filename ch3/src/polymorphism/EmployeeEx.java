package polymorphism;

// 다형성

public class EmployeeEx {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setName("찬료리");
		employee1.setPosition("사원");
		work(employee1);
		
		System.out.println();
		
		// Employee employee2 = new Ceo();
		Ceo employee2 = new Ceo();
		employee2.setName("곰탱이");
		employee2.setPosition("대리");
		work(employee2);
		
		System.out.println();
		
		// Employee employee3 = new PartTime();
		PartTime employee3 = new PartTime();
		employee3.setName("꼬물이");
		employee3.setPosition("주임");
		work(employee3);
		
		System.out.println();
		
		// Employee employee4 = new Adminstrator();
		Adminstrator employee4 = new Adminstrator();
		employee4.setName("애기");
		employee4.setPosition("과장");
		work(employee4);
		
	}
	
	// 매개변수의 다형성
	public static void work(Employee employee1) {
//		Employee employee1 = employee1;
//		Employee employee1 = employee2; == Employee employee1 = new Ceo();
//		Employee employee1 = employee3; == Employee employee1 = new PartTime();
//		Employee employee1 = employee4; == Employee employee1 = new Adminstrator();
		employee1.work();
	}
	
}