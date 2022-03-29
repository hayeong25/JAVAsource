package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Set으로 로또 번호 산출하기

public class SetEx2 {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; set.size() < 6; i++) { // set size를 6으로 정해놓고 중복 숫자가 들어가면 Set 특성 상 추가되지 않기 때문에 i < 6 조건 불가
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);
		}
		
		System.out.println(set);
		
		// 정렬한 후 출력
		// Set을 List로 변환 후 sort
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		
	}
}