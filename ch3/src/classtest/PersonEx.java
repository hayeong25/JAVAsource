package classtest;

public class PersonEx {
	public static void main(String[] args) {
		
		Person person = new Person("220308-1234567", "찬료리");
		
		System.out.println("국적 : " + person.nation);
		System.out.println("주민번호 : " + person.ssn);
		System.out.println("이름 : " + person.name);
		
		System.out.println();
		
		person.name = "곰탱이";
		System.out.println("변경 후 이름 : " + person.name);
		
		// ssn은 final 변수이므로 수정 불가
		// person.ssn = "950901-1234567";
		
	}
}