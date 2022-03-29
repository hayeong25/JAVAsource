package collection;

import java.util.List;
import java.util.Vector;

/*
	ArrayList와 Vector는 사용 방법 동일
	- ArrayList : 멀티 스레드  / Vector : 싱글 스레드
	- ArrayList : 동기화 X, 속도 빠름 / Vector : 동기화, 느림
	- ArrayList : 용량 변경 시 효율 떨어짐
	- 최대 인덱스 초과 시 ArrayList : 현재 배열 크기의 50% 추가 / Vector : 현재 배열 크기의 100% 추가
*/

public class ListEx4 {
	public static void main(String[] args) {
		
		List<String> list = new Vector<String>();
		
		list.add("1");
		list.add("3");
		list.add("5");
		list.add("7");
		System.out.println(list);
		
		list.clear();
		System.out.println("clear() 후 : " + list);
		
	}
}