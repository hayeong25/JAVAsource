package collection;

import java.util.ArrayList;
import java.util.List;

/*
	List Interface
	- 순서가 있음
	- 데이터 중복 허용
	- 구현 클래스 : ArrayList, Vector, LinkedList, Stack, ...
	- 배열과 동일하지만 배열보다 향상된 버전. 사용하기 편리
*/

public class ListEx1 {
	public static void main(String[] args) {
		
		// List<객체> list명 = new ArrayList<객체>();
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(2); // 중복 가능
		System.out.println(list); // toString() 오버라이딩 된 상태 >> [1, 2, 3, 4, 5, 6, 2]
		
		list.add(3, 11);
		System.out.println(list); // 해당 인덱스 값이 삭제되는 게 아니라 뒤로 하나씩 밀리는 구조 >> [1, 2, 3, 11, 4, 5, 6, 2]
		
	}
}