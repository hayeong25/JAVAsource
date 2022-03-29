package emp.console;

import java.util.List;
import java.util.Scanner;
import emp.dto.DTO;

/*
	사용자가 menu 선택 후
	console창에 뜨는 모든 메시지 설정하는 클래스
*/

public class Console {
	
/*------------------------- 사원 전체 목록 -------------------------*/
	public void ShowAll(List<DTO> list) {
		System.out.println("================================");
		System.out.println("사원번호\t사원명\t직급\t매니저번호\t입사일\t급여\t추가수당\t부서번호");
		for(DTO dto : list) {
			System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d", dto.getEmpno(), dto.getEname(), dto.getJob(), dto.getMgr(), dto.getHiredate(), dto.getSal(), dto.getComm(), dto.getDeptno());
		}
	}
	
/*------------------------- 사원 조회 -------------------------*/
	public int SelectEmpno(Scanner scanner) {
		System.out.print("조회할 사원 번호 : ");
		return Integer.parseInt(scanner.nextLine());
	}
	
	public void Show(DTO dto) {
		System.out.println("================================");
		System.out.println("사원번호\t사원명\t직급\t매니저번호\t입사일\t급여\t추가수당\t부서번호");
		System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d", dto.getEmpno(), dto.getEname(), dto.getJob(), dto.getMgr(), dto.getHiredate(), dto.getSal(), dto.getComm(), dto.getDeptno());
	}
	
/*------------------------- 사원 추가 -------------------------*/
	public DTO AddEmpno(Scanner scanner) {
		System.out.println("추가할 사원 정보 입력");
		
		DTO dto = new DTO();
		System.out.print("사원 번호 : ");
		dto.setEmpno(Integer.parseInt(scanner.nextLine()));
		System.out.print("사원명 : ");
		dto.setEname(scanner.nextLine());
		System.out.print("직급 : ");
		dto.setJob(scanner.nextLine());
		System.out.print("매니저 번호 : ");
		dto.setMgr(Integer.parseInt(scanner.nextLine()));
		System.out.print("급여 : ");
		dto.setSal(Integer.parseInt(scanner.nextLine()));
		System.out.print("추가수당 : ");
		dto.setComm(Integer.parseInt(scanner.nextLine()));
		System.out.print("부서 번호 : ");
		dto.setDeptno(Integer.parseInt(scanner.nextLine()));
		
		return dto;
	}
	
	public void printAddSuccessMesssage(DTO dto) {
		System.out.println(dto.getEname() + " 사원 추가 성공");
	}
	
	public void printAddFailMesssage(DTO dto) {
		System.out.println(dto.getEname() + " 사원 추가 실패");
	}
	
/*------------------------- 사원 변경 -------------------------*/
	public DTO UpdateEmpno(Scanner scanner) {
		DTO dto = new DTO();
		System.out.print("변경할 사원 번호 : ");
		dto.setEmpno(Integer.parseInt(scanner.nextLine()));
		System.out.print("변경할 매니저 번호 : ");
		dto.setMgr(Integer.parseInt(scanner.nextLine()));
		
		return dto;
	}
	
	public void printUpdateSuccessMessage(DTO dto) {
		System.out.println(dto.getEname() + " 사원 정보 변경 성공");
	}
	
	public void printUpdateFailMessage(DTO dto) {
		System.out.println(dto.getEname() + " 사원 정보 변경 실패");
	}
	
/*------------------------- 사원 삭제 -------------------------*/
	public int DeleteEmpno(Scanner scanner) {
		System.out.print("삭제할 사원 번호 : ");
		return Integer.parseInt(scanner.nextLine());
	}
	
	public void printDeleteSuccessMessage(DTO dto) {
		System.out.println(dto.getEname() + " 사원 삭제 성공");
	}
	
	public void printDeleteFailMessage(DTO dto) {
		System.out.println(dto.getEname() + " 사원 삭제 실패");
	}
}