package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	Iterator
	- Collection에 저장된 요소를 접근하는 데 사용하는 Interface
	- hasNext() : 더 읽어올 요소가 있는지 booelan
	- next() : 다음 요소 읽어오기
	- remove() : next()로 읽어온 요소 삭제
*/

public class IteratorEx {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(2);
		
		// List를 Iterator로
		Iterator<Integer> it = list.iterator();
		
		
	}
}