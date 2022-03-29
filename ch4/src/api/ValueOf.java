package api;

// String.valueOf() : 괄호 안의 타입을 String으로 만들어줌

public class ValueOf {
	public static void main(String[] args) {
		
		String a = String.valueOf(false);
		System.out.println(a); // "false"
		
		String b = String.valueOf('b');
		System.out.println(b); // "b"
		
		String c = String.valueOf(10f);
		System.out.println(c); // "10.0"
		
		String d = String.valueOf(10L);
		System.out.println(d); // "10"
		
		// String >> boolean
		Boolean.parseBoolean(a);
		
		// String >> int
		Integer.parseInt(d);
		
		// String >> float
		Float.parseFloat(c);
	}
}