package api;

/*
	Object
	equals() : 두 객체간 주소(stack) 비교
	단, String 클래스에서는 값(Overriding) 비교
*/

public class ObjectEx {
	public static void main(String[] args) {
		
		// 객체 생성
		Object obj1 = new Object();
		Object obj2 = new Object();		
		
		// 메소드 호출
		// equals : 주소(stack) 비교
		if(obj1.equals(obj2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		// == : 주소(stack) 비교
		if(obj1 == obj2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		// toString() : 생성된 객체의 패키지.클래스@주소
		System.out.println("obj1.toString() : " + obj1.toString());
		System.out.println("obj2.toString() : " + obj2.toString());
		
		// 값(heap) 비교 - equals() 재정의
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2) ? "같다" : "다르다");
		System.out.println(value1.toString());
		System.out.println(value1); // toString() 안 붙여도 동일한 결과 출력됨
		
	}
}