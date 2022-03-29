package api;

/*
	StringBuilder : 문자열 클래스, 싱글 스레드
	StringBuffer : 문자열 클래스, 멀티 스레드
	String 클래스와 달리 내용 변경 가능 >> append, insert, delete
*/

public class StringBuilderEx {
	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("Hello Java");
		builder.append(" 안녕하세요");
		// builder = " 안녕하세요"; 는 불가
		System.out.println(builder); // Hello Java 안녕하세요
		
		System.out.println(builder.delete(0, 2)); // llo Java 안녕하세요
		System.out.println(builder); // llo Java 안녕하세요 >> 원래 문자열이 변경된 채로 저장됨
		
		builder.insert(2, "T");
		System.out.println(builder); // llTo Java 안녕하세요
		
		StringBuilder builder1 = new StringBuilder("Hello");
		StringBuilder builder2 = new StringBuilder("Hello");
		
		System.out.println(builder1.equals(builder2)); // equals() Overriding 안 되어 있어서 결과값은 false
		
		String str1 = new String(builder1);
		String str2 = new String(builder2);
		
		System.out.println(str1.equals(str2));
	}
}