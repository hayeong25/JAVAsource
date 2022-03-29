package api;

public class MemberEx {
	public static void main(String[] args) {
		
		Member member1 = new Member("blue");
		Member member2 = new Member("blue");
		Member member3 = new Member("red");
		
		// 값 비교가 아닌 heap 주소 비교
		System.out.println(member1.equals(member2)); // false >> Member 클래스의 equals() 메소드 변경 시 true로 변환
		System.out.println(member1.equals(member3)); // false
		
		System.out.println("member1 : " + member1);
		System.out.println("member2 : " + member2);
		System.out.println("member3 : " + member3);
	}
}