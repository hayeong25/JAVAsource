package collection;

/*
	ArrayList, Vector 단점 : 크기 변경, 비순차적인 데이터의 수가 및 삭제에 시간이 많이 걸림
	>> LinkedList : 빈번한 삽입이 일어나는 곳에서는 ArrayList보다 성능이 좋음
					배열처럼 칸칸에 일렬로 들어있는 게 아니라 여기저기 떨어져있는데 각각 다음 칸의 주소를 갖고 있기 때문에 중간 요소가 사라지면 자동으로 그 다음 요소를 가리키는 주소로 변경됨
*/

import java.util.LinkedList;
import java.util.List;

public class ListEx7 {
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("사과");
		list.add("포도");
		list.add("메론");
		list.add("바나나");
		list.add("수박");
		list.add("참외");
		System.out.println(list);
		
		
		
	}
}