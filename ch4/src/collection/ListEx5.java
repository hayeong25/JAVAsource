package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx5 {
	public static void main(String[] args) {
		
		List<Member> list = new ArrayList<Member>();
		
		list.add(new Member("ciro", "찬료리", "ciro123"));
		list.add(new Member("gom", "곰탱이", "gom123"));
		list.add(new Member("ggomul", "꼬물이", "ggomul123"));
		list.add(new Member("man", "아죠씨", "man123"));
		
		System.out.println(list);
		
		System.out.println();
		
		for(Member member : list) {
			System.out.println(member.getId() + "\t" + member.getName() + "\t" + member.getPassword());
		}
		
	}
}