package collection;

import java.util.HashSet;
import java.util.Set;

/*
	Set Interface
	- 순서 없음
	- 중복 허용 X
	- 구현 클래스 : HashSet, TreeSet
*/

public class SetEx1 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		// 순서 없이 저장
		set.add("Java");
		set.add("JSP");
		set.add("Oracle");
		set.add("JDK");
		set.add("Servlet");
		set.add("Oracle"); // 중복 허용 안 함
		
		System.out.println(set);
		
	}
}