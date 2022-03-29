package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JSP");
		list.add("HTML");
		list.add("CSS");
		list.add("MyBatis");
		
		// 배열 형태가 아닌 원하는 형태로 출력하려면 for문 사용
		// array.length() == list.size()
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		for(String s : list) {
			System.out.print(s + " ");
		}
		
	}
}
