package member.util;

import java.util.*;
import member.dto.MemberDTO;

public class ConsoleUtil {
	
/* ------------------------- Member 추가 ------------------------- */
	public MemberDTO getNewMember(Scanner scanner) {
		
		System.out.println("Member 정보를 입력해주세요");
		System.out.println("=====================");
		System.out.print("name : ");
		String name = scanner.nextLine();
		System.out.print("addr : ");
		String addr = scanner.nextLine();
		System.out.print("email : ");
		String email = scanner.nextLine();
		System.out.print("age : ");
		int age = Integer.parseInt(scanner.nextLine());
		
		return new MemberDTO(name, addr, email, age);
	}

	public void printAddSuccessMessage(MemberDTO insertDTO) {
		System.out.println(insertDTO.getName() + " 회원 추가 성공");
	}
	
	public void printAddFailMessage(MemberDTO insertDTO) {
		System.out.println(insertDTO.getName() + " 회원 추가 성공");
	}
	
/* ------------------------- Member 조회 ------------------------- */
	public void printListMessage(List<MemberDTO> list) {
		System.out.println("---------------- Member List ----------------");
		System.out.println("ID\tNAME\tADDRESS\tEMAIL\t\tAGE");
		System.out.println("---------------------------------------------");
		for(MemberDTO dto : list) {
			System.out.printf("%d\t%s\t%s\t%s\t%d\n", dto.getId(), dto.getName(), dto.getAddr(), dto.getEmail(), dto.getAge());
		}
		System.out.println("---------------------------------------------");
	}
	
/* ------------------------- Member 수정 ------------------------- */
	public int printModifyIdMessage(Scanner scanner) {
		System.out.println("아이디를 입력해주세요");
		System.out.print(">> ");
		
		int id = Integer.parseInt(scanner.nextLine());
		
		return id;
	}
	
	public int printModifyMessage(Scanner scanner) {
		System.out.println("수정 항목을 선택해주세요");
		System.out.println("1. 주소");
		System.out.println("2. 이메일");
		System.out.print(">> ");
		
		int no = Integer.parseInt(scanner.nextLine());
		
		return no;
	}
	
	public String printModifyValueMessage(Scanner scanner) {
		System.out.println("수정 내용을 입력해주세요");
		System.out.print(">> ");
		
		String input = scanner.nextLine();
		
		return input;
	}
	
	public void printModifySuccessMessage() {
		System.out.println("회원 정보 수정 성공");
	}
	
	public void printModifyFailMessage() {
		System.out.println("회원 정보 수정 실패");
	}

/* ------------------------- Member 삭제 ------------------------- */
	public int printRemoveIdMessage(Scanner scanner) {
		System.out.println("삭제할 아이디를 입력해주세요");
		System.out.print(">> ");
		
		return Integer.parseInt(scanner.nextLine());
	}
	
	public void printRemoveSuccessMessage() {
		System.out.println("회원 삭제 성공");
	}
	
	public void printRemoveFailMessage() {
		System.out.println("회원 삭제 실패");
	}
	
}