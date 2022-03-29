package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	Map
	- key, value 구조
	- put(key, value), remove(key)
	- key : 중복 X
	- value : 중복 O
*/

public class MapEx {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		// 요소 추가
		map.put("id_0901", "찬료리");
		map.put("id_0913", "건대");
		map.put("id_0917", "곰탱이");
		map.put("id_0316", "오늘");
		
		System.out.println("id_09091 key에 해당하는 value 가져오기 " + map.get("id_09091"));
		System.out.println("id_0917 key가 존재하는지 확인하기 " + map.containsKey("id_0917"));
		System.out.println("건대 value가 존재하는지 확인하기 " + map.containsValue("건대"));
		System.out.println("Map이 비어있는지 확인하기 " + map.isEmpty());
		System.out.println("Map 크기 : " + map.size());
		System.out.println("Map 요소 삭제 : " + map.remove("id_0316"));
		
		System.out.println();
		
		// key 모두 가져오기
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		// value 모두 가져오기
		Collection<String> values = map.values();
		System.out.println(values);
		
		System.out.println();
		
		Iterator<String> keyIter = keys.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			String value = map.get(key);
			System.out.println(key + " " + value);
					;
		}
	}
}