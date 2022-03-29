package polymorphism;

// 다형성
// 부모클래스 클래스명 = new 자식클래스();

public class ChildEx {
	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		// 부모 자식 관계만 가능한 형태 (다형성)
		Parent parent = new Child(); // 범위 제한
//		Child2 child2 = new Child(); >> Type mismatch: cannot convert from Child to Child2
		
		// parent 변수가 접근 가능한 범위 : 부모 클래스 필드 & 메소드
		// 단, 오버라이딩 된 메소드가 있다면 자식 클래스의 메소드가 호출됨
		parent.method1();
		parent.method2();
		
		System.out.println();
		
		// 부모 클래스 = new 자식(); 만 가능
//		Child c = new Parent(); >> Type mismatch: cannot convert from Parent to Child
//		Child c = (Child)new Parent();
//		c.method1(); >>  java.lang.ClassCastException: class polymorphism.Parent cannot be cast to class polymorphism

	}
}