package classtest;

// 가입자 정보 클래스

public class SubscriberInfo {
	
	// 속성 - 이름(문자&숫자 8자리), ID(문자&숫자&특수문자 15자리), PW, 연락처(000-0000-0000), 주소
	String name;
	String id;
	String password;
	String phone;
	String address;
	
	public SubscriberInfo() {
		super();
	}
	
	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public SubscriberInfo(String name, String id, String password, String phone, String address) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}

	// 기능 - 비밀번호를 변경한다 (새로운 비밀번호를 입력받아 기존 비밀번호 변경)
	void changePassword(String newPassword) {
		this.password = newPassword;
	}
	
	// 기능 - 연락처를 변경한다 (새로운 연락처를 입력받아 기존 연락처 변경)
	void changePhone(String newPhone) {
		this.phone = newPhone;
	}
	
	// 기능 - 주소를 변경한다 (새로운 주소를 입력받아 기존 주소 변경)
	void changeAddress(String newAddress) {
		this.address = newAddress;
	}
}