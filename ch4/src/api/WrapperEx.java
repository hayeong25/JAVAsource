package api;

/*
	Wrapper 클래스 : 기본형 타입을 객체로 다루기 위한 클래스
	
	int >> Integer (Integer.parseInt())
	boolean >> Boolean
	byte >> Byte
	short >> Short
	char >> Character
*/

public class WrapperEx {
	public static void main(String[] args) {
		
		// Boolean b = new Boolean(true); >> 9 버전부터 지원 안 하는 형태
		Boolean b = Boolean.valueOf(true);
		
		// Integer i = new Integer(5); >> 9 버전부터 지원 안 하는 형태
		Integer i = Integer.valueOf(5);
		
		int i2 = 5;
		
		System.out.println(i == i2);
		// 값은 같지만 i는 객체, i2는 일반 정수 타입
		// 객체로 처리해야 하는 프로그램에서는 Integer로 써야 함
		
	}
}