package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ciro", "찬료리", "ciro123"));
		set.add(new Member("gom", "곰탱이", "gom123"));
		set.add(new Member("ggomul", "꼬물이", "ggomul123"));
		set.add(new Member("man", "아죠씨", "man123"));
		set.add(new Member("gom", "곰탱이", "gom123"));
		
		// 사용자가 만든 객체(Member) Set은 중복 값이 들어가게 됨 >> Member 클래스에서 중복 값 제거하는 메소드 Overriding 필요
		
		System.out.println(set);
		
	}
}
