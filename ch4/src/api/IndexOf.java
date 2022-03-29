package api;

// indexOf : 해당 문자열이 가장 처음에 나오는 인덱스 return (문자열 포함 여부)
// 없을 경우 -1 반환
// lastIndextOf : 해당 문자열이 가장 나중에 나오는 인덱스 return

public class IndexOf {
	public static void main(String[] args) {
		
		String str1 = "자바 프로그래밍";
		
		int position = str1.indexOf("프");
		System.out.println(position);
		System.out.println(str1.indexOf("곰"));
		
		if(str1.indexOf("자바") == -1) {
			System.out.println("자바 문자열 없음");
		}else {
			System.out.println("자바 문자열 있음");
		}
		
		String str2 = new String("HelloHelloHello World");
		System.out.println(str2.indexOf("o"));
		System.out.println(str2.lastIndexOf("o"));
		
		System.out.println(str2.indexOf("o", 6));
	}
}