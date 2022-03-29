package classtest;

public class StudentEx2 {
	public static void main(String[] args) {
		// 생성자에서 지정한 매개변수 순서대로 생성해야한다.
		// public Student2(int studentId, String studentName)
		Student2 student_default = new Student2();
		System.out.println("sutdent_default > 학번 : " + student_default.studentId + " / 이름 : " + student_default.studentName);
		System.out.println("sutdent_default > 주소 : " + student_default.address + " / 전화번호 : " + student_default.mobile);
		System.out.println();
		Student2 student_args2 = new Student2(20220307, "홍길동");
		System.out.println("student_args2 > 학번 : " + student_args2.studentId + " / 이름 : " + student_args2.studentName);
		System.out.println("sutdent_args2 > 주소 : " + student_args2.address + " / 전화번호 : " + student_args2.mobile);
		System.out.println();
		Student2 student_args2_reverse = new Student2("고길동", 20200307);
		System.out.println("student_args2_reverse > 학번 : " + student_args2_reverse.studentId + " / 이름 : " + student_args2_reverse.studentName);
		System.out.println("sutdent_args2_reverse > 주소 : " + student_args2_reverse.address + " / 전화번호 : " + student_args2_reverse.mobile);
		System.out.println();
		Student2 student_args3 = new Student2(20210203, "성춘향", "강남");
		System.out.println("student_args3 > 학번 : " + student_args3.studentId + " / 이름 : " + student_args3.studentName);
		System.out.println("sutdent_args3 > 주소 : " + student_args3.address + " / 전화번호 : " + student_args3.mobile);
		System.out.println();
		Student2 student_args4 = new Student2(20210905, "이몽룡", "충북", "010-0000-1111");
		System.out.println("student_args4 > 학번 : " + student_args4.studentId + " / 이름 : " + student_args4.studentName);
		System.out.println("sutdent_args4 > 주소 : " + student_args4.address + " / 전화번호 : " + student_args4.mobile);
		
	}
}
