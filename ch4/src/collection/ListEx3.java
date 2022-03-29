package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(3);
		System.out.println(list);
		
		// 정렬
		// 배열 정렬 시에는 Arrays.sort()
		// List 정렬 시에는 Collections.sort()
		Collections.sort(list);
		System.out.println(list);
		
		// 요소 삭제
		for(int i = list.size()-1; i >= 0; i--) {
			if(list.contains(list.get(i))) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}
}