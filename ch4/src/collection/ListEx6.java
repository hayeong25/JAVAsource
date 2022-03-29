package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx6 {
	public static void main(String[] args) {
		
		// ArrayList
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("딸기");
		list.add("바나나");
		list.add("키위");
		list.add("포도");
		System.out.println(list);
		
		System.out.println();
		
		// List를 배열로
		Object[] fruits = list.toArray();
		for(Object obj : fruits) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		// 배열을 List로
		String f[] = {"사과", "포도", "메론", "수박", "참외", "자두", "바나나"};
		List<String> list1 = Arrays.asList(f);
		System.out.println(list1);
		
		list1.add("딸기"); // java.lang.UnsupportedOperationException (Unchecked Exception / Runtime Exception)
		// 배열 그대로를 list로 변경한 경우 크기가 고정된 상태로 넘어온 것이기 때문에 add 불가능
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<String>(Arrays.asList(f));
		list2.add("딸기");
		System.out.println(list2);
	}
}