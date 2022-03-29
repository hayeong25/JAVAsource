package emp.util;

import java.util.List;
import java.util.Scanner;
import emp.dto.EmpDTO;

public class ConsoleUtil {
	
	// 추가할 사원 정보 입력받는 메소드
	public EmpDTO getNewEmp(Scanner scanner) {
		System.out.println("추가할 사원 정보 입력");
		
		EmpDTO insertDTO = new EmpDTO();
		System.out.print("사원 번호 : ");
		insertDTO.setEmpno(Integer.parseInt(scanner.nextLine()));
		System.out.print("사원명 : ");
		insertDTO.setEname(scanner.nextLine());
		System.out.print("직급 : ");
		insertDTO.setJob(scanner.nextLine());
		System.out.print("매니저 번호 : ");
		insertDTO.setMgr(Integer.parseInt(scanner.nextLine()));
		System.out.print("급여 : ");
		insertDTO.setSal(Integer.parseInt(scanner.nextLine()));
		System.out.print("추가수당 : ");
		insertDTO.setComm(Integer.parseInt(scanner.nextLine()));
		System.out.print("부서 번호 : ");
		insertDTO.setDeptno(Integer.parseInt(scanner.nextLine()));
		
		return insertDTO;
	}
	
	public void printAddSuccessMessage(EmpDTO newEmp) {
		System.out.println(newEmp.getEname() + " 사원 정보 추가 성공");
	}
	
	public void printAddFailMessage(EmpDTO newEmp) {
		System.out.println(newEmp.getEname() + " 사원 정보 추가 실패");
	}
	
	public void printEmpList(List<EmpDTO> list) {
		System.out.println("====================== 사원 정보 ======================");
		System.out.println("사원번호\t사원명\t직급\t매니저번호\t입사일\t급여\t추가수당\t부서번호");
		for(EmpDTO dto : list) {
        	System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d\n", dto.getEmpno(), dto.getEname(), dto.getJob(), dto.getMgr(), dto.getHiredate(), dto.getSal(), dto.getComm(), dto.getDeptno());
        }
	}
	
	// 조회할 사원의 번호 입력받기
	public int printRowMessage(Scanner scanner) {
		System.out.print("조회할 사원 번호 입력 >> ");
		int empno = Integer.parseInt(scanner.nextLine());
		
		return empno;
	}
	
	public void printEmpMessage(EmpDTO dto) {
		System.out.println("====================== 사원 정보 ======================");
		System.out.println("사원번호\t사원명\t직급\t입사일\t부서번호");
		System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d\n", dto.getEmpno(), dto.getEname(), dto.getJob(), dto.getHiredate(), dto.getDeptno());
	}
	
	public EmpDTO getUpdateEmp(Scanner scanner) {
		EmpDTO dto = new EmpDTO();
		
		System.out.print("수정할 사원 번호 입력 >> ");
		dto.setEmpno(Integer.parseInt(scanner.nextLine()));
		System.out.print("변경할 매니저 번호 입력 >> ");
		dto.setMgr(Integer.parseInt(scanner.nextLine()));
		
		return dto;
	}
	
	public void printUpdateSuccessMessage(EmpDTO updateEmp) {
		System.out.println(updateEmp.getEmpno() + " 사원 정보 수정 성공");
	}
	
	public void printUpdateFailMessage(EmpDTO updateEmp) {
		System.out.println(updateEmp.getEmpno() + " 사원 정보 수정 실패");
	}
	
	public int removeEmpno(Scanner scanner) {
		System.out.print("탈퇴할 사원 번호 입력 >> ");
		int empno = Integer.parseInt(scanner.nextLine());
		return empno;
	}
	
	public void printRemoveSuccessMessage(EmpDTO updateEmp) {
		System.out.println(updateEmp.getEmpno() + " 사원 정보 삭제 성공");
	}
	
	public void printRemoveFailMessage(EmpDTO updateEmp) {
		System.out.println(updateEmp.getEmpno() + " 사원 정보 삭제 실패");
	}
}