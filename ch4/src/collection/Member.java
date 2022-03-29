package collection;

public class Member {
	
	// 멤버변수
	private String id;
	private String name;
	private String password;
	
	// 생성자
	public Member(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	// getter
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
	// setter
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	// toString() Overriding
	@Override
	public String toString() {
		return "Member [id = " + id + ", name = " + name + ", password = " + password;
	}
	
	// Set에서 중복 저장 안 되도록
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return this.id.equals(member.id);
		}
		return false;
	}
	
}